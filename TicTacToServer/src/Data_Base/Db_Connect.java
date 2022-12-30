package Data_Base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Application.launch;
//import org.apache.derby.jdbc.ClientDriver;



public class Db_Connect {

    Connection con;

    public Db_Connect() {
        setConnection();

    }

    public void setConnection() {
        //DatabaseConnection connec = new DatabaseConnection();
        try {
          //  DriverManager.registerDriver(new ClientDriver() );
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Player_Db","root", "root");
            System.out.println("system connection done");

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error in connection");
        }
    }
    
    public void stopConnection(){
        
    }
    public static void main(String[] args) {
        Db_Connect d = new Db_Connect();
    }
}
