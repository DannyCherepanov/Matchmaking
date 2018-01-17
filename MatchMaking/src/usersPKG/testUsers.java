/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersPKG;
import usersPKG.student;
/**
 *
 * @author 066956699
 */
public class testUsers {
   
    
    public static void main(String [] args) {
        student s1 = new student("d", "d", 1);
        student s2 = new student("d","d", 1);
        s1.setAnswer(1,1);
        s2.setAnswer(1,1);
        System.out.println(s1.compareTo(s2));
    }

}
