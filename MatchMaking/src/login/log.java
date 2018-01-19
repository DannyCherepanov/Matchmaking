/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class log {

    private File f;
    public static final File bp = new File("dictbadpass.txt");;
    ArrayList a = new ArrayList<String[]>();
    public static final String d = ",";
    /**
     * starts a file under given directory for easy login/logout system
L     * @param x location of file
     * @throws FileNotFoundException 
     */
    public log(String x) throws FileNotFoundException {
        f = new File(x);
        Scanner s = new Scanner(f);
        while (s.hasNext()) {
            a.add(s.nextLine().split(d));
        }
    }
    /**
     * registers a user in file as long as they don't have a bad password 
     * @param fName first name
     * @param lName last name
     * @param user user name
     * @param password password
     * @throws FileNotFoundException 
     */
    public void reg(String fName, String lName, String user, String password) throws FileNotFoundException {
        if(badpassword(password)){
            return;
        }
        PrintWriter pw = new PrintWriter(f);
        Scanner s = new Scanner(f);
        String temp = fName + d + lName + d + user + d + password + ",/n";
        pw.append(temp);
        a.add(temp.split(d));
        pw.close();
    }
    /**
     * Login method works once you have set up the file
     * @param user username trying to log in
     * @param password password that is supposed to go with user name
     * @return returns true if the person is in the system
     * @throws FileNotFoundException 
     */
    public boolean login(String user, String password) throws FileNotFoundException {
        for (int g = 0; g <= a.size(); g++) {
            if ((((String[]) a.get(g))[2].equals(user)) && (((String[]) a.get(g))[3].equals(password))) {
                return true;
            }
        }
        return false;
    }
    
    
    private boolean badpassword(String pass) throws FileNotFoundException{
        Scanner u = new Scanner(bp);
        while(u.hasNext()){
            if(u.nextLine()==pass){
                return true;
            }
        }
        return false;
    }
}
