/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.*;
import java.util.*;
import usersPKG.*;

/**
 *
 * @author Danny
 */
public class log {

    private File f;

    ArrayList a = new ArrayList<student>();
    public static final String d = ",";

    private student current;

    /**
     * starts a file under given directory for easy login/logout system L
     *
     *
     * @param x location of file
     *
     * @throws FileNotFoundException
     */
    public log(String x) throws FileNotFoundException {
        f = new File(x);
        Scanner s = new Scanner(f);
        while (s.hasNext()) {
            a.add(new student(s.next(), s.next(), s.nextInt(), s.nextInt()));
        }
    }

    /**
     * registers a user in file as long as they don't have a bad password
     *
     * @param fName first name
     * @param lName last name
     * @param user user name
     * @param password password
     * @throws FileNotFoundException
     */
    public void reg(String user, String password, int gender, int ori) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(f);
        a.add(new student(user, password, gender, ori));
        pw.append(user + d + password + d + gender + d + ori);
        pw.close();
    }

    /**
     * Login method works once you have set up the file
     *
     * @param user username trying to log in
     * @param password password that is supposed to go with user name
     * @return returns true if the person is in the system
     * @throws FileNotFoundException
     */
    public boolean login(String user, String password) throws FileNotFoundException {
        //send entered password to encryption method
        password = User.encryptPW(password);
        for (int g = 0; g <= a.size(); g++) {
            if (((student) a.get(g)).getUn().equals(user) && ((student) a.get(g)).getPw().equals(password)) {
                setCurrent(new student(user, password, 1, 2));
                return true;
            }
        }
        return false;
    }

    /**
     * @return the current
     */
    public student getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(student current) {
        this.current = current;
    }

}
