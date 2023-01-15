/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.JavaFiles;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;

/**
 *
 * @author yelbt
 */
    
public class ConnectWithServer {
    static Socket socket;
    public static DataInputStream dis;
    public static PrintStream ps;
    static boolean  serverIsConnected=false;
    static HashMap<String, String>currentPlayerData = new HashMap<>();
    public ConnectWithServer() {
        
    }
      public static boolean Isconnected(){
                try {
                    
                    if(socket == null || socket.isClosed()){
                        serverIsConnected=true;
                        socket = new Socket("127.0.0.1",5005);
                        dis = new DataInputStream(socket.getInputStream());
                        ps = new PrintStream(socket.getOutputStream());
                        
                    }
                    
                    return true;
                } catch (IOException ex) {
                    try {
                        System.out.println("closing socket connection");
                        if(socket != null){
                            serverIsConnected=false;
                            socket.close();
                            dis.close();
                            ps.close();
                        }
                        
                    } catch (IOException ex1) {
                        ex1.printStackTrace();
                    }
                    return false;
                }
                
            }
     }