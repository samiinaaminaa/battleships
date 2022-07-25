
/**
 * Battleship Game where the player competes against the computer to sink each others ship
 *
 * modified     20220725
 * date         20220722
 * @filename    BattleshipsBoard.java
 * @author(s)   Team T1
 * @version     1.4.0
 * @see N/A
 */

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class BattleshipsBoard extends javax.swing.JFrame {

    public BattleshipsBoard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GA1 = new javax.swing.JButton();
        GA2 = new javax.swing.JButton();
        GA3 = new javax.swing.JButton();
        GA4 = new javax.swing.JButton();
        GA5 = new javax.swing.JButton();
        GB1 = new javax.swing.JButton();
        GB2 = new javax.swing.JButton();
        GB3 = new javax.swing.JButton();
        GB4 = new javax.swing.JButton();
        GB5 = new javax.swing.JButton();
        GC1 = new javax.swing.JButton();
        GC2 = new javax.swing.JButton();
        GC3 = new javax.swing.JButton();
        GC4 = new javax.swing.JButton();
        GC5 = new javax.swing.JButton();
        GD1 = new javax.swing.JButton();
        GD2 = new javax.swing.JButton();
        GD3 = new javax.swing.JButton();
        GD4 = new javax.swing.JButton();
        GD5 = new javax.swing.JButton();
        GE1 = new javax.swing.JButton();
        GE2 = new javax.swing.JButton();
        TE3 = new javax.swing.JButton();
        GE3 = new javax.swing.JButton();
        GE5 = new javax.swing.JButton();
        TA1 = new javax.swing.JButton();
        TA2 = new javax.swing.JButton();
        TA3 = new javax.swing.JButton();
        TA4 = new javax.swing.JButton();
        TA5 = new javax.swing.JButton();
        TB1 = new javax.swing.JButton();
        TB2 = new javax.swing.JButton();
        TB3 = new javax.swing.JButton();
        TB4 = new javax.swing.JButton();
        TB5 = new javax.swing.JButton();
        TC1 = new javax.swing.JButton();
        TC2 = new javax.swing.JButton();
        TC3 = new javax.swing.JButton();
        TC4 = new javax.swing.JButton();
        TC5 = new javax.swing.JButton();
        TD1 = new javax.swing.JButton();
        TD2 = new javax.swing.JButton();
        TD3 = new javax.swing.JButton();
        TD4 = new javax.swing.JButton();
        TD5 = new javax.swing.JButton();
        TE1 = new javax.swing.JButton();
        TE2 = new javax.swing.JButton();
        GE4 = new javax.swing.JButton();
        TE4 = new javax.swing.JButton();
        TE5 = new javax.swing.JButton();
        arrow = new javax.swing.JButton();
        playAgain = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        cpuSalvoLabel = new javax.swing.JLabel();
        playerSalvoLabel = new javax.swing.JLabel();
        backdrop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GA1.setBackground(new java.awt.Color(153, 102, 255));
        GA1.setForeground(new java.awt.Color(0, 0, 0));
        GA1.setText("jButton1");
        GA1.setBorder(null);
        GA1.setBorderPainted(false);
        GA1.setContentAreaFilled(false);
        GA1.setFocusable(false);
        GA1.setRequestFocusEnabled(false);
        GA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GA1ActionPerformed(evt);
            }
        });
        getContentPane().add(GA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 428, 80, 49));

        GA2.setBackground(new java.awt.Color(153, 102, 255));
        GA2.setForeground(new java.awt.Color(0, 0, 0));
        GA2.setText("jButton1");
        GA2.setBorder(null);
        GA2.setBorderPainted(false);
        GA2.setContentAreaFilled(false);
        GA2.setFocusable(false);
        GA2.setRequestFocusEnabled(false);
        GA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GA2ActionPerformed(evt);
            }
        });
        getContentPane().add(GA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 492, 80, 49));

        GA3.setBackground(new java.awt.Color(153, 102, 255));
        GA3.setForeground(new java.awt.Color(0, 0, 0));
        GA3.setText("jButton1");
        GA3.setBorder(null);
        GA3.setBorderPainted(false);
        GA3.setContentAreaFilled(false);
        GA3.setFocusable(false);
        GA3.setRequestFocusEnabled(false);
        GA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GA3ActionPerformed(evt);
            }
        });
        getContentPane().add(GA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 556, 80, 49));

        GA4.setBackground(new java.awt.Color(153, 102, 255));
        GA4.setForeground(new java.awt.Color(0, 0, 0));
        GA4.setText("jButton1");
        GA4.setBorder(null);
        GA4.setBorderPainted(false);
        GA4.setContentAreaFilled(false);
        GA4.setFocusable(false);
        GA4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        GA4.setRequestFocusEnabled(false);
        GA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GA4ActionPerformed(evt);
            }
        });
        getContentPane().add(GA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 620, 80, 49));

        GA5.setBackground(new java.awt.Color(153, 102, 255));
        GA5.setForeground(new java.awt.Color(0, 0, 0));
        GA5.setText("jButton1");
        GA5.setBorder(null);
        GA5.setBorderPainted(false);
        GA5.setContentAreaFilled(false);
        GA5.setFocusable(false);
        GA5.setRequestFocusEnabled(false);
        GA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GA5ActionPerformed(evt);
            }
        });
        getContentPane().add(GA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 684, 80, 49));

        GB1.setBackground(new java.awt.Color(153, 102, 255));
        GB1.setForeground(new java.awt.Color(0, 0, 0));
        GB1.setText("jButton1");
        GB1.setBorder(null);
        GB1.setBorderPainted(false);
        GB1.setContentAreaFilled(false);
        GB1.setFocusable(false);
        GB1.setRequestFocusEnabled(false);
        GB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GB1ActionPerformed(evt);
            }
        });
        getContentPane().add(GB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 428, 78, 49));

        GB2.setBackground(new java.awt.Color(153, 102, 255));
        GB2.setForeground(new java.awt.Color(0, 0, 0));
        GB2.setText("jButton1");
        GB2.setBorder(null);
        GB2.setBorderPainted(false);
        GB2.setContentAreaFilled(false);
        GB2.setFocusable(false);
        GB2.setRequestFocusEnabled(false);
        GB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GB2ActionPerformed(evt);
            }
        });
        getContentPane().add(GB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 492, 78, 49));

        GB3.setBackground(new java.awt.Color(153, 102, 255));
        GB3.setForeground(new java.awt.Color(0, 0, 0));
        GB3.setText("jButton1");
        GB3.setBorder(null);
        GB3.setBorderPainted(false);
        GB3.setContentAreaFilled(false);
        GB3.setFocusable(false);
        GB3.setRequestFocusEnabled(false);
        GB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GB3ActionPerformed(evt);
            }
        });
        getContentPane().add(GB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 556, 78, 49));

        GB4.setBackground(new java.awt.Color(153, 102, 255));
        GB4.setForeground(new java.awt.Color(0, 0, 0));
        GB4.setText("jButton1");
        GB4.setBorder(null);
        GB4.setBorderPainted(false);
        GB4.setContentAreaFilled(false);
        GB4.setFocusable(false);
        GB4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        GB4.setRequestFocusEnabled(false);
        GB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GB4ActionPerformed(evt);
            }
        });
        getContentPane().add(GB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 620, 78, 49));

        GB5.setBackground(new java.awt.Color(153, 102, 255));
        GB5.setForeground(new java.awt.Color(0, 0, 0));
        GB5.setText("jButton1");
        GB5.setBorder(null);
        GB5.setBorderPainted(false);
        GB5.setContentAreaFilled(false);
        GB5.setFocusable(false);
        GB5.setRequestFocusEnabled(false);
        GB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GB5ActionPerformed(evt);
            }
        });
        getContentPane().add(GB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 684, 78, 49));

        GC1.setBackground(new java.awt.Color(153, 102, 255));
        GC1.setForeground(new java.awt.Color(0, 0, 0));
        GC1.setText("jButton1");
        GC1.setBorder(null);
        GC1.setBorderPainted(false);
        GC1.setContentAreaFilled(false);
        GC1.setFocusable(false);
        GC1.setRequestFocusEnabled(false);
        GC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GC1ActionPerformed(evt);
            }
        });
        getContentPane().add(GC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 428, 79, 49));

        GC2.setBackground(new java.awt.Color(153, 102, 255));
        GC2.setForeground(new java.awt.Color(0, 0, 0));
        GC2.setText("jButton1");
        GC2.setBorder(null);
        GC2.setBorderPainted(false);
        GC2.setContentAreaFilled(false);
        GC2.setFocusable(false);
        GC2.setRequestFocusEnabled(false);
        GC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GC2ActionPerformed(evt);
            }
        });
        getContentPane().add(GC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 492, 79, 49));

        GC3.setBackground(new java.awt.Color(153, 102, 255));
        GC3.setForeground(new java.awt.Color(0, 0, 0));
        GC3.setText("jButton1");
        GC3.setBorder(null);
        GC3.setBorderPainted(false);
        GC3.setContentAreaFilled(false);
        GC3.setFocusable(false);
        GC3.setRequestFocusEnabled(false);
        GC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GC3ActionPerformed(evt);
            }
        });
        getContentPane().add(GC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 556, 79, 49));

        GC4.setBackground(new java.awt.Color(153, 102, 255));
        GC4.setForeground(new java.awt.Color(0, 0, 0));
        GC4.setText("jButton1");
        GC4.setBorder(null);
        GC4.setBorderPainted(false);
        GC4.setContentAreaFilled(false);
        GC4.setFocusable(false);
        GC4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        GC4.setRequestFocusEnabled(false);
        GC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GC4ActionPerformed(evt);
            }
        });
        getContentPane().add(GC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 620, 79, 49));

        GC5.setBackground(new java.awt.Color(153, 102, 255));
        GC5.setForeground(new java.awt.Color(0, 0, 0));
        GC5.setText("jButton1");
        GC5.setBorder(null);
        GC5.setBorderPainted(false);
        GC5.setContentAreaFilled(false);
        GC5.setFocusable(false);
        GC5.setRequestFocusEnabled(false);
        GC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GC5ActionPerformed(evt);
            }
        });
        getContentPane().add(GC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 684, 79, 49));

        GD1.setBackground(new java.awt.Color(153, 102, 255));
        GD1.setForeground(new java.awt.Color(0, 0, 0));
        GD1.setText("jButton1");
        GD1.setBorder(null);
        GD1.setBorderPainted(false);
        GD1.setContentAreaFilled(false);
        GD1.setFocusable(false);
        GD1.setRequestFocusEnabled(false);
        GD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GD1ActionPerformed(evt);
            }
        });
        getContentPane().add(GD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 428, 79, 49));

        GD2.setBackground(new java.awt.Color(153, 102, 255));
        GD2.setForeground(new java.awt.Color(0, 0, 0));
        GD2.setText("jButton1");
        GD2.setBorder(null);
        GD2.setBorderPainted(false);
        GD2.setContentAreaFilled(false);
        GD2.setFocusable(false);
        GD2.setRequestFocusEnabled(false);
        GD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GD2ActionPerformed(evt);
            }
        });
        getContentPane().add(GD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 492, 79, 49));

        GD3.setBackground(new java.awt.Color(153, 102, 255));
        GD3.setForeground(new java.awt.Color(0, 0, 0));
        GD3.setText("jButton1");
        GD3.setBorder(null);
        GD3.setBorderPainted(false);
        GD3.setContentAreaFilled(false);
        GD3.setFocusable(false);
        GD3.setRequestFocusEnabled(false);
        GD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GD3ActionPerformed(evt);
            }
        });
        getContentPane().add(GD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 556, 79, 49));

        GD4.setBackground(new java.awt.Color(153, 102, 255));
        GD4.setForeground(new java.awt.Color(0, 0, 0));
        GD4.setText("jButton1");
        GD4.setBorder(null);
        GD4.setBorderPainted(false);
        GD4.setContentAreaFilled(false);
        GD4.setFocusable(false);
        GD4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        GD4.setRequestFocusEnabled(false);
        GD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GD4ActionPerformed(evt);
            }
        });
        getContentPane().add(GD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 620, 79, 49));

        GD5.setBackground(new java.awt.Color(153, 102, 255));
        GD5.setForeground(new java.awt.Color(0, 0, 0));
        GD5.setText("jButton1");
        GD5.setBorder(null);
        GD5.setBorderPainted(false);
        GD5.setContentAreaFilled(false);
        GD5.setFocusable(false);
        GD5.setRequestFocusEnabled(false);
        GD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GD5ActionPerformed(evt);
            }
        });
        getContentPane().add(GD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 684, 79, 49));

        GE1.setBackground(new java.awt.Color(153, 102, 255));
        GE1.setForeground(new java.awt.Color(0, 0, 0));
        GE1.setText("jButton1");
        GE1.setBorder(null);
        GE1.setBorderPainted(false);
        GE1.setContentAreaFilled(false);
        GE1.setFocusable(false);
        GE1.setRequestFocusEnabled(false);
        GE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GE1ActionPerformed(evt);
            }
        });
        getContentPane().add(GE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 428, 79, 49));

        GE2.setBackground(new java.awt.Color(153, 102, 255));
        GE2.setForeground(new java.awt.Color(0, 0, 0));
        GE2.setText("jButton1");
        GE2.setBorder(null);
        GE2.setBorderPainted(false);
        GE2.setContentAreaFilled(false);
        GE2.setFocusable(false);
        GE2.setRequestFocusEnabled(false);
        GE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GE2ActionPerformed(evt);
            }
        });
        getContentPane().add(GE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 492, 79, 49));

        TE3.setBackground(new java.awt.Color(153, 102, 255));
        TE3.setForeground(new java.awt.Color(0, 0, 0));
        TE3.setText("jButton1");
        TE3.setBorder(null);
        TE3.setBorderPainted(false);
        TE3.setContentAreaFilled(false);
        TE3.setFocusable(false);
        TE3.setRequestFocusEnabled(false);
        TE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE3ActionPerformed(evt);
            }
        });
        getContentPane().add(TE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 206, 79, 50));

        GE3.setBackground(new java.awt.Color(153, 102, 255));
        GE3.setForeground(new java.awt.Color(0, 0, 0));
        GE3.setText("jButton1");
        GE3.setBorder(null);
        GE3.setBorderPainted(false);
        GE3.setContentAreaFilled(false);
        GE3.setFocusable(false);
        GE3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        GE3.setRequestFocusEnabled(false);
        GE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GE3ActionPerformed(evt);
            }
        });
        getContentPane().add(GE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 556, 79, 49));

        GE5.setBackground(new java.awt.Color(153, 102, 255));
        GE5.setForeground(new java.awt.Color(0, 0, 0));
        GE5.setText("jButton1");
        GE5.setBorder(null);
        GE5.setBorderPainted(false);
        GE5.setContentAreaFilled(false);
        GE5.setFocusable(false);
        GE5.setRequestFocusEnabled(false);
        GE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GE5ActionPerformed(evt);
            }
        });
        getContentPane().add(GE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 684, 79, 49));

        TA1.setBackground(new java.awt.Color(153, 102, 255));
        TA1.setForeground(new java.awt.Color(0, 0, 0));
        TA1.setText("jButton1");
        TA1.setBorder(null);
        TA1.setBorderPainted(false);
        TA1.setContentAreaFilled(false);
        TA1.setFocusable(false);
        TA1.setRequestFocusEnabled(false);
        TA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TA1ActionPerformed(evt);
            }
        });
        getContentPane().add(TA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 77, 80, 50));
        TA1.getAccessibleContext().setAccessibleName("TA1");

        TA2.setBackground(new java.awt.Color(153, 102, 255));
        TA2.setForeground(new java.awt.Color(0, 0, 0));
        TA2.setText("jButton1");
        TA2.setBorder(null);
        TA2.setBorderPainted(false);
        TA2.setContentAreaFilled(false);
        TA2.setFocusable(false);
        TA2.setRequestFocusEnabled(false);
        TA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TA2ActionPerformed(evt);
            }
        });
        getContentPane().add(TA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 142, 80, 50));

        TA3.setBackground(new java.awt.Color(153, 102, 255));
        TA3.setForeground(new java.awt.Color(0, 0, 0));
        TA3.setText("jButton1");
        TA3.setBorder(null);
        TA3.setBorderPainted(false);
        TA3.setContentAreaFilled(false);
        TA3.setFocusable(false);
        TA3.setRequestFocusEnabled(false);
        TA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TA3ActionPerformed(evt);
            }
        });
        getContentPane().add(TA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 206, 80, 50));

        TA4.setBackground(new java.awt.Color(153, 102, 255));
        TA4.setForeground(new java.awt.Color(0, 0, 0));
        TA4.setText("jButton1");
        TA4.setBorder(null);
        TA4.setBorderPainted(false);
        TA4.setContentAreaFilled(false);
        TA4.setFocusable(false);
        TA4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        TA4.setRequestFocusEnabled(false);
        TA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TA4ActionPerformed(evt);
            }
        });
        getContentPane().add(TA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 270, 80, 50));

        TA5.setBackground(new java.awt.Color(153, 102, 255));
        TA5.setForeground(new java.awt.Color(0, 0, 0));
        TA5.setText("jButton1");
        TA5.setBorder(null);
        TA5.setBorderPainted(false);
        TA5.setContentAreaFilled(false);
        TA5.setFocusable(false);
        TA5.setRequestFocusEnabled(false);
        TA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TA5ActionPerformed(evt);
            }
        });
        getContentPane().add(TA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 333, 80, 51));

        TB1.setBackground(new java.awt.Color(153, 102, 255));
        TB1.setForeground(new java.awt.Color(0, 0, 0));
        TB1.setText("jButton1");
        TB1.setBorder(null);
        TB1.setBorderPainted(false);
        TB1.setContentAreaFilled(false);
        TB1.setFocusable(false);
        TB1.setRequestFocusEnabled(false);
        TB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB1ActionPerformed(evt);
            }
        });
        getContentPane().add(TB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 77, 78, 50));

        TB2.setBackground(new java.awt.Color(153, 102, 255));
        TB2.setForeground(new java.awt.Color(0, 0, 0));
        TB2.setText("jButton1");
        TB2.setBorder(null);
        TB2.setBorderPainted(false);
        TB2.setContentAreaFilled(false);
        TB2.setFocusable(false);
        TB2.setRequestFocusEnabled(false);
        TB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB2ActionPerformed(evt);
            }
        });
        getContentPane().add(TB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 142, 79, 50));

        TB3.setBackground(new java.awt.Color(153, 102, 255));
        TB3.setForeground(new java.awt.Color(0, 0, 0));
        TB3.setText("jButton1");
        TB3.setBorder(null);
        TB3.setBorderPainted(false);
        TB3.setContentAreaFilled(false);
        TB3.setFocusable(false);
        TB3.setRequestFocusEnabled(false);
        TB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB3ActionPerformed(evt);
            }
        });
        getContentPane().add(TB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 206, 78, 50));

        TB4.setBackground(new java.awt.Color(153, 102, 255));
        TB4.setForeground(new java.awt.Color(0, 0, 0));
        TB4.setText("jButton1");
        TB4.setBorder(null);
        TB4.setBorderPainted(false);
        TB4.setContentAreaFilled(false);
        TB4.setFocusable(false);
        TB4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        TB4.setRequestFocusEnabled(false);
        TB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB4ActionPerformed(evt);
            }
        });
        getContentPane().add(TB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 270, 78, 50));

        TB5.setBackground(new java.awt.Color(153, 102, 255));
        TB5.setForeground(new java.awt.Color(0, 0, 0));
        TB5.setText("jButton1");
        TB5.setBorder(null);
        TB5.setBorderPainted(false);
        TB5.setContentAreaFilled(false);
        TB5.setFocusable(false);
        TB5.setRequestFocusEnabled(false);
        TB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB5ActionPerformed(evt);
            }
        });
        getContentPane().add(TB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 334, 78, 51));

        TC1.setBackground(new java.awt.Color(153, 102, 255));
        TC1.setForeground(new java.awt.Color(0, 0, 0));
        TC1.setText("jButton1");
        TC1.setBorder(null);
        TC1.setBorderPainted(false);
        TC1.setContentAreaFilled(false);
        TC1.setFocusable(false);
        TC1.setRequestFocusEnabled(false);
        TC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TC1ActionPerformed(evt);
            }
        });
        getContentPane().add(TC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 77, 79, 50));

        TC2.setBackground(new java.awt.Color(153, 102, 255));
        TC2.setForeground(new java.awt.Color(0, 0, 0));
        TC2.setText("jButton1");
        TC2.setBorder(null);
        TC2.setBorderPainted(false);
        TC2.setContentAreaFilled(false);
        TC2.setFocusable(false);
        TC2.setRequestFocusEnabled(false);
        TC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TC2ActionPerformed(evt);
            }
        });
        getContentPane().add(TC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 142, 79, 50));

        TC3.setBackground(new java.awt.Color(153, 102, 255));
        TC3.setForeground(new java.awt.Color(0, 0, 0));
        TC3.setText("jButton1");
        TC3.setBorder(null);
        TC3.setBorderPainted(false);
        TC3.setContentAreaFilled(false);
        TC3.setFocusable(false);
        TC3.setRequestFocusEnabled(false);
        TC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TC3ActionPerformed(evt);
            }
        });
        getContentPane().add(TC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 206, 79, 50));

        TC4.setBackground(new java.awt.Color(153, 102, 255));
        TC4.setForeground(new java.awt.Color(0, 0, 0));
        TC4.setText("jButton1");
        TC4.setBorder(null);
        TC4.setBorderPainted(false);
        TC4.setContentAreaFilled(false);
        TC4.setFocusable(false);
        TC4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        TC4.setRequestFocusEnabled(false);
        TC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TC4ActionPerformed(evt);
            }
        });
        getContentPane().add(TC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 270, 79, 50));

        TC5.setBackground(new java.awt.Color(153, 102, 255));
        TC5.setForeground(new java.awt.Color(0, 0, 0));
        TC5.setText("jButton1");
        TC5.setBorder(null);
        TC5.setBorderPainted(false);
        TC5.setContentAreaFilled(false);
        TC5.setFocusable(false);
        TC5.setRequestFocusEnabled(false);
        TC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TC5ActionPerformed(evt);
            }
        });
        getContentPane().add(TC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 333, 79, 51));

        TD1.setBackground(new java.awt.Color(153, 102, 255));
        TD1.setForeground(new java.awt.Color(0, 0, 0));
        TD1.setText("jButton1");
        TD1.setBorder(null);
        TD1.setBorderPainted(false);
        TD1.setContentAreaFilled(false);
        TD1.setFocusable(false);
        TD1.setRequestFocusEnabled(false);
        TD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TD1ActionPerformed(evt);
            }
        });
        getContentPane().add(TD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 77, 79, 50));

        TD2.setBackground(new java.awt.Color(153, 102, 255));
        TD2.setForeground(new java.awt.Color(0, 0, 0));
        TD2.setText("jButton1");
        TD2.setBorder(null);
        TD2.setBorderPainted(false);
        TD2.setContentAreaFilled(false);
        TD2.setFocusable(false);
        TD2.setRequestFocusEnabled(false);
        TD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TD2ActionPerformed(evt);
            }
        });
        getContentPane().add(TD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 142, 79, 50));

        TD3.setBackground(new java.awt.Color(153, 102, 255));
        TD3.setForeground(new java.awt.Color(0, 0, 0));
        TD3.setText("jButton1");
        TD3.setBorder(null);
        TD3.setBorderPainted(false);
        TD3.setContentAreaFilled(false);
        TD3.setFocusable(false);
        TD3.setRequestFocusEnabled(false);
        TD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TD3ActionPerformed(evt);
            }
        });
        getContentPane().add(TD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 206, 79, 50));

        TD4.setBackground(new java.awt.Color(153, 102, 255));
        TD4.setForeground(new java.awt.Color(0, 0, 0));
        TD4.setText("jButton1");
        TD4.setBorder(null);
        TD4.setBorderPainted(false);
        TD4.setContentAreaFilled(false);
        TD4.setFocusable(false);
        TD4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        TD4.setRequestFocusEnabled(false);
        TD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TD4ActionPerformed(evt);
            }
        });
        getContentPane().add(TD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 270, 79, 50));

        TD5.setBackground(new java.awt.Color(153, 102, 255));
        TD5.setForeground(new java.awt.Color(0, 0, 0));
        TD5.setText("jButton1");
        TD5.setBorder(null);
        TD5.setBorderPainted(false);
        TD5.setContentAreaFilled(false);
        TD5.setFocusable(false);
        TD5.setRequestFocusEnabled(false);
        TD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TD5ActionPerformed(evt);
            }
        });
        getContentPane().add(TD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 333, 79, 50));

        TE1.setBackground(new java.awt.Color(153, 102, 255));
        TE1.setForeground(new java.awt.Color(0, 0, 0));
        TE1.setText("jButton1");
        TE1.setBorder(null);
        TE1.setBorderPainted(false);
        TE1.setContentAreaFilled(false);
        TE1.setFocusable(false);
        TE1.setRequestFocusEnabled(false);
        TE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE1ActionPerformed(evt);
            }
        });
        getContentPane().add(TE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 77, 79, 50));

        TE2.setBackground(new java.awt.Color(153, 102, 255));
        TE2.setForeground(new java.awt.Color(0, 0, 0));
        TE2.setText("jButton1");
        TE2.setBorder(null);
        TE2.setBorderPainted(false);
        TE2.setContentAreaFilled(false);
        TE2.setFocusable(false);
        TE2.setRequestFocusEnabled(false);
        TE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE2ActionPerformed(evt);
            }
        });
        getContentPane().add(TE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 142, 79, 50));

        GE4.setBackground(new java.awt.Color(153, 102, 255));
        GE4.setForeground(new java.awt.Color(0, 0, 0));
        GE4.setText("jButton1");
        GE4.setBorder(null);
        GE4.setBorderPainted(false);
        GE4.setContentAreaFilled(false);
        GE4.setFocusable(false);
        GE4.setRequestFocusEnabled(false);
        GE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GE4ActionPerformed(evt);
            }
        });
        getContentPane().add(GE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 620, 79, 49));

        TE4.setBackground(new java.awt.Color(153, 102, 255));
        TE4.setForeground(new java.awt.Color(0, 0, 0));
        TE4.setText("jButton1");
        TE4.setBorder(null);
        TE4.setBorderPainted(false);
        TE4.setContentAreaFilled(false);
        TE4.setFocusable(false);
        TE4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        TE4.setRequestFocusEnabled(false);
        TE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE4ActionPerformed(evt);
            }
        });
        getContentPane().add(TE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 270, 79, 50));

        TE5.setBackground(new java.awt.Color(153, 102, 255));
        TE5.setForeground(new java.awt.Color(0, 0, 0));
        TE5.setText("jButton1");
        TE5.setBorder(null);
        TE5.setBorderPainted(false);
        TE5.setContentAreaFilled(false);
        TE5.setFocusable(false);
        TE5.setRequestFocusEnabled(false);
        TE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE5ActionPerformed(evt);
            }
        });
        getContentPane().add(TE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 333, 79, 51));

        arrow.setBorder(null);
        arrow.setBorderPainted(false);
        arrow.setContentAreaFilled(false);
        arrow.setEnabled(false);
        arrow.setFocusPainted(false);
        arrow.setFocusable(false);
        arrow.setLabel("");
        arrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrowActionPerformed(evt);
            }
        });
        getContentPane().add(arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 815, 44, 50));
        arrow.getAccessibleContext().setAccessibleName("arrow");

        playAgain.setBackground(new java.awt.Color(204, 47, 47));
        playAgain.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        playAgain.setForeground(new java.awt.Color(0, 0, 0));
        playAgain.setBorder(null);
        playAgain.setBorderPainted(false);
        playAgain.setContentAreaFilled(false);
        playAgain.setDefaultCapable(false);
        playAgain.setEnabled(false);
        playAgain.setFocusPainted(false);
        playAgain.setFocusable(false);
        playAgain.setRequestFocusEnabled(false);
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });
        getContentPane().add(playAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 390, 133, 30));

        label.setFont(new java.awt.Font("Impact", 0, 30)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("PLACE YOUR SHIP");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 815, 260, 46));

        cpuSalvoLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        cpuSalvoLabel.setForeground(new java.awt.Color(204, 204, 204));
        cpuSalvoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpuSalvoLabel.setText("0");
        cpuSalvoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cpuSalvoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 385, 35, 40));

        playerSalvoLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        playerSalvoLabel.setForeground(new java.awt.Color(204, 204, 204));
        playerSalvoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerSalvoLabel.setText("0");
        playerSalvoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(playerSalvoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 385, 35, 40));

        backdrop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Base Board.png"))); // NOI18N
        getContentPane().add(backdrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String playerPos;
    int cpuSalvo;
    int playerSalvo;
    boolean buttonClicked = true;
    String cpuPos = randomCPU();

    private void GA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GA3ActionPerformed
        GA3.setBackground(Color.GRAY);
        GA3.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA1.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GA3";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GA3ActionPerformed

    private void GA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GA1ActionPerformed
        GA1.setBackground(Color.GRAY);
        GA1.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GA1";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GA1ActionPerformed

    private void GA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GA5ActionPerformed
        GA5.setBackground(Color.GRAY);
        GA5.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA1.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GA5";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GA5ActionPerformed

    private void GA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GA2ActionPerformed
        GA2.setBackground(Color.GRAY);
        GA2.setContentAreaFilled(true);
        buttonClicked = false;

        GA1.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GA2";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GA2ActionPerformed

    private void GA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GA4ActionPerformed
        GA4.setBackground(Color.GRAY);
        GA4.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA1.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GA4";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GA4ActionPerformed

    private void GB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GB4ActionPerformed
        GB4.setBackground(Color.GRAY);
        GB4.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GA1.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GB4";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GB4ActionPerformed

    private void GB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GB1ActionPerformed
        GB1.setBackground(Color.GRAY);
        GB1.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GA1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GB1";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GB1ActionPerformed

    private void GB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GB2ActionPerformed
        GB2.setBackground(Color.GRAY);
        GB2.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GA1.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GB2";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GB2ActionPerformed

    private void GB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GB3ActionPerformed
        GB3.setBackground(Color.GRAY);
        GB3.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GA1.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GB3";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GB3ActionPerformed

    private void GB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GB5ActionPerformed
        GB5.setBackground(Color.GRAY);
        GB5.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GA1.setEnabled(false);
        GC1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GB5";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GB5ActionPerformed

    private void GC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GC1ActionPerformed
        GC1.setBackground(Color.GRAY);
        GC1.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GA1.setEnabled(false);
        GC2.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GC1";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GC1ActionPerformed

    private void GC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GC2ActionPerformed
        GC2.setBackground(Color.GRAY);
        GC2.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GC2";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GC2ActionPerformed

    private void GC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GC3ActionPerformed
        GC3.setBackground(Color.GRAY);
        GC3.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC2.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GC3";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GC3ActionPerformed

    private void GC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GC4ActionPerformed
        GC4.setBackground(Color.GRAY);
        GC4.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC2.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GC4";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GC4ActionPerformed

    private void GC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GC5ActionPerformed
        GC5.setBackground(Color.GRAY);
        GC5.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC2.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GC5";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GC5ActionPerformed

    private void GD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GD5ActionPerformed
        GD5.setBackground(Color.GRAY);
        GD5.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GC2.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GD5";
        label.setText("FIRE ON A SECTOR");

    }//GEN-LAST:event_GD5ActionPerformed

    private void GD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GD4ActionPerformed
        GD4.setBackground(Color.GRAY);
        GD4.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GC2.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GD4";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GD4ActionPerformed

    private void GD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GD3ActionPerformed
        GD3.setBackground(Color.GRAY);
        GD3.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GC2.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GD3";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GD3ActionPerformed

    private void GD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GD2ActionPerformed
        GD2.setBackground(Color.GRAY);
        GD2.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GC2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GD2";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GD2ActionPerformed

    private void GD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GD1ActionPerformed
        GD1.setBackground(Color.GRAY);
        GD1.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GC2.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GD1";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GD1ActionPerformed

    private void GE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GE1ActionPerformed
        GE1.setBackground(Color.GRAY);
        GE1.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GC2.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GE1";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GE1ActionPerformed

    private void GE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GE2ActionPerformed
        GE2.setBackground(Color.GRAY);
        GE2.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GC2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GE2";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GE2ActionPerformed

    private void TE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE3ActionPerformed
        if (buttonClicked != true) {
            if ("TE3".equals(cpuPos)) {
                TE3.setBackground(Color.red);
                TE3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TE3.setBackground(Color.white);
                TE3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24));
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TE3.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TE3ActionPerformed

    private void GE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GE3ActionPerformed
        GE3.setBackground(Color.GRAY);
        GE3.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GC2.setEnabled(false);
        GE4.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GE3";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GE3ActionPerformed

    private void GE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GE5ActionPerformed
        GE5.setBackground(Color.GRAY);
        GE5.setContentAreaFilled(true);
        buttonClicked = false;

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GE4.setEnabled(false);
        GC2.setEnabled(false);

        playerPos = "GE5";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GE5ActionPerformed

    private void TA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TA1ActionPerformed
        System.out.println(cpuPos);
        if (buttonClicked != true) {
            if ("TA1".equals(cpuPos)) {
                TA1.setBackground(Color.red);
                TA1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TA1.setBackground(Color.white);
                TA1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TA1.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TA1ActionPerformed

    private void TA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TA2ActionPerformed
        if (buttonClicked != true) {
            if ("TA2".equals(cpuPos)) {
                TA2.setBackground(Color.red);
                TA2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TA2.setBackground(Color.white);
                TA2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TA2.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TA2ActionPerformed

    private void TA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TA3ActionPerformed
        if (buttonClicked != true) {
            if ("TA3".equals(cpuPos)) {
                TA3.setBackground(Color.red);
                TA3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TA3.setBackground(Color.white);
                TA3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TA3.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TA3ActionPerformed

    private void TA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TA4ActionPerformed
        if (buttonClicked != true) {
            if ("TA4".equals(cpuPos)) {
                TA4.setBackground(Color.red);
                TA4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TA4.setBackground(Color.white);
                TA4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TA4.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }

    }//GEN-LAST:event_TA4ActionPerformed

    private void TA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TA5ActionPerformed
        if (buttonClicked != true) {
            if ("TA5".equals(cpuPos)) {
                TA5.setBackground(Color.red);
                TA5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TA5.setBackground(Color.white);
                TA5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TA5.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TA5ActionPerformed

    private void TB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB1ActionPerformed
        if (buttonClicked != true) {
            if ("TB1".equals(cpuPos)) {
                TB1.setBackground(Color.red);
                TB1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TB1.setBackground(Color.white);
                TB1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TB1.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TB1ActionPerformed

    private void TB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB2ActionPerformed
        if (buttonClicked != true) {
            if ("TB2".equals(cpuPos)) {
                TB2.setBackground(Color.red);
                TB2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TB2.setBackground(Color.white);
                TB2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TB2.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TB2ActionPerformed

    private void TB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB3ActionPerformed
        if (buttonClicked != true) {
            if ("TB3".equals(cpuPos)) {
                TB3.setBackground(Color.red);
                TB3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TB3.setBackground(Color.white);
                TB3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TB3.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TB3ActionPerformed

    private void TB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB4ActionPerformed
        if (buttonClicked != true) {
            if ("TB4".equals(cpuPos)) {
                TB4.setBackground(Color.red);
                TB4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TB4.setBackground(Color.white);
                TB4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TB4.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TB4ActionPerformed

    private void TB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB5ActionPerformed
        if (buttonClicked != true) {
            if ("TB5".equals(cpuPos)) {
                TB5.setBackground(Color.red);
                TB5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TB5.setBackground(Color.white);
                TB5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TB5.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TB5ActionPerformed

    private void TC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TC1ActionPerformed
        if (buttonClicked != true) {
            if ("TC1".equals(cpuPos)) {
                TC1.setBackground(Color.red);
                TC1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TC1.setBackground(Color.white);
                TC1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TC1.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TC1ActionPerformed

    private void TC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TC2ActionPerformed
        if (buttonClicked != true) {
            if ("TC2".equals(cpuPos)) {
                TC2.setBackground(Color.red);
                TC2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TC2.setBackground(Color.white);
                TC2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TC2.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TC2ActionPerformed

    private void TC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TC3ActionPerformed
        if (buttonClicked != true) {
            if ("TC3".equals(cpuPos)) {
                TC3.setBackground(Color.red);
                TC3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TC3.setBackground(Color.white);
                TC3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TC3.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TC3ActionPerformed

    private void TC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TC4ActionPerformed
        if (buttonClicked != true) {
            if ("TC4".equals(cpuPos)) {
                TC4.setBackground(Color.red);
                TC4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TC4.setBackground(Color.white);
                TC4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TC4.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TC4ActionPerformed

    private void TC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TC5ActionPerformed
        if (buttonClicked != true) {
            if ("TC5".equals(cpuPos)) {
                TC5.setBackground(Color.red);
                TC5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TC5.setBackground(Color.white);
                TC5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TC5.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TC5ActionPerformed

    private void TD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TD1ActionPerformed
        if (buttonClicked != true) {
            if ("TD1".equals(cpuPos)) {
                TD1.setBackground(Color.red);
                TD1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TD1.setBackground(Color.white);
                TD1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TD1.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TD1ActionPerformed

    private void TD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TD2ActionPerformed
        if (buttonClicked != true) {
            if ("TD2".equals(cpuPos)) {
                TD2.setBackground(Color.red);
                TD2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TD2.setBackground(Color.white);
                TD2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TD2.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TD2ActionPerformed

    private void TD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TD3ActionPerformed
        if (buttonClicked != true) {
            if ("TD3".equals(cpuPos)) {
                TD3.setBackground(Color.red);
                TD3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TD3.setBackground(Color.white);
                TD3.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TD3.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TD3ActionPerformed

    private void TD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TD4ActionPerformed
        if (buttonClicked != true) {
            if ("TD4".equals(cpuPos)) {
                TD4.setBackground(Color.red);
                TD4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TD4.setBackground(Color.white);
                TD4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TD4.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TD4ActionPerformed

    private void TD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TD5ActionPerformed
        if (buttonClicked != true) {
            if ("TD5".equals(cpuPos)) {
                TD5.setBackground(Color.red);
                TD5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TD5.setBackground(Color.white);
                TD5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TD5.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TD5ActionPerformed

    private void TE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE1ActionPerformed
        if (buttonClicked != true) {
            if ("TE1".equals(cpuPos)) {
                TE1.setBackground(Color.red);
                TE1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TE1.setBackground(Color.white);
                TE1.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TE1.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TE1ActionPerformed

    private void TE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE2ActionPerformed
        if (buttonClicked != true) {
            if ("TE2".equals(cpuPos)) {
                TE2.setBackground(Color.red);
                TE2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TE2.setBackground(Color.white);
                TE2.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TE2.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TE2ActionPerformed

    private void GE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GE4ActionPerformed
        GE4.setBackground(Color.GRAY);
        GE4.setContentAreaFilled(true);

        GA2.setEnabled(false);
        GA3.setEnabled(false);
        GA4.setEnabled(false);
        GA5.setEnabled(false);
        GB1.setEnabled(false);
        GB2.setEnabled(false);
        GB3.setEnabled(false);
        GB4.setEnabled(false);
        GB5.setEnabled(false);
        GC1.setEnabled(false);
        GA1.setEnabled(false);
        GC3.setEnabled(false);
        GC4.setEnabled(false);
        GC5.setEnabled(false);
        GD1.setEnabled(false);
        GD2.setEnabled(false);
        GD3.setEnabled(false);
        GD4.setEnabled(false);
        GD5.setEnabled(false);
        GE1.setEnabled(false);
        GE2.setEnabled(false);
        GE3.setEnabled(false);
        GC2.setEnabled(false);
        GE5.setEnabled(false);

        playerPos = "GE4";
        label.setText("FIRE ON A SECTOR");
    }//GEN-LAST:event_GE4ActionPerformed

    private void TE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE4ActionPerformed
        if (buttonClicked != true) {
            if ("TE4".equals(cpuPos)) {
                TE4.setBackground(Color.red);
                TE4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TE4.setBackground(Color.white);
                TE4.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TE4.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TE4ActionPerformed

    private void TE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE5ActionPerformed
        if (buttonClicked != true) {
            if ("TE5".equals(cpuPos)) {
                TE5.setBackground(Color.red);
                TE5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("ENEMY BATTLESHIP HAS BEEN SUNK");
                arrow.setEnabled(false);

                playAgain.setText("PLAY AGAIN");
                playAgain.setContentAreaFilled(true);
                playAgain.setEnabled(true);
            } else {
                TE5.setBackground(Color.white);
                TE5.setContentAreaFilled(true);
                label.setFont(new Font("Impact", Font.PLAIN, 24)); label.setText("YOU MISSED!");

                label.setFont(new Font("Impact", Font.PLAIN, 17));
                label.setText("MISSED! HIT ARROW TO CHANGE TURN");
                arrow.setEnabled(true);
            }

            TE5.setEnabled(false);
            buttonClicked = true;

            playerSalvo++;
            playerSalvoLabel.setText(String.valueOf(playerSalvo));
        }
    }//GEN-LAST:event_TE5ActionPerformed

    private void arrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrowActionPerformed
        boolean clear = false;

        label.setText("INCOMING FIRE!");

        while (clear == false) {
            String testCoor = cpuFire();
            System.out.println(playerPos);
            System.out.println(testCoor);
            switch (testCoor) {
                case "GA1":
                    if (GA1.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GA1.setBackground(Color.red);
                            GA1.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GA1.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GA1.setBackground(Color.white);
                            GA1.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }

                    break;
                case "GA2":
                    if (GA2.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GA2.setBackground(Color.red);
                            GA2.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK\n WITH " + cpuSalvo + 1);
                            GA2.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GA2.setBackground(Color.white);
                            GA2.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }

                    break;
                case "GA3":
                    if (GA3.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GA3.setBackground(Color.red);
                            GA3.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GA3.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GA3.setBackground(Color.white);
                            GA3.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GA4":
                    if (GA4.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GA4.setBackground(Color.red);
                            GA4.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GA4.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GA4.setBackground(Color.white);
                            GA4.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GA5":
                    if (GA5.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GA5.setBackground(Color.red);
                            GA5.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GA5.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GA5.setBackground(Color.white);
                            GA5.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GB1":
                    if (GB1.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GB1.setBackground(Color.red);
                            GB1.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GB1.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GB1.setBackground(Color.white);
                            GB1.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GB2":
                    if (GB2.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GB2.setBackground(Color.red);
                            GB2.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GB2.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GB2.setBackground(Color.white);
                            GB2.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GB3":
                    if (GB3.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GB3.setBackground(Color.red);
                            GB3.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GB3.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GB3.setBackground(Color.white);
                            GB3.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GB4":
                    if (GB4.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GB4.setBackground(Color.red);
                            GB4.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GB4.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GB4.setBackground(Color.white);
                            GB4.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GB5":
                    if (GB5.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GB5.setBackground(Color.red);
                            GB5.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GB5.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GB5.setBackground(Color.white);
                            GB5.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GC1":
                    if (GC1.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GC1.setBackground(Color.red);
                            GC1.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GC1.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GC1.setBackground(Color.white);
                            GC1.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GC2":
                    if (GC2.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GC2.setBackground(Color.red);
                            GC2.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GC2.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GC2.setBackground(Color.white);
                            GC2.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GC3":
                    if (GC3.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GC3.setBackground(Color.red);
                            GC3.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GC3.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GC3.setBackground(Color.white);
                            GC3.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GC4":
                    if (GC4.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GC4.setBackground(Color.red);
                            GC4.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GC4.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GC4.setBackground(Color.white);
                            GC4.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GC5":
                    if (GC5.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GC5.setBackground(Color.red);
                            GC5.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GC5.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GC5.setBackground(Color.white);
                            GC5.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GD1":
                    if (GD1.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GD1.setBackground(Color.red);
                            GD1.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GD1.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GD1.setBackground(Color.white);
                            GD1.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GD2":
                    if (GD2.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GD2.setBackground(Color.red);
                            GD2.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GD2.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GD2.setBackground(Color.white);
                            GD2.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GD3":
                    if (GD3.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GD3.setBackground(Color.red);
                            GD3.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GD3.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GD3.setBackground(Color.white);
                            GD3.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GD4":
                    if (GD4.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GD4.setBackground(Color.red);
                            GD4.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GD4.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GD4.setBackground(Color.white);
                            GD4.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GD5":
                    if (GD5.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GD5.setBackground(Color.red);
                            GD5.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GD5.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GD5.setBackground(Color.white);
                            GD5.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GE1":
                    if (GE1.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GE1.setBackground(Color.red);
                            GE1.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GE1.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GE1.setBackground(Color.white);
                            GE1.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GE2":
                    if (GE2.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GE2.setBackground(Color.red);
                            GE2.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GE2.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GE2.setBackground(Color.white);
                            GE2.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GE3":
                    if (GE3.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GE3.setBackground(Color.red);
                            GE3.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GE3.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GE3.setBackground(Color.white);
                            GE3.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GE4":
                    if (GE4.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GE4.setBackground(Color.red);
                            GE4.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GE4.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GE4.setBackground(Color.white);
                            GE4.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                case "GE5":
                    if (GE5.getBackground() != Color.white) {
                        if (playerPos.equals(testCoor)) {
                            clear = true;
                            GE5.setBackground(Color.red);
                            GE5.setContentAreaFilled(true);
                            label.setFont(new Font("Impact", Font.PLAIN, 24));
                            label.setText("BATTLESHIP HAS BEEN SUNK");
                            GE5.setEnabled(false);
                            arrow.setEnabled(false);

                            playAgain.setText("PLAY AGAIN");
                            playAgain.setContentAreaFilled(true);
                            playAgain.setEnabled(true);
                        } else {
                            clear = true;
                            GE5.setBackground(Color.white);
                            GE5.setContentAreaFilled(true);
                            label.setText("CPU MISSED! YOUR TURN AGAIN");
                            buttonClicked = false;
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        cpuSalvo++;
        cpuSalvoLabel.setText(String.valueOf(cpuSalvo));
    }//GEN-LAST:event_arrowActionPerformed

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
        System.out.println("Play Again");
        /*
        int cpuSalvo = 0;
        int playerSalvo = 0;
        buttonClicked = true;
        cpuPos = randomCPU();
        
        buttons GA1 through GE5:
            GA1.setContentAreaFilled(false);
            GA2.setContentAreaFilled(false);
            BUTTON_NAME.setContentAreaFilled(false);
        buttons TA1 through TE5
            BUTTON_NAME.setContentAreaFilled(false);
            BUTTON_NAME.setEnabled(true);
        
        arrow.setEnabled(false);
        label.setFont(new Font("Impact", FONT.Plain, 30))
        label.setText("PLACE YOUR SHIP");
        
        playAgain.setText("");
        playAgain.setContentAreaFilled(false);
         */
    }//GEN-LAST:event_playAgainActionPerformed

    private static String randomCPU() {
        int number;
        int letterRand;
        char letter = 'A';
        String location;
        Random rand = new Random();
        number = 1 + rand.nextInt(5);
        letterRand = 1 + rand.nextInt(5);
        switch (letterRand) {
            case 1:
                letter = 'A';
            case 2:
                letter = 'B';
            case 3:
                letter = 'C';
            case 4:
                letter = 'D';
            case 5:
                letter = 'E';
        }
        location = "T" + letter + String.valueOf(number);
        return location;

    }

    public static String cpuFire() {
        System.out.println("Enemy is readying to fire! Brace for Impact!");
        int x = (int) (5 * Math.random() + 1);
        int fireY = (int) (5 * Math.random() + 1);

        String fireX = numberTranscribe(x);

        String firePos = "G" + fireX + String.valueOf(fireY);

        return firePos;
    }

    public static String numberTranscribe(int num) {
        String letter = "";

        if (num == 1) {
            letter = "A";
        } else if (num == 2) {
            letter = "B";
        } else if (num == 3) {
            letter = "C";
        } else if (num == 4) {
            letter = "D";
        } else if (num == 5) {
            letter = "E";
        }

        return letter;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleshipsBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GA1;
    private javax.swing.JButton GA2;
    private javax.swing.JButton GA3;
    private javax.swing.JButton GA4;
    private javax.swing.JButton GA5;
    private javax.swing.JButton GB1;
    private javax.swing.JButton GB2;
    private javax.swing.JButton GB3;
    private javax.swing.JButton GB4;
    private javax.swing.JButton GB5;
    private javax.swing.JButton GC1;
    private javax.swing.JButton GC2;
    private javax.swing.JButton GC3;
    private javax.swing.JButton GC4;
    private javax.swing.JButton GC5;
    private javax.swing.JButton GD1;
    private javax.swing.JButton GD2;
    private javax.swing.JButton GD3;
    private javax.swing.JButton GD4;
    private javax.swing.JButton GD5;
    private javax.swing.JButton GE1;
    private javax.swing.JButton GE2;
    private javax.swing.JButton GE3;
    private javax.swing.JButton GE4;
    private javax.swing.JButton GE5;
    private javax.swing.JButton TA1;
    private javax.swing.JButton TA2;
    private javax.swing.JButton TA3;
    private javax.swing.JButton TA4;
    private javax.swing.JButton TA5;
    private javax.swing.JButton TB1;
    private javax.swing.JButton TB2;
    private javax.swing.JButton TB3;
    private javax.swing.JButton TB4;
    private javax.swing.JButton TB5;
    private javax.swing.JButton TC1;
    private javax.swing.JButton TC2;
    private javax.swing.JButton TC3;
    private javax.swing.JButton TC4;
    private javax.swing.JButton TC5;
    private javax.swing.JButton TD1;
    private javax.swing.JButton TD2;
    private javax.swing.JButton TD3;
    private javax.swing.JButton TD4;
    private javax.swing.JButton TD5;
    private javax.swing.JButton TE1;
    private javax.swing.JButton TE2;
    private javax.swing.JButton TE3;
    private javax.swing.JButton TE4;
    private javax.swing.JButton TE5;
    private javax.swing.JButton arrow;
    private javax.swing.JLabel backdrop;
    private javax.swing.JLabel cpuSalvoLabel;
    private javax.swing.JLabel label;
    private javax.swing.JButton playAgain;
    private javax.swing.JLabel playerSalvoLabel;
    // End of variables declaration//GEN-END:variables
}
