package Mobile_Operating_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by akshay on 25/4/16.
 */
public class Final_Screen extends JFrame implements ActionListener{

    JLabel success;
    JButton backButton, exitButton;

    public Final_Screen(){
        this.setTitle("Authentication Screen");
        success = new JLabel("Authentication Successful");
        backButton = new JButton("Back");
        exitButton = new JButton("Exit");

        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc=new GridBagConstraints();
        gbc.anchor=GridBagConstraints.WEST;

        gbc.insets=new Insets(7,7,7,7);

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(success, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(backButton, gbc);
        backButton.addActionListener(this);

        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(exitButton, gbc);
        exitButton.addActionListener(this);

        this.setSize(1366, 768);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(s.equals("Back")){
            this.dispose();
            new Main_Screen();
        }
        else if(s.equals("Exit")){
            System.exit(0);
        }
    }
}

