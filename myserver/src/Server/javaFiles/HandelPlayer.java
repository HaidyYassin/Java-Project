/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.javaFiles;

/**
 *
 * @author yelbt
 */

import Server.javaFiles.HandelServer;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.Initializable;



public class HandelPlayer extends Thread implements Initializable {
   private HandelServer server;
   private DataInputStream dis;
   private PrintStream ps;
   private Socket currentSocket;
   private String DataFromPlayer,query;
   private String username,email,password;
   private StringTokenizer token;
   private Boolean loggedin;
   private Boolean updateList;   
   private ResultSet result;
   private Thread thread;
  
   
  
   static Vector<HandelPlayer> players = new Vector<HandelPlayer>(); 
   
   static HashMap<String,HandelPlayer> onlineGame = new HashMap(); 
   
   
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loggedin = false;
        System.out.println("initi");
        result = server.getResultSet();
    }

   public HandelPlayer(Socket socket){
       server = HandelServer.getServer();
       try {
            dis = new DataInputStream(socket.getInputStream());
            ps = new PrintStream(socket.getOutputStream());
            currentSocket = socket;
            this.start();
       }catch (IOException ex) {
           System.out.println("1");
            ex.printStackTrace();
            // alert 
           try {
               socket.close();
           } catch (IOException ex1) {
               Logger.getLogger(HandelPlayer.class.getName()).log(Level.SEVERE, null, ex1);
           }
       }
   }
    public void run(){
        while(currentSocket.isConnected()){
            try {
                DataFromPlayer = dis.readLine();
                System.out.println(DataFromPlayer);
                if(DataFromPlayer != null){
                    token = new StringTokenizer(DataFromPlayer,"####");
                    query = token.nextToken();
                    switch(query){
                        case "SignIn":
                            signIn();
                            break;
                        case "SignUp":
                            signUp();
                            break;
                        case "playerlist":
                            listOnlinePlayers();
                            break;
                        case "request":
                            requestPlaying();
                            break;
                        case "accept":
                            acceptChallenge();
                            break;
                        case "decline":
                            refusedChallenge();
                            break;
                        case "quit":
                            quit();
                            break;
                        case "newGame":
                            StartOfGame();
                            break;
                        case "endTheGame":
                            endOfGame();
                            break;
                        case "updateScore":
                            updateScore();
                            break;
                        case "logout":
                            logout();
                            break;
                        default :
                            break;
                    }
               }
            } catch (IOException ex) {
                System.out.println("2");
                System.out.println("Closing try");
                System.out.println("Email: "+ email);
                quit();

                if(email != null){
                    server.setActive(false,email);
                    players.remove(this);
                    

                }else{
                  
                   updateList = true;
                 }
                try {
                    currentSocket.close();
                } catch (IOException ex1) {
                    Logger.getLogger(HandelPlayer.class.getName()).log(Level.SEVERE, null, ex1);
                }
                this.stop();
            }
        }
        if(currentSocket.isClosed()){
            System.out.println("3");
            System.out.println("close");
            server.getOnlinePlayers();
        }
    }
   
   private void signIn(){
        email = token.nextToken();
        String password = token.nextToken();
        String check;
        int score;
        System.out.println(email+" "+password);
        try{
            check = server.checkSignIn(email, password);
            if(check.equals("Logged in successfully")){
                score = server.getScore(email);
                username = server.getUserName(email);
                server.login(email, password);
                ps.println(check +"###" + score);
                ps.println(username+"###"+email+"###"+score); 
                loggedin = true;
                players.add(this);
            }else if(check.equals("This Email is alreay sign-in")){
                System.out.println("alread in connected");
                ps.println(check +"###");
            }else if(check.equals("Email is incorrect")){
                ps.println(check +"###");
            }else if(check.equals("Password is incorrect")){
                ps.println(check +"###");
            }else if(check.equals("Connection issue, please try again later")){
                ps.println(check +"###");
            }
        }catch(SQLException e){
            //alert
            System.out.println("Connection Issues");
        }
        token = null;
   }
   
   private void signUp(){
        String username = token.nextToken();
        email = token.nextToken();
        String password = token.nextToken();
        System.out.println(username+" "+email+" "+password);
        String check;

       try{
            check = server.checkRegister(username, email);
            ps.println(check);
            if(check.equals("Registered Successfully")){
                ps.println(username+"###"+email); 
                server.SignUp(username,email,password);
                System.out.println("User is registered now , check database");   
                players.add(this);
            }else if (check.equals("already signed-up")){
                ps.println("already signed-up"+"###");
            }
       }catch(SQLException e){
           //alert
           e.printStackTrace();
           System.out.println("Connection Issues");
        }
   }
   
   private void listOnlinePlayers(){
      thread =  new Thread(new Runnable() {
        @Override
        public void run() {
            while(true){
                    
                    if(ServerFxmlBase.isServerOpen)
                    {
                       result = server.getOnlinePlayers();
                    try {
                        while(result.next()){
                            ps.println(result.getString("username")+"###"+
                                    result.getString("email")+"###"+
                                    result.getBoolean("isActive")+"###"+
                                    //result.getBoolean("isPlaying")+"###"+
                                    result.getInt("score")
                                );
                        }
                       ps.println("NoMorePlayer");
                    } catch (SQLException ex) {
                         ps.println("close");
                        thread.stop();
                        System.out.println("4");
                        System.out.println("catch");
                        Logger.getLogger(HandelPlayer.class.getName()).log(Level.SEVERE, null, ex);
                        break;
                    }
                   try {
                    Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HandelPlayer.class.getName()).log(Level.SEVERE, null, ex);
                        break;
                    }
                    }else{
                        ps.println("close");
                       thread.stop();
                    }
                     
                
            }
        }
    });
    thread.start();
   }
   
    private void requestPlaying(){  
        String player2Mail = token.nextToken(); 
        String player1Data = token.nextToken(""); 
        for(HandelPlayer i : players){
            if(i.email.equals(player2Mail)){
                System.out.println("sending request");
                i.ps.println("requestPlaying");
                i.ps.println(player1Data);
            }
        }      
    }
   
    private void acceptChallenge(){
        System.out.println("accepted");
        String player2 = token.nextToken(); 
        String player2Name = token.nextToken();
        String player1 = token.nextToken();
        HandelPlayer p1 = null,p2=null;
        for(HandelPlayer i : players){
            if(i.email.equals(player1)){
                p1 = i;
            }else if(i.email.equals(player2)){
                p2 = i;
            }
        }
        if(p1 == null || p2 == null){
            System.out.println("player is not exist.");
        }else{
            onlineGame.put(player1, p2);
            onlineGame.put(player2, p1);
            p1.ps.println("accept");
            p1.ps.println(player2Name);
            p1.ps.println(p2.server.getScore(p2.email));
        }
    }
   
    private void refusedChallenge(){
        System.out.println("refused");
        String contenderEmail = token.nextToken();
        for(HandelPlayer i : players){
            if(i.email.equals(contenderEmail)){
                i.ps.println("decline");
            }
        }
    }
    
    private void StartOfGame(){
       String mail = token.nextToken();
       String btn = token.nextToken();  
       HandelPlayer x = onlineGame.get(mail);
       x.ps.println("gameTic");
       x.ps.println(btn);
    }
   
    private void endOfGame(){
        String email = token.nextToken();
        String btn = token.nextToken();  
        HandelPlayer x = onlineGame.get(email);
        if(onlineGame.containsKey(email)){
            onlineGame.remove(x.email);
            onlineGame.remove(this.email);
        }
        x.ps.println("finalgameTic");
        x.ps.println(btn);
    }
    
   private void updateScore(){
       String mail = token.nextToken();
       int score = Integer.parseInt(token.nextToken());
       System.out.println(score);
       server.updateScore(mail, score);
   }
   
   private void quit(){
        HandelPlayer player = null;
        player = onlineGame.get(this.email);
        if(player != null){
            player.ps.println("quit");
            onlineGame.remove(this.email);
            onlineGame.remove(player.email);
        }
    }
   

    private void logout(){
        email = token.nextToken();
        System.out.println("Logout Email " + email);
        if(email != null){
            server.setActive(false, email);
            players.remove(email);
        }
       try {
           currentSocket.close();
       } catch (IOException ex) {
           ex.printStackTrace();
       }
    }
}