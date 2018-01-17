/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersPKG;

/**
 *
 * @author duncan.chaytor
 */
public class User{
    
    //private variables for user's data
    
    private String un;
    //takes in encrypted password (ENCRYPTION DONE WHEN PASSWORD ENTERED)
    private String pw;

    public String getUn()   {
        return this.un;
    }
    public String getPw()   {
        return this.pw;
    }
    
    protected void encryptPW()  {
        //encrypt a password
        
        
        
        
        
        
        
    }
    
    
    
    //MIGHT CHANGE THESE
    public void setUn(String un)    {
        this.un = un;
    }
    public void setPw(String pw)    {
        this.pw = pw;
        //encrypt the new password
        encryptPW();
    }

    
    
    
    
    
}
