/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchmaking;

/**
 *
 * @author 341033801
 */
public class Question {

    private String q;
    private int qType;

    /**
     * takes in what question is asking and if question is yes/no or scale of
     * agree/disagree
     *
     * @param s is the question
     * @param type 0 = yes/no 1 = agree/disagree
     */
    public Question(String s, int type) {
        q = s;
        qType = type;
    }

    public String toString() {

        return getQ();
    }

    public int type() {
        return getqType();

    }

    /**
     * @return the q
     */
    public String getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(String q) {
        this.q = q;
    }

    /**
     * @return the qType
     */
    public int getqType() {
        return qType;
    }

    /**
     * @param qType the qType to set
     */
    public void setqType(int qType) {
        this.qType = qType;
    }
}
