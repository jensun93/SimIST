/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * package teamgameproject;
 *
 * import javax.swing.*; import java.awt.*; import java.io.File; import
 * java.io.FileInputStream; import java.io.IOException; import
 * java.io.InputStream; import javax.imageio.ImageIO; import
 * javax.swing.ImageIcon; import javax.swing.JLabel; import
 * sun.audio.AudioPlayer; import sun.audio.AudioStream;
 */
public class ElevatorUI extends JFrame {

    private JButton upBtn, downBtn;
    private JPanel buttonPanel;

    public ElevatorUI() {
        initCustomerComponents();
    }

    public void initCustomerComponents() {
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        //up Button
        buttonPanel = new JPanel();
        ImageIcon up = new ImageIcon("/Users/jeongeunsun/Desktop/SimIST/SimIST/SimIST/src/Image/up.png");
        upBtn = new JButton(up);

        buttonPanel.add(upBtn);

        ImageIcon down = new ImageIcon("/Users/jeongeunsun/Desktop/SimIST/SimIST/SimIST/src/Image/down.png");
        downBtn = new JButton(down);
        buttonPanel.add(downBtn);
        this.getContentPane().add(buttonPanel);
        // downBtn.setPreferredSize(new Dimension(100, 100));

        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });
        downBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });
    }

    /*   public void setMusic() {
     InputStream in;
     try {
     in = new FileInputStream(new File("src/Soundeffect/Dragonball.wav"));
     AudioStream audios = new AudioStream(in);
     AudioPlayer.player.start(audios);
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, e);
     }
     }*/
    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.yourself; // the current player's Person object
        Boolean canMove = elevator.moveUp(this.yourself);
        if (canMove) {
            // show the user that the up button is activated.
        } else { // didn't move, probably on top floor
            // do nothing
            // maybe display an error
        }
    }

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }
}
