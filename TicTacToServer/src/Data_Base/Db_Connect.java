package Data_Base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.derby.jdbc.ClientDriver;


public class Db_Connect {

    Connection con;

    public Db_Connect() {
    }

    public void setConnection() {
        //DatabaseConnection connec = new DatabaseConnection();
        try {
           DriverManager.registerDriver(new ClientDriver());
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PlayerData","root", "root");
            System.out.println("system connection done");

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error in connection");
            return;
        }
        
    }
    
    public void stopConnection(){
       /* try {
           // con.close();
            System.out.println("system connection closed");
        } catch (SQLException ex) {
           ex.printStackTrace();
            System.out.println("Error in connection close");
        }*/
       System.out.println(" connection close");
    }
   
}
