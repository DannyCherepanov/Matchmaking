/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchmaking;

import java.awt.Color;
import java.awt.Container;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import usersPKG.student;

/**
 *
 * @author 072698376
 */
public class QuestionScreen extends javax.swing.JFrame {

    static student test = new student("student", "debt", 1, 1);
    Color pink = new Color(255, 192, 203);
    int globalCount = 0;
    static File file = new File("questionarre.txt");
    static File file2 = new File("answers.txt");
    static Questionnaire q1 = new Questionnaire(file, file2, 7);

    boolean[] a = new boolean[q1.q.length];

    /**
     * Creates new form QuestionScreen
     */
    public QuestionScreen() {
        initComponents();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        questionPanel1 = new matchmaking.QuestionPanel();
        currentQ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nextQ = new javax.swing.JButton();
        prevQ = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        currentQ.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        currentQ.setText("<Question>");

        jLabel3.setFont(new java.awt.Font("Khmer UI", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("MATCHMAKER");

        javax.swing.GroupLayout questionPanel1Layout = new javax.swing.GroupLayout(questionPanel1);
        questionPanel1.setLayout(questionPanel1Layout);
        questionPanel1Layout.setHorizontalGroup(
            questionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentQ, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        questionPanel1Layout.setVerticalGroup(
            questionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentQ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        nextQ.setText("Next Question");
        nextQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQActionPerformed(evt);
            }
        });

        prevQ.setText("Previous Question");
        prevQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevQActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRadioButton1.setText("Strongly Disagree");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRadioButton2.setText("Disagree");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRadioButton3.setText("Neutral");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRadioButton4.setText("Agree");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRadioButton5.setText("Strongly Agree");

        save.setText("Save Answers");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(questionPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nextQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prevQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save))
                    .addComponent(jRadioButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(questionPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextQ)
                    .addComponent(prevQ)
                    .addComponent(save))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQActionPerformed
        if (jRadioButton1.isSelected()) {
            saveAnswer(1);
        } else if (jRadioButton2.isSelected()) {                                                                                                                                                                                                            //jaden is boosted
            saveAnswer(2);
        } else if (jRadioButton3.isSelected()) {
            saveAnswer(3);
        } else if (jRadioButton4.isSelected()) {
            saveAnswer(4);
        } else if (jRadioButton5.isSelected()) {
            saveAnswer(5);
        }
        globalCount++;
        if (globalCount > q1.q.length - 1) {
            globalCount = q1.q.length - 1;
        }
        currentQ.setText(q1.q[globalCount].getQ());
    }//GEN-LAST:event_nextQActionPerformed

    private void prevQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevQActionPerformed
        globalCount--;
        if (globalCount > 0) {
            globalCount = 0;
        }
        currentQ.setText(q1.q[globalCount].getQ());
    }//GEN-LAST:event_prevQActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        saveFinal(test);
    }//GEN-LAST:event_saveActionPerformed
    public void saveAnswer(int answer) {
        if (a[globalCount] == true) {
            test.removeAnswer(globalCount);
        }
        test.setAnswer(globalCount, answer);
        a[globalCount] = true;
    }

    public void saveFinal(student s) {
        PrintWriter p = null;
        try {
            p = new PrintWriter(new FileOutputStream(file2), true);
        } catch (IOException ex) {
        }
        p.print(test.getUn() + "," + test.getGender() + "," + test.getOri() + ",");
        for (int i = 0; i < q1.q.length - 1; i++) {
            p.print(test.getAnswer(i) + ",");
        }
        p.print(test.getAnswer(q1.q.length - 1));
        p.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PrintWriter p = null;
        try {
            p = new PrintWriter(new FileWriter(file2), true);
        } catch (IOException ex) {
        }
        q1.readQuestionaire();


        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel currentQ;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JButton nextQ;
    private javax.swing.JButton prevQ;
    private matchmaking.QuestionPanel questionPanel1;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

}
