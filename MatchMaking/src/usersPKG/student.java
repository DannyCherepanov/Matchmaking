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
    
    
    
    public student(String un, String pw, int gender)    {
        setUn(un);
        setPw(pw);
        this.gender = gender;
        
    }
    
    
    
    
    //for determining matches, 0 for unspecified/other, 1 for male, 2 for female
    private int gender;
    
    //true if looking for match, false if just looking for friend
    private boolean romantic;
    
    
    //stores integers representing answers to questions
    //values between 1 and 5, 1 being strongly disagree, 5 being strongly agree
    private ArrayList <Integer> answer;
    
    /**
     * Gets a student's gender
     * @return 0 for unspecified/other, 1 for male, 2 for female
     */
    public int getGender()  {
        return this.gender;
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
