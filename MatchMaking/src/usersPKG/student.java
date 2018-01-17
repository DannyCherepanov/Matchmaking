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
public class student extends User implements Comparable <student>{
    
    /*
    If wanting to enter un/pw for students but want to leave it to them to enter gender or orientation,
    create new students with values for gender and/or ori as 0, and un/pw as school credentials.
    */
    
    
    /**
     * Creates new student when ALL information is entered (For when getting student info out of database)
     * @param un the username of a student
     * @param pw the password of a student
     * @param gender the student's gender (entered themselves on first login) (ENTER 0 FOR DEFAULT if you want to create users with un/pw)
     * @param ori the student's orientation (entered themselves on first login) (ENTER 0 FOR DEFAULT if you want to create users with un/pw)
     */
    public student(String un, String pw, int gender, int ori)    {
        setUn(un);
        setPw(pw);
        this.gender = gender;
        this.ori = ori;
    }
    
    
    
    
    //for determining matches, 0 for not yet entered, 1 for male, 2 for female, 3 for unspecified/other
    private int gender;
    //for determining matches, 0 for not entered yet, 1 for straight, 2 for bi, 3 for gay
    private int ori;
    
    //true if looking for match, false if just looking for friend
    private boolean romantic;
    
    
    //stores integers representing answers to questions
    //values between 1 and 5, 1 being strongly disagree, 5 being strongly agree
    private ArrayList <Integer> answer = new ArrayList();
    
    /**
     * Gets a student's entered gender
     * @return 0 for not yet entered, 1 for male, 2 for female, 3 for unspecified/other
     */
    public int getGender()  {
        return this.gender;
    }
    
    /**
     * Gets a student's entered orientation
     * @return 
     */
    public int getOri() {
        return this.ori;
    }
    
    /**
     * Gets a students answer to a specific question
     * @param ansAT the question for which the answer is to be gotten (NOTE: QUESTION NUMBER, not space in array)
     * @return the answer at the right index (since answer is an array, question 1 corresponds with answer[0])
     */
    public int getAnswer(int ansAT) {
        return answer.get(ansAT - 1);
    }
    
    /**
     * Sets the answer at a term to an answer given by a student
     * @param ansAT the question for which the answer is to be gotten (NOTE: QUESTION NUMBER, not space in array)
     * @param ans the answer the student gave to this question
     */
    public void setAnswer(int ansAT, int ans)    {
        //THIS MIGHT NOT WORK, might have to switch answer to an arraylist
        answer.add(ansAT - 1, (Integer)ans);
    }
    
    

    /**
     * Gets the total difference between two students. Finds the difference in 
     * answers for each question, adds them all together, and returns that
     * @param o the second student being compared
     * @return the total difference in answers between students (sum of differences for each question)
     */
    @Override
    public int compareTo(student o) {
        //loop through answers array, check difference between each answer,
        //store total in different variable
        int totDiff = 0;
        for (int i = 0; i < answer.size(); i++) {
            
            //just for testing
            System.out.println(Math.abs(this.getAnswer(i+1) - o.getAnswer(i+1)));
            
            //get the absolute value of the difference for a specific question
            totDiff += Math.abs(this.getAnswer(i+1) - o.getAnswer(i+1));
            
        }
    
        return totDiff;
    }
    
    
    
}
