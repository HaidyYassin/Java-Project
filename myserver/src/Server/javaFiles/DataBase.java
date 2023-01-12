
package Server.javaFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.ClientDriver;


public class DataBase {
    private static DataBase instanceData;
    private Connection con;
    private ResultSet rs ;
    private PreparedStatement pst;
    
    public synchronized ResultSet getResultSet(){
        return rs;
    }
    
    private  DataBase() throws SQLException{
         DriverManager.registerDriver(new ClientDriver());
         con = DriverManager.getConnection("jdbc:derby://localhost:1527/TicTacToy","root","root");
    }

    public synchronized static DataBase getDataBase() throws SQLException {
        if(instanceData == null){
            instanceData = new DataBase();
        }
        return instanceData;
    }
    
    public synchronized void updateResultSet(){
        
        try {
            this.pst =con.prepareStatement("Select * from PLAYER",ResultSet.TYPE_SCROLL_SENSITIVE ,ResultSet.CONCUR_READ_ONLY  );
            this.rs = pst.executeQuery(); 
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized int getOnlinePlayersCount(){
        try {
            this.pst =con.prepareStatement("select count(*) from PLAYER where ISACTIVE = True",ResultSet.TYPE_SCROLL_SENSITIVE ,ResultSet.CONCUR_READ_ONLY  );
            ResultSet r =pst.executeQuery();       
            return r.next() ? r.getInt(1) : -1;
        }catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("catch getactive");
        }
        return -1;
    }
    public synchronized void  setOnline(boolean state , String email){
        try {
            pst = con.prepareStatement("update PLAYER set ISACTIVE = ? where EMAIL = ?");
            pst.setString(1, state+"");
            pst.setString(2, email);
            System.out.println("db mail active:"+email);
            pst.executeUpdate(); 
            updateResultSet();
        } catch (SQLException ex) {
            System.out.println("change state to offline catch");
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public synchronized ResultSet getOnlinePlayers( ){
        
        try {
            this.pst =con.prepareStatement("Select * from PLAYER where ISACTIVE = true ",ResultSet.TYPE_SCROLL_SENSITIVE ,ResultSet.CONCUR_READ_ONLY  );
            return pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("catch getactive");
            return null;
        }
        
    }
   
    
    public synchronized void closeDBConnection() throws SQLException{
        changeStateToOffline();
        rs.close();
        pst.close();
        con.close();
        instanceData = null;
    }

    public synchronized void changeStateToOffline(){
        try {
            pst = con.prepareStatement("update PLAYER set ISACTIVE = ? ",ResultSet.TYPE_SCROLL_SENSITIVE ,ResultSet.CONCUR_UPDATABLE  );
            pst.setString(1, "false");
            pst.executeUpdate(); 
            updateResultSet();
        } catch (SQLException ex) {
            System.out.println("change state to offline");
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public synchronized void login(String email,String password) throws SQLException{

        pst = con.prepareStatement("update PLAYER set ISACTIVE = ?  where EMAIL = ? and PASSWORD = ? ",ResultSet.TYPE_SCROLL_SENSITIVE ,ResultSet.CONCUR_UPDATABLE  );
        pst.setString(1, "true");
        pst.setString(2, email);
        pst.setString(3, password);
        pst.executeUpdate(); 
        updateResultSet();          
    }
    
    public synchronized void SignUp(String username , String email, String password) throws SQLException{
        
        
        pst = con.prepareStatement("insert into PLAYER(USERNAME,EMAIL,PASSWORD) values(?,?,?)");
        pst.setString(1, username);
        pst.setString(2, email);
        pst.setString(3, password);
        pst.executeUpdate(); 
        login(email,password);

    }

    public synchronized String checkRegister(String username , String email){
        ResultSet checkRs;
        PreparedStatement pstCheck;
        
        try {
            pstCheck = con.prepareStatement("select * from PLAYER where USERNAME = ? and EMAIL = ?");
            pstCheck.setString(1, username);
            pstCheck.setString(2, email);
            checkRs = pstCheck.executeQuery();
            if(checkRs.next()){
                return "already signed-up";
            }
        } catch (SQLException ex) {
            System.out.println("here ");
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Registered Successfully";
    }
    public synchronized String checkSignIn(String email, String password){
        ResultSet checkRs;
        PreparedStatement pstCheck;
        String check;       
        System.out.println("checkSignIn " +checkIsOnline(email));
        if(!checkIsOnline(email)){
            System.out.println(" checkSignIn: " +checkIsOnline(email));
                try { 
            pstCheck = con.prepareStatement("select * from PLAYER where EMAIL = ? ");
            pstCheck.setString(1, email);
            checkRs = pstCheck.executeQuery();
            if(checkRs.next()){
                if(password.equals(checkRs.getString(3))){
                    return "Logged in successfully";
                }
                return "Password is incorrect";
            }
            return "Email is incorrect";
          } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            return "Connection issue, please try again later";
             }
        }else{
            System.out.println("This Email alreay sign-in " + checkIsOnline(email));
           return "This Email is alreay sign-in";  
        }
              
    }
    
    public synchronized int getScore(String email){
        int score;
        ResultSet checkRs;
        PreparedStatement pstCheck;
 
        try {
            pstCheck = con.prepareStatement("select * from PLAYER where EMAIL = ?");
            pstCheck.setString(1, email);
            checkRs = pstCheck.executeQuery();
            checkRs.next();
            score = checkRs.getInt(5);
            return score;
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    } 
    
    public synchronized void updateScore(String mail, int score){
        try {
            pst = con.prepareStatement("update PLAYER set SCORE = ?  where EMAIL = ?",ResultSet.TYPE_SCROLL_SENSITIVE ,ResultSet.CONCUR_UPDATABLE  );
            pst.setInt(1, score);
            pst.setString(2, mail);
            pst.executeUpdate();
            updateResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized String getEmail(String username){
        String email;
        ResultSet checkRs;
        PreparedStatement pstCheck;
        try {
            pstCheck = con.prepareStatement("select * from PLAYER where EMAIL = ?");
            pstCheck.setString(1, username);
            checkRs = pstCheck.executeQuery();
            checkRs.next();
            email = checkRs.getString(3);
            return email;
        } catch (SQLException ex) {
            System.out.println("Invalid EMAIL address");
            
        }
        return null;
    }
 
     public synchronized String getUserName(String email){
        String userName;
        ResultSet checkRs;
        PreparedStatement pstCheck;
        try {
            pstCheck = con.prepareStatement("select * from PLAYER where EMAIL = ?");
            pstCheck.setString(1, email);
            checkRs = pstCheck.executeQuery();
            checkRs.next();
            userName = checkRs.getString(2);
            return userName;
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
        return null;
    }
   
     public Boolean checkIsOnline(String email){
          ResultSet checkRs;
          PreparedStatement pstCheck;
          Boolean isOnline ;
         try {
            pstCheck = con.prepareStatement("select ISACTIVE from PLAYER where EMAIL = ?");
            pstCheck.setString(1, email);
            checkRs = pstCheck.executeQuery();
            checkRs.next();
            System.out.println("checkIsOnlis true ");
            isOnline = checkRs.getBoolean("ISACTIVE");
            System.out.println("checkIsOnlis " +isOnline);
            return isOnline ;
         } catch (SQLException ex) {
            System.out.println("Invalid Email address");
            ex.printStackTrace();
            
         }
         return false;
         
     }

}