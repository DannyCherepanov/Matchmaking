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
    private File file2;

    public Questionnaire(File f, File g) {
        file = new File("questionarre.txt");
        file2 = new File("answers.txt");
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

//    public void initializeAnswer() {
//        ArrayList<String> an = new ArrayList();
//    }
//
//    public void setAnswer(int index, String response, ArrayList an) {
//        an.add(index, response);
//    }
//
//    public void printAnswers() {
//        PrintWriter p = null;
//        try {
//            new PrintWriter(new FileWriter(getFile2()), true);
//        } catch (IOException ex) {
//        }
//        
//     }

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
