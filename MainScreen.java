/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main_Game;

import javax.swing.JFrame;
public class MainScreen extends javax.swing.JFrame {

    public MainScreen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        playGame = new javax.swing.JButton();
        exitGame = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/baterply.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HI EBRIWAN <3");
        setBackground(new java.awt.Color(255, 102, 255));
        setForeground(new java.awt.Color(255, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playGame.setBackground(new java.awt.Color(255, 153, 153));
        playGame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playGame.setForeground(new java.awt.Color(255, 255, 204));
        playGame.setText("PLAY GAME");
        playGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playGameActionPerformed(evt);
            }
        });
        jPanel1.add(playGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 140, 60));

        exitGame.setBackground(new java.awt.Color(255, 153, 153));
        exitGame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitGame.setForeground(new java.awt.Color(255, 255, 204));
        exitGame.setText("EXIT GAME");
        exitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameActionPerformed(evt);
            }
        });
        jPanel1.add(exitGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 140, 60));

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 3, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Barbie's TicTacToe World");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 750, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/barbilat.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 500, 260));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/baterply.gif"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 150, 720, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/penk.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 460));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/baterply.gif"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 590, 380));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/penk.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 320, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 870, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void playGameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Main_Game TTT = new Main_Game();
        TTT.show();
        
        dispose();
    }                                        

    private void exitGameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
    }                                        

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton exitGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playGame;
    // End of variables declaration                   
}
