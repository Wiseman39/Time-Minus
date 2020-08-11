
package timeMinusMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Justin
 */
public class User extends frmTimeMinus {
    private String username, password;
    public Connection con;
        public java.sql.Statement st;
        public ResultSet resSet;

     public void DBconnect() 
    {
          try {
             Class.forName("com.mysql.jdbc.Driver");
             System.out.println("Driver connected");
             String path = "jdbc:mysql://localhost:3307/timeminus";
             con = DriverManager.getConnection(path,"root","");
             System.out.println("database connected");
             st = con.createStatement();
  
         } catch (Exception ex) {
             System.out.println("error" + ex);
         }
     
    }
    
    
    
    

    public boolean userLoginTest(String username, String password) {// Test code, replace with database search
        
        String user = username;
            String pass = password;
         
            try{
            
              if (user.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password))
                     {
                         
                        JOptionPane.showMessageDialog(null, "Hi "+ user + " you have logged in successfully");
            
                       }else{
              
                            JOptionPane.showMessageDialog(null, "Incorrect username and password");
                        }
                  
            
            }catch(Exception ex)
            {
                System.out.println(ex);
            
            }
        return true;
    }
}
