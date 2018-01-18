/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchmaking;

import java.io.*;
import static java.lang.Integer.parseInt;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 341033801
 */
public class Questionnaire {

    public Question[] matchTest = new Question[20];
    private File file;

    public Questionnaire(File f) {
        file = new File("questionarre.txt");
    }

    public void readQuestionaire() {
        Scanner s = null;
        try {
            s = new Scanner(getFile());
        } catch (FileNotFoundException ex) {
        }

        int count = 0;
        while (s.hasNextLine()) {
            String g = s.nextLine();
            String[] h = g.split(",");
            matchTest[count] = new Question(h[0], parseInt(h[1]));
            count++;
        }
        s.close();
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }
    

}
