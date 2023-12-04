/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main_Game;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main_Game extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    
    public Main_Game () {
        initComponents();
    }

    private void GameScore(){
        PlayerX.setText(String.valueOf(xCount));
        PlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_player() {
        if(startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        }
        else {
            startGame = "X";
        } 
        Turn.setText("It's " + startGame + " Turn.");
        Turn2.setText("It's " + startGame + " Turn.");
    }
    
    private void WinningGame() {
        String b1 = Box1.getText();
        String b2 = Box2.getText();
        String b3 = Box3.getText();
        String b4 = Box4.getText();
        String b5 = Box5.getText();
        String b6 = Box6.getText();
        String b7 = Box7.getText();
        String b8 = Box8.getText();
        String b9 = Box9.getText();
        
         if (b1 == ("X") && b2 == ("X") && b3 ==("X")) {
            JOptionPane.showMessageDialog(this, "Playe X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            GameScore();
            reset(); 
        }
        if (b4 == ("X") && b5 == ("X") && b6 ==("X")) {
            JOptionPane.showMessageDialog(this, "Playe X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            GameScore();
            reset();
        }
        if (b7 == ("X") && b8 == ("X") && b9 ==("X")) {
            JOptionPane.showMessageDialog(this, "Playe X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            GameScore();
            reset();
        }
        if (b1 == ("X") && b4 == ("X") && b7 ==("X")) {
            JOptionPane.showMessageDialog(this, "Playe X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            GameScore();
            reset();
        }
        if (b2 == ("X") && b5 == ("X") && b8 ==("X")) {
            JOptionPane.showMessageDialog(this, "Playe X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            GameScore();
            reset();
        }
        if (b3 == ("X") && b6 == ("X") && b9 ==("X")) {
            JOptionPane.showMessageDialog(this, "Playe X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            GameScore();
            reset();
        }
        if (b1 == ("X") && b5 == ("X") && b9 ==("X")) {
            JOptionPane.showMessageDialog(this, "Playe X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            GameScore();
            reset();
        }
        if (b3 == ("X") && b5 == ("X") && b7 ==("X")) {
            JOptionPane.showMessageDialog(this, "Playe X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            GameScore();
            reset();
        }
        if (b1 == ("O") && b2 == ("O") && b3 ==("O")) {
            JOptionPane.showMessageDialog(this, "Playe O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            GameScore();
            reset();
        }
        if (b4 == ("O") && b5 == ("O") && b6 ==("O")) {
            JOptionPane.showMessageDialog(this, "Playe O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            GameScore();
            reset();
        }
        if (b7 == ("O") && b8 == ("O") && b9 ==("O")) {
            JOptionPane.showMessageDialog(this, "Playe O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            GameScore();
            reset();
        }
        if (b1 == ("O") && b4 == ("O") && b7 ==("O")) {
            JOptionPane.showMessageDialog(this, "Playe O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            GameScore();
            reset();
        }
        if (b2 == ("O") && b5 == ("O") && b8 ==("O")) {
            JOptionPane.showMessageDialog(this, "Playe O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            GameScore();
            reset();
        }
        if (b3 == ("O") && b6 == ("O") && b9 ==("O")) {
            JOptionPane.showMessageDialog(this, "Playe O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            GameScore();
            reset();
        }
        if (b1 == ("O") && b5 == ("O") && b9 ==("O")) {
            JOptionPane.showMessageDialog(this, "Playe O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            GameScore();
            reset();
        }
      
        if (b3 == ("O") && b5 == ("O") && b7 ==("O")) {
            JOptionPane.showMessageDialog(this, "Playe O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            GameScore();
            reset();
        }     
       
    }
    public void draw () {
        String b1 = Box1.getText();
        String b2 = Box2.getText();
        String b3 = Box3.getText();
        String b4 = Box4.getText();
        String b5 = Box5.getText();
        String b6 = Box6.getText();
        String b7 = Box7.getText();
        String b8 = Box8.getText();
        String b9 = Box9.getText();
        
        if (b1 != "" && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != "" && b9 != "") {
           JOptionPane.showMessageDialog(this, "It's a draw, No One Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
           reset();
        }
    }
    public void reset () {

                Box1.setText("");
                Box2.setText("");
                Box3.setText("");
                Box4.setText("");
                Box5.setText("");
                Box6.setText("");
                Box7.setText("");
                Box8.setText("");
                Box9.setText("");
                
                Box1.setEnabled(true);
                Box2.setEnabled(true);
                Box3.setEnabled(true);
                Box4.setEnabled(true);
                Box5.setEnabled(true);
                Box6.setEnabled(true);
                Box7.setEnabled(true);
                Box8.setEnabled(true);
                Box9.setEnabled(true);
                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Box2 = new javax.swing.JButton();
        Box4 = new javax.swing.JButton();
        Box5 = new javax.swing.JButton();
        Box6 = new javax.swing.JButton();
        Box8 = new javax.swing.JButton();
        Box9 = new javax.swing.JButton();
        Box3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        NewGame = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Box1 = new javax.swing.JButton();
        Box7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        PlayerO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Turn2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Turn = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        PlayerX = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barbie's TicTacToe World <3");
        setBackground(new java.awt.Color(255, 204, 204));
        setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        setForeground(new java.awt.Color(255, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Box2.setBackground(new java.awt.Color(255, 204, 204));
        Box2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        Box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box2ActionPerformed(evt);
            }
        });
        jPanel4.add(Box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, 110));

        Box4.setBackground(new java.awt.Color(255, 204, 204));
        Box4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        Box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box4ActionPerformed(evt);
            }
        });
        jPanel4.add(Box4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 110));

        Box5.setBackground(new java.awt.Color(255, 204, 204));
        Box5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        Box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box5ActionPerformed(evt);
            }
        });
        jPanel4.add(Box5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 110));

        Box6.setBackground(new java.awt.Color(255, 204, 204));
        Box6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        Box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box6ActionPerformed(evt);
            }
        });
        jPanel4.add(Box6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 130, 110));

        Box8.setBackground(new java.awt.Color(255, 204, 204));
        Box8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        Box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box8ActionPerformed(evt);
            }
        });
        jPanel4.add(Box8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 130, 110));

        Box9.setBackground(new java.awt.Color(255, 204, 204));
        Box9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        Box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box9ActionPerformed(evt);
            }
        });
        jPanel4.add(Box9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 130, 110));

        Box3.setBackground(new java.awt.Color(255, 204, 204));
        Box3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        Box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box3ActionPerformed(evt);
            }
        });
        jPanel4.add(Box3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 130, 110));

        jPanel3.setBackground(new java.awt.Color(255, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewGame.setBackground(new java.awt.Color(255, 204, 255));
        NewGame.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        NewGame.setText("New Game");
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });
        jPanel3.add(NewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 340, 60));

        Exit.setBackground(new java.awt.Color(255, 204, 255));
        Exit.setFont(new java.awt.Font("Ravie", 1, 20)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel3.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 130, 50));

        Menu.setBackground(new java.awt.Color(255, 204, 255));
        Menu.setFont(new java.awt.Font("Ravie", 1, 25)); // NOI18N
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel3.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 50));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 430, 160));

        Box1.setBackground(new java.awt.Color(255, 204, 204));
        Box1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        Box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1ActionPerformed(evt);
            }
        });
        jPanel4.add(Box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 110));

        Box7.setBackground(new java.awt.Color(255, 204, 204));
        Box7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        Box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box7ActionPerformed(evt);
            }
        });
        jPanel4.add(Box7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/baterply.gif"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -140, 470, 320));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/baterply.gif"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 470, 320));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 490, 560));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayerO.setBackground(new java.awt.Color(255, 153, 153));
        PlayerO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerO.setText("0");
        PlayerO.setOpaque(true);
        jPanel6.add(PlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 130, 50));

        jLabel3.setFont(new java.awt.Font("Playbill", 1, 18)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 50));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 260, 70));

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Turn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Turn2.setForeground(new java.awt.Color(204, 0, 102));
        Turn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(Turn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 50));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 260, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("BARBIE");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 180, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/pakner.jpg"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 360, 600));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 310, 560));

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 3, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Duday and Ester's TicTacToe");
        jLabel5.setToolTipText("");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 950, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1160, 60));

        jPanel9.setBackground(new java.awt.Color(255, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Turn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Turn.setForeground(new java.awt.Color(204, 0, 102));
        Turn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(Turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 50));

        jPanel9.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 260, 50));

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayerX.setBackground(new java.awt.Color(255, 153, 153));
        PlayerX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerX.setText("0");
        PlayerX.setOpaque(true);
        jPanel10.add(PlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 130, 60));

        jLabel7.setFont(new java.awt.Font("Playbill", 1, 18)); // NOI18N
        jLabel7.setText("Player X:");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 60));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 260, 80));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("KEN");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Game/ken.jpg"))); // NOI18N
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 520, 830));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 310, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    private JFrame frame;
    
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        frame = new JFrame ("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit <3", "Tic Tac Toe",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
        System.exit(0);
        }
    }                                    

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {                                     
        MainScreen SC = new MainScreen();
        SC.show();
        
        dispose();
    }                                    

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        reset();
        
        PlayerX.setText("0");
        PlayerO.setText("0");

        Box1.setBackground(Color.PINK);
        Box2.setBackground(Color.PINK);
        Box3.setBackground(Color.PINK);
        Box4.setBackground(Color.PINK);
        Box5.setBackground(Color.PINK);
        Box6.setBackground(Color.PINK);
        Box7.setBackground(Color.PINK);
        Box8.setBackground(Color.PINK);
        Box9.setBackground(Color.PINK);
        
        xCount = 0;
        oCount = 0;
    }                                       

    private void Box1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Box1.setText(startGame);

        if(startGame.equalsIgnoreCase("X")) {
            Box1.setForeground(Color.BLACK);
            Box1.setEnabled(false);
        }
        else {
            Box1.setForeground(Color.BLACK);
            Box1.setEnabled(false);
        }
        choose_player();
        WinningGame();
        draw();
    }                                    

    private void Box2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Box2.setText(startGame);

        if(startGame.equalsIgnoreCase("X")) {
            Box2.setForeground(Color.BLACK);
            Box2.setEnabled(false);
        }
        else {
            Box2.setForeground(Color.BLACK);
            Box2.setEnabled(false);
        }
        choose_player();
        WinningGame();
        draw();
    }                                    

    private void Box3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Box3.setText(startGame);

        if(startGame.equalsIgnoreCase("X")) {
            Box3.setForeground(Color.BLACK);
            Box3.setEnabled(false);
        }
        else {
            Box3.setForeground(Color.BLACK);
            Box3.setEnabled(false);
        }
        choose_player();
        WinningGame();
        draw();
    }                                    

    private void Box4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
         Box4.setText(startGame);

        if(startGame.equalsIgnoreCase("X")) {
            Box4.setForeground(Color.BLACK);
            Box4.setEnabled(false);
        }
        else {
            Box4.setForeground(Color.BLACK);
            Box4.setEnabled(false);
        }
        choose_player();
        WinningGame();
        draw();
    }                                    

    private void Box5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
         Box5.setText(startGame);

        if(startGame.equalsIgnoreCase("X")) {
            Box5.setForeground(Color.BLACK);
            Box5.setEnabled(false);
        }
        else {
            Box5.setForeground(Color.BLACK);
            Box5.setEnabled(false);
        }
        choose_player();
        WinningGame();
        draw();
    }                                    

    private void Box6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
         Box6.setText(startGame);

        if(startGame.equalsIgnoreCase("X")) {
            Box6.setForeground(Color.BLACK);
            Box6.setEnabled(false);
        }
        else {
            Box6.setForeground(Color.BLACK);
            Box6.setEnabled(false);
        }
        choose_player();
        WinningGame();
        draw();
    }                                    

    private void Box7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
         Box7.setText(startGame);

        if(startGame.equalsIgnoreCase("X")) {
            Box7.setForeground(Color.BLACK);
            Box7.setEnabled(false);
        }
        else {
            Box7.setForeground(Color.BLACK);
            Box7.setEnabled(false);
            
        }
        choose_player();
        WinningGame();
        draw();
    }                                    

    private void Box8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
         Box8.setText(startGame);

        if(startGame.equalsIgnoreCase("X")) {
            Box8.setForeground(Color.BLACK);
            Box8.setEnabled(false);
        }
        else {
            Box8.setForeground(Color.BLACK);
            Box8.setEnabled(false);
        }
        choose_player();
        WinningGame();
        draw();
    }                                    

    private void Box9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
         Box9.setText(startGame);

        if(startGame.equalsIgnoreCase("X")) {
            Box9.setForeground(Color.BLACK);
            Box9.setEnabled(false);
        }
        else {
            Box9.setForeground(Color.BLACK);
            Box9.setEnabled(false);
        }
        choose_player();
        WinningGame();
        draw();
    }                                    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Box1;
    private javax.swing.JButton Box2;
    private javax.swing.JButton Box3;
    private javax.swing.JButton Box4;
    private javax.swing.JButton Box5;
    private javax.swing.JButton Box6;
    private javax.swing.JButton Box7;
    private javax.swing.JButton Box8;
    private javax.swing.JButton Box9;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Menu;
    private javax.swing.JButton NewGame;
    private javax.swing.JLabel PlayerO;
    private javax.swing.JLabel PlayerX;
    private javax.swing.JLabel Turn;
    private javax.swing.JLabel Turn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration                   
}
