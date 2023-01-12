package Server.javaFiles;

import Server.javaFiles.DataBase;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yelbt
 */

import java.io.IOException;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HandelServer {
    

    private static HandelServer server;
    public DataBase databaseInstance ;
    private ServerSocket serverSocket ;
    private Socket socket ;
    private Thread thread;
    
    private HandelServer(){
    }
    
    public static HandelServer getServer(){
        if(server == null){
            server = new HandelServer();
        }
        return server;
    }
    
    
    
    public void StartConnection() throws SQLException{

        databaseInstance = DataBase.getDataBase();
        databaseInstance.changeStateToOffline();
        databaseInstance.updateResultSet();
        initServer(); 

    }

    
    public void closeConnection(){
        try {
            databaseInstance.closeDBConnection();
            thread.stop();
            serverSocket.close();
        } catch (SQLException ex) {
            
            System.out.print("disable connection server");
        } catch (IOException ex) {
            System.out.print("disable connection server");
        }
    }
    
    private void initServer(){
        try {
            serverSocket = new ServerSocket(5005);
            System.out.println(Inet4Address.getLocalHost().getHostAddress());
            
            thread = new Thread(() -> {
                while(true){
                    try {
                        socket = serverSocket.accept();
                        new HandelPlayer(socket); 
                    }catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    
                }
            });
            thread.start();
        }catch (IOException ex) {
            System.out.println("server exception");
            ex.printStackTrace();
        }
    }
   
     public void login(String email,String password) throws SQLException{
        databaseInstance.login(email, password);
    }
     public void SignUp(String username,String email,String password) throws SQLException{
        databaseInstance.SignUp(username,email,password);
    }
    public String checkSignIn(String email,String password){
        return databaseInstance.checkSignIn(email, password);
    }
    public String checkRegister(String username,String email){
        return databaseInstance.checkRegister(username, email);
    }
    public int getScore(String email){
        return databaseInstance.getScore(email);
    }
    public String getUserName(String email){
        return databaseInstance.getUserName(email);
    }
    public ResultSet getOnlinePlayers(){
        return databaseInstance.getOnlinePlayers();
    }
    public void updateScore(String mail,int score){
        databaseInstance.updateScore(mail, score);
    }
  
    public ResultSet getResultSet(){
        return databaseInstance.getResultSet();
    }
     public void setActive(Boolean state, String mail){
        databaseInstance.setOnline(false,mail);
    }
}
