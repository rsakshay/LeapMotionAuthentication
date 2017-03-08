package Mobile_Operating_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by akshay on 25/3/16.
 */
public class Main_Screen extends JFrame implements ActionListener {

    //static Main_Screen main_screen;
    static JLabel nameLabel, accountLabel, actionLabel;
    static JTextField nameText, accountText;
    static JButton submitButton, cancelButton;
    private int pattern;

    public Main_Screen() {

        this.setTitle("Welcome to LeapMotion Authentication");
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        nameLabel = new JLabel("Name");
        accountLabel= new JLabel("Account No.");
        actionLabel = new JLabel();
        nameText = new JTextField(20);
        accountText = new JTextField(8);

        submitButton = new JButton("Next");
        cancelButton = new JButton("Cancel");

        GridBagConstraints gbc=new GridBagConstraints();
        gbc.anchor=GridBagConstraints.WEST;

        gbc.insets=new Insets(7,7,7,7);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(accountLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(accountText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(submitButton, gbc);
        submitButton.addActionListener(this);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(cancelButton, gbc);
        cancelButton.addActionListener(this);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(actionLabel, gbc);

        this.setSize(1366, 768);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(s.equals("Cancel")){
            this.dispose();
            new Main_Screen();
        }
        else if(s.equals("Next")){

            //if(this.getNameText().toLowerCase().equals("govind") && this.getAccountText()==12345678){
            if(queryDB(this.getNameText().toLowerCase(), this.getAccountText())){
                this.dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {

                    public void run() {
                        Android_Lock_Screen android_lock_screen = new Android_Lock_Screen();
                        android_lock_screen.setVisible(true);
                        //pattern=123654;
                        String temp = getPattern();
                        int[] tempPattern = new int[temp.length()];
                        for (int i = 0; i < temp.length(); i++)
                        {
                            tempPattern[i] = temp.charAt(i) - '0';
                        }

                        android_lock_screen.setInputPattern(tempPattern);
                    }
                });
            }
            else{
                this.setActionLabel("Invalid Credentials", Color.RED);
                nameText.setText("");
                accountText.setText("");
            }
        }
    }

    public String getNameText(){
        return nameText.getText();
    }

    public int getAccountText(){
        return Integer.parseInt(accountText.getText());
    }

    public void setActionLabel(String s, Color r){
        actionLabel.setForeground(r);
        actionLabel.setText(s);
    }

    public String getPattern(){
        return Integer.toString(pattern);
    }

    public boolean queryDB(String name, int account){
        String connectionUrl = "jdbc:mysql://127.0.0.1:3306/leapmotion";
        String dbUser = "root";
        String dbPwd = "dragon";
        String tempName;
        String tempPattern;
        int tempAccount;
        Connection conn;
        ResultSet rs;
        String queryString = "SELECT * FROM userdata WHERE Account_No = "+account;

        try
        {
            // loads com.mysql.jdbc.Driver into memory
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException cnf)
        {
            System.out.println("Driver could not be loaded: " + cnf);
        }

        try
        {
            conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
            Statement stmt = conn.createStatement();

            // Check if record exists
            rs = stmt.executeQuery(queryString);

            while(rs.next())
            {
                tempName = rs.getString("Name");
                tempAccount = rs.getInt("Account_No");
                tempPattern = rs.getString("pattern");
                pattern = Integer.parseInt(Main_Screen.decryptPattern(tempPattern));

                if(tempName.toLowerCase().equals(name)&&tempAccount==account)
                    return true;
            }
            if (conn != null)
            {
                conn.close();
                conn = null;
            }
            return false;
        }
        catch (SQLException sqle)
        {
            System.out.println("SQL Exception thrown: " + sqle);
            return false;
        }
    }

    public static String decryptPattern(String tempPattern) {

        char p[]  = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char ch[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};

        char p1[] = new char[(tempPattern.length())];
        for (int i = 0; i < tempPattern.length(); i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (ch[j] == tempPattern.charAt(i))
                {
                    p1[i] = p[j];
                    break;
                }
            }
        }
        return (new String(p1));
    }
}
