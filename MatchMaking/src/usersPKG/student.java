/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersPKG;

import java.util.ArrayList;
import matchmaking.Questionnaire;

/**
 *
 * @author duncan.chaytor
 */
public class student extends User implements Comparable<student> {

    /*
     If wanting to enter un/pw for students but want to leave it to them to enter gender or orientation,
     create new students with values for gender and/or ori as 0, and un/pw as school credentials.
     */
    /**
     * Creates new student when ALL information is entered (For when getting
     * student info out of database)
     *
     * @param un the username of a student
     * @param pw the password of a student
     * @param gender the student's gender (entered themselves on first login)
     * (ENTER 0 FOR DEFAULT if you want to create users with un/pw)
     * @param ori the student's orientation (entered themselves on first login)
     * (ENTER 0 FOR DEFAULT if you want to create users with un/pw)
     */
    public student(String un, String pw, int gender, int ori)    {
        setUn(un);
        setPw(pw);
        this.gender = gender;
        this.ori = ori;
        
//        this.answer = new ArrayList(answer);
    }

    //for determining matches, 0 for not yet entered, 1 for male, 2 for female, 3 for unspecified/other
    private int gender;
    //for determining matches, 0 for not entered yet, 1 for likes men, 2 for likes women, 4 for either, 3 for literally anyone 
    private int ori;

    //true if looking for match, false if just looking for friend
    //private boolean romantic;
    //stores integers representing answers to questions
    //values between 1 and 5, 1 being strongly disagree, 5 being strongly agree
    private ArrayList <Integer> answer ;
    
    /**
     * Gets a student's entered gender
     *
     * @return 0 for not yet entered, 1 for male, 2 for female, 3 for
     * unspecified/other
     */
    public int getGender() {
        return this.gender;
    }

    /**
     * Gets a student's entered orientation
     *
     * @return 0 for not yet entered, 1 for interested in males, 2 for
     * interested in females, 4 for interested in males OR females, 3 for anyone
     */
    public int getOri() {
        return this.ori;
    }

    /**
     * Gets a students answer to a specific question
     *
     * @param ansAT the question for which the answer is to be gotten (NOTE:
     * QUESTION NUMBER, not space in array)
     * @return the answer at the right index (since answer is an array, question
     * 1 corresponds with answer[0])
     */
    public int getAnswer(int ansAT) {
        return answer.get(ansAT-1);
    }

    /**
     * Sets the answer at a term to an answer given by a student
     *
     * @param ansAT the question for which the answer is to be gotten (NOTE:
     * QUESTION NUMBER, not space in array)
     * @param ans the answer the student gave to this question
     */
    public void setAnswer(int ansAT, int ans) {
        //THIS MIGHT NOT WORK, might have to switch answer to an arraylist
        answer.add(ansAT - 1, (Integer) ans);
    }

    public void removeAnswer(int ansAT) {
        answer.remove(ansAT - 1);
    }

    /**
     * Gets the total difference between two students. Finds the difference in
     * answers for each question, adds them all together, and returns that
     *
     * @param o the second student being compared
     * @return the total difference in answers between students (sum of
     * differences for each question). Returns negative if gender/orientations
     * of students don't match
     */
    @Override
    public int compareTo(student o) {
        //cover case if trying to match students w/out specified gender/orientation variables
        if (this.gender == 0 || this.ori == 0 || o.ori == 0 || o.gender == 0) {
            System.out.println("One or more students haven't specified gender/orientation.");
            return - 1;
        }

        //temporary orientation variables, for ease of handling cases where orientation variable doesn't always = other persons gender
        int tempORI1 = this.ori;
        int tempORI2 = o.ori;

        //if person 1 looking to match with anyone, set tempORI1 to the other persons gender
        if (tempORI1 == 3) {
            tempORI1 = o.gender;
        }
        //if person 2 looking to match with anyone, set tempORI2 to the other persons gender
        if (tempORI2 == 3) {
            tempORI2 = this.gender;
        }

        //handle cases if 'bi' option chosen
        if (tempORI1 == 4 && o.gender != 3) {
            tempORI1 = o.gender;
        }
        if (tempORI2 == 4 && o.gender != 3) {
            tempORI2 = this.gender;
        }

        //if gender/orientation don't line up, return a negative number
        if (this.gender != tempORI2 || tempORI1 != o.gender) {
            return - 1;
        }

        //loop through answers array, check difference between each answer,
        //store total in different variable
        int totDiff = 0;
        for (int i = 0; i < answer.size(); i++) {

            //just for testing
            System.out.println(Math.abs(this.getAnswer(i + 1) - o.getAnswer(i + 1)));

            //get the absolute value of the difference for a specific question
            totDiff += Math.abs(this.getAnswer(i + 1) - o.getAnswer(i + 1));

        }

        return totDiff;
    }
    
    /**
     * Returns String representation of a student
     * @return Comma delimited line with users information in format un, pw, gender, orientation
     */
    @Override
    public String toString()    {
        String dl = ",";
        return (this.getUn() + dl + this.getPw() + dl + gender + dl + ori);
    }
}
