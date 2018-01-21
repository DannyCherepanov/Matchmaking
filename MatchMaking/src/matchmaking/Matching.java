/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchmaking;

import java.util.*;
import usersPKG.*;

/**
 *
 * @author 341033801
 */
public class Matching {

    //entire base of students
    private student[] students;

    public Matching(student[] temp) {
        students = temp;
    }

    /**
     * gives back students top10 matches
     *
     * @param s student to be matched
     * @return
     */
    public student[] top10(student s) {
        student[] a = new student[10];
        student[] tt = students;
        student temp = null;
        int t = -1;
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= tt.length; y++) {
                if (tt[y].compareTo(s) >= temp.compareTo(s)) {
                    temp = tt[y];
                    t = y;
                }
            }
            a[x] = temp;
            tt = remove(tt, t);
        }
        return a;
    }

    private student[] remove(student[] j, int r) {
        List l = new ArrayList<student>();
        for (int x = 0; x <= j.length; x++) {
            if (x != r) {
                l.add(j[x]);
            }
        }
        return (student[]) l.toArray();
    }
}
