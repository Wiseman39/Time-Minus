/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
