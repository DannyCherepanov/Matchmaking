/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersPKG;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duncan.chaytor
 */
public class User {

    //private variables for user's data
    private String un;
    //takes in encrypted password (ENCRYPTION DONE WHEN PASSWORD ENTERED)
    private String pw;

    public String getUn() {
        return this.un;
    }

    public String getPw() {
        return this.pw;
    }

    //password encryption using md5 (since I don't know any other ways)
    /**
     * Method to encrypt an entered password
     * @param passw the password to be encrypted
     * @return an MD5-encrypted version of the entered password
     */
    public static String encryptPW(String passw) {
        //encrypt a password

        MessageDigest md;
        //initialize string to store encrypted password
        String password = "";
        try {
            md = MessageDigest.getInstance("MD5");
            //give the helper function the password
            md.update(passw.getBytes());
            //perform the encryption
            byte byteData[] = md.digest();

            for (int i = 0; i < byteData.length; ++i) {
                password += (Integer.toHexString((byteData[i] & 0xFF) | 0x100).substring(1, 3));

            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return password;

    }

    //MIGHT CHANGE THESE
    protected void setUn(String un) {
        this.un = un;
    }

    protected void setPw(String pw) {
        //encrypt the new password
        this.pw = encryptPW(pw);
    }

}
