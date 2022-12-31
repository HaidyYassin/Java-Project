/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerJavaFiles;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author dell
 */
public class AcceptConnections {
    ServerSocket serverSocket ;
    DataInputStream dis;
    public AcceptConnections() {
           try {
              serverSocket = new ServerSocket(5005); 
          } catch (IOException ex) {
              ex.printStackTrace();
              System.out.println("Error");
          }
        while(true)
        {   Socket s;
            try {
                s = serverSocket.accept();
                ClientsHandler chat= new ClientsHandler(s);
                System.out.println("new Client connected");
            } catch (IOException ex) {
                  ex.printStackTrace();
                  System.out.println("Error");
            }
  
        }
    }
    
    
    
}
