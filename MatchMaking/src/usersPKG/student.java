/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersPKG;

/**
 *
 * @author 066956699
 */
public class student extends User implements Comparable <student>{
    
    //for determining matches, 0 for unspecified/other, 1 for male, 2 for female
    private int gender;
    
    //true if looking for match, false if just looking for friend
    private boolean romantic;
    
    
    //stores integers representing answers to questions
    //values between 1 and 5, 1 being strongly disagree, 5 being strongly agree
    private int [] answer;
    
    /**
     * Gets a student's gender
     * @return 0 for unspecified/other, 1 for male, 2 for female
     */
    public int getGender()  {
        return this.gender;
    }
    

    @Override
    public int compareTo(student o) {

        //loop through answers array, check difference between each answer,
        //store total in different variable
        return 0;
    }
    
    
    
}
