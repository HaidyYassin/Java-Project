/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerJavaFiles;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Vector;

/**
 *
 * @author dell
 */
public class ClientsHandler extends Thread {
    
    private Socket socket;
    DataInputStream dis;
    PrintStream ps;
    static Vector<ClientsHandler> clientsVector =new Vector<ClientsHandler>();
    
        public ClientsHandler(Socket cs) throws IOException
    {   this.socket=cs;
        dis = new DataInputStream(cs.getInputStream());
        ClientsHandler.clientsVector.add(this); 
        start();

    }
     public void run()
    {
        while(true)
        {
            try {
              dis.readLine();
              
            }
            catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("Error in chat handler");
            }
        }
    }
    
    
}
