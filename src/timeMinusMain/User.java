
package timeMinusMain;

/**
 *
 * @author Justin
 */
public class User extends frmTimeMinus {
    private String username, password;

    
    
    
    
    

    public boolean userLoginTest(String username, String password) {// Test code, replace with database search
        return username.equalsIgnoreCase("1") && password.equalsIgnoreCase("1");
        
    }
}
