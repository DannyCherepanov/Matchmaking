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
public class Admin extends User {

    //admin permissions are givin if true
    public boolean isAdmin = true;

    public Admin(String un, String pw) {
        setUn(un);
        setPw(pw);
    }

    /**
     * Returns String representation of an admin
     *
     * @return Comma delimited line with users information in format un, pw,
     * admin status
     */
    @Override
    public String toString() {
        String dl = ",";
        return (this.getUn() + dl + this.getPw() + dl + isAdmin);
    }

}
