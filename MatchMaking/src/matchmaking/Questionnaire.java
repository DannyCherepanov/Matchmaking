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

    Question[] q;
    private File file;
    private File file2;

    public Questionnaire(File f, File g, int length) {
        file = new File("questionarre.txt");
        file2 = new File("answers.txt");
        q = new Question[length];
    }

    public void readQuestionnaire() {
        Scanner s = null;
        try {
            s = new Scanner(getFile());
        } catch (FileNotFoundException ex) {
        }

        int count = 0;
        while (s.hasNextLine()) {
            String g = s.nextLine();
            String[] h = g.split(",,");
            q[count] = new Question(h[0], parseInt(h[1]));
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

    /**
     * @return the file2
     */
    public File getFile2() {
        return file2;
    }

    /**
     * @param file2 the file2 to set
     */
    public void setFile2(File file2) {
        this.file2 = file2;
    }

}
