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

public class ElevatorUI extends JFrame {

    private JButton upBtn, downBtn;
    private JPanel buttonPanel;
    private Person p1;
    private Building b1;
       

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

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Your current floor is " + p1.getCurrentFloor());
        if (b1.middle() == p1.getCurrentFloor()) {
            System.out.println("You can move up to 3rd floor.");
        } else if (b1.bottom() == p1.getCurrentFloor()) {
            System.out.println("You can move up to 2nd floor or 3rd floor.");
        } else if (b1.top() == p1.getCurrentFloor()) {
            System.out.println("You cannot move up anymore.");
        }

    }

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Your current floor is " + p1.getCurrentFloor());
        if (b1.middle() == p1.getCurrentFloor()) {
            System.out.println("You can move down to 1st floor.");
        } else if (b1.bottom() == p1.getCurrentFloor()) {
            System.out.println("You can move down to 2nd floor or 1st floor.");
        } else if (b1.top() == p1.getCurrentFloor()) {
            System.out.println("You cannot move down anymore.");
        }

    }
}
