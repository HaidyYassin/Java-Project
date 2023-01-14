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

/**
 *
 * @author WaterMelon
 */
public class ConnectWithServer {
    static Socket socket;
    static DataInputStream dis;
    static PrintStream ps;
     static HashMap<String, String>dataFromServer = new HashMap<>();
    public ConnectWithServer() {
        
        
    }
      public boolean Isconnected(String s){
                try {
                    
                    if(socket == null || socket.isClosed()){
                        socket = new Socket("192.168.56.1",5005);
                        dis = new DataInputStream(socket.getInputStream());
                        ps = new PrintStream(socket.getOutputStream());
                    }
                    
                    return true;
                } catch (IOException ex) {
                    try {
                        System.out.println("closing socket connection");
                        if(socket != null){
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
