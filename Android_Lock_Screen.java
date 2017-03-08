package Mobile_Operating_System;

import projectleap.LeapController;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Android_Lock_Screen extends javax.swing.JFrame {

    /** Creates new form Conector_Dots */
    public Android_Lock_Screen() {
        this.setTitle("Pattern Lock Screen");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        t = new Timer(1100,new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                reset.doClick();
                t.stop();

            }});
        this.setSize(1366, 768);


        //Set up the drawing area.
        board.setViewportView(drawpanel);
        drawpanel.repaint();
        drawpanel.setAutoscrolls(true); //allows dragging?
        LeapController.addLeapListener();
    }

    private void initComponents() {
        tryCount = 0;
        tempTa = new JTextArea();
        Color_Chooser = new javax.swing.JDialog();
        choose = new javax.swing.JButton();
        palet = new javax.swing.JColorChooser();
        set_pattern = new javax.swing.JToggleButton();
        dot1 = new javax.swing.JLabel();
        dot2 = new javax.swing.JLabel();
        dot3 = new javax.swing.JLabel();
        dot4 = new javax.swing.JLabel();
        dot5 = new javax.swing.JLabel();
        dot6 = new javax.swing.JLabel();
        dot7 = new javax.swing.JLabel();
        dot8 = new javax.swing.JLabel();
        dot9 = new javax.swing.JLabel();
        empty = new javax.swing.JLabel();
        board = new javax.swing.JScrollPane();
        tapane = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        reset = new javax.swing.JButton();
        set_color = new javax.swing.JButton();
        Intro = new javax.swing.JLabel();

        Color_Chooser.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        choose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        choose.setText("Select Color");
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });
        Color_Chooser.getContentPane().add(choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 30));
        Color_Chooser.getContentPane().add(palet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 168, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        set_pattern.setBackground(new java.awt.Color(0, 153, 255));
        set_pattern.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        set_pattern.setText("Set Pattern");
        set_pattern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_patternActionPerformed(evt);
            }
        });
        //getContentPane().add(set_pattern, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 120, 30));
        getContentPane().add(new JLabel("Welcome!"), new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 120, 30));
        dot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile_Operating_System/red_connector_dot.png"))); // NOI18N
        dot1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotsMousePressed(evt);
            }
        });
        dot1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(dot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 50, 50));

        dot2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile_Operating_System/red_connector_dot.png"))); // NOI18N
        dot2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotsMousePressed(evt);
            }
        });
        dot2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(dot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 50, 50));

        dot3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile_Operating_System/red_connector_dot.png"))); // NOI18N
        dot3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotsMousePressed(evt);
            }
        });
        dot3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(dot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 50, 50));

        dot4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile_Operating_System/red_connector_dot.png"))); // NOI18N
        dot4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotsMousePressed(evt);
            }
        });
        dot4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(dot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 50, 50));

        dot5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile_Operating_System/red_connector_dot.png"))); // NOI18N
        dot5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotsMousePressed(evt);
            }
        });
        dot5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(dot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 50, 50));

        dot6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile_Operating_System/red_connector_dot.png"))); // NOI18N
        dot6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotsMousePressed(evt);
            }
        });
        dot6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(dot6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 50, 50));

        dot7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile_Operating_System/red_connector_dot.png"))); // NOI18N
        dot7.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                Normal_Mode(evt);
            }
        });
        dot7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotsMousePressed(evt);
            }
        });
        dot7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(dot7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 50, 50));

        dot8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile_Operating_System/red_connector_dot.png"))); // NOI18N
        dot8.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                secret_reset(evt);
            }
        });
        dot8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotsMousePressed(evt);
            }
        });
        dot8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(dot8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 50, 50));

        dot9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile_Operating_System/red_connector_dot.png"))); // NOI18N
        dot9.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                Developer_Mode(evt);
            }
        });
        dot9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotsMousePressed(evt);
            }
        });
        dot9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(dot9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 50, 50));

        empty.setBackground(new java.awt.Color(0, 0, 0));
        empty.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseDragged(evt);                 }                 catch (NullPointerException e)                 {                                      }
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                try                 {                     screenMouseMoved(evt);                 }                 catch (ArrayIndexOutOfBoundsException e)                 {                                      }
            }
        });
        getContentPane().add(empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 550));
        getContentPane().add(board, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 550));

        ta.setColumns(20);
        ta.setEditable(false);
        ta.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        ta.setRows(3);
        ta.setMinimumSize(new java.awt.Dimension(0, 0));
        ta.setName(""); // NOI18N
        tapane.setViewportView(ta);

        getContentPane().add(tapane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 550, 100));

        reset.setBackground(new java.awt.Color(0, 204, 0));
        reset.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, 30));

        set_color.setBackground(new java.awt.Color(255, 0, 0));
        set_color.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        set_color.setText("Color");
        set_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_colorActionPerformed(evt);
            }
        });
        getContentPane().add(set_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 70, 30));

        Intro.setBackground(new java.awt.Color(42, 95, 85));
        Intro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        Intro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/Intro_HD.gif"))); // NOI18N
        getContentPane().add(Intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Color line = new Color(255,200,0);
    Point mp;
    Timer t;
    boolean drag=false,setpattern=false;
    boolean p1=false,p2=false,p3=false,
            p4=false,p5=false,p6=false,
            p7=false,p8=false,p9=false;
    int xp[]={0,0,0,0,0,
            0,0,0,0,0,0};
    int yp[]={0,0,0,0,0,
            0,0,0,0,0,0};
    //int pattern[]    ={3,2,1,4,5,6,9,8,7};
    int pattern[]    ={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    int testpattern[]={0,0,0,0,0,0,0,0,0};
    int dot=0;
    //End of Variables
    boolean checkPattern()
    {
        boolean result = false;
        for(int i=0;i<dot;i++)
        {
            int mx=xp[i]-22;
            int my=yp[i]-22;
//ta.append(mx+","+my+"|");
            if((mx==50)&&(my==50))
                testpattern[i] =1;
            else if((mx==250)&&(my==50))
                testpattern[i] =2;
            else if((mx==450)&&(my==50))
                testpattern[i] =3;
            else if((mx==50)&&(my==250))
                testpattern[i] =4;
            else if((mx==250)&&(my==250))
                testpattern[i] =5;
            else if((mx==450)&&(my==250))
                testpattern[i] =6;
            else if((mx==50)&&(my==450))
                testpattern[i] =7;
            else if((mx==250)&&(my==450))
                testpattern[i] =8;
            else if((mx==450)&&(my==450))
                testpattern[i] =9;
        }
//End of For Loop
        for(int i=0;i<9;i++)
        {
            if(testpattern[i]==pattern[i])
                result = true;
            else
            {
                result = false;
                break;
            }
        }
        return result;
    }

    void setPattern()
    {
        for(int i=0;i<dot;i++)
        {
            int mx=xp[i]-22;
            int my=yp[i]-22;
            if((mx==50)&&(my==50))
                pattern[i] =1;
            else if((mx==250)&&(my==50))
                pattern[i] =2;
            else if((mx==450)&&(my==50))
                pattern[i] =3;
            else if((mx==50)&&(my==250))
                pattern[i] =4;
            else if((mx==250)&&(my==250))
                pattern[i] =5;
            else if((mx==450)&&(my==250))
                pattern[i] =6;
            else if((mx==50)&&(my==450))
                pattern[i] =7;
            else if((mx==250)&&(my==450))
                pattern[i] =8;
            else if((mx==450)&&(my==450))
                pattern[i] =9;
        }
        for(int i=dot;i<9;i++)
        {
            pattern[i] =0;
        }
        for(int i=0;i<9;i++)
        {
            ta.append(pattern[i]+",");
        }
        ta.append("\n");
        line=new Color(0,160,255);
        xp[dot+1]=xp[dot-1];
        yp[dot+1]=yp[dot-1];
        repaint();
        t.start();
    }

    void setPoint(Component c)
    {
        xp[dot]=c.getX()+22;
        yp[dot]=c.getY()+22;
        dot++;
        xp[dot]=c.getX()+22;
        yp[dot]=c.getY()+22;
        if(dot==9){
            if((drag==true)&&(setpattern==false))
                setLineColor();
            else if((drag==true)&&(setpattern==true)&&(t.isRunning()==false))
                setPattern();
            xp[dot+1]=c.getX()+22;
            yp[dot+1]=c.getY()+22;
        }
    }

    int getMouseComponentNo()
    {
        try
        {
            int mx = getMousePosition().x-4;
            int my = getMousePosition().y-30;
            mx=mx-(mx%50);
            my=my-(my%50);
            if((mx==50)&&(my==50))
                return 1;
            else if((mx==250)&&(my==50))
                return 2;
            else if((mx==450)&&(my==50))
                return 3;
            else if((mx==50)&&(my==250))
                return 4;
            else if((mx==250)&&(my==250))
                return 5;
            else if((mx==450)&&(my==250))
                return 6;
            else if((mx==50)&&(my==450))
                return 7;
            else if((mx==250)&&(my==450))
                return 8;
            else if((mx==450)&&(my==450))
                return 9;
            else
                return 0;
        }
        catch(Exception e)
        {
            return 0;
        }
    }
    JTextArea tempTa;
    String temp;
    void setLineColor()
    {
        if(checkPattern()==true)
        {
            ta.setText("Correct Pattern\n");
            for(int i=0;i<9;i++)
                ta.append(testpattern[i]+",");
            line = new Color(0,225,50);
            this.dispose();
            LeapController.removeListener();
            new Final_Screen();
        }
        else
        {


            tempTa.setText("Incorrect Pattern\n");
            for(int i=0;i<9;i++)
                tempTa.append(testpattern[i] + ",");

            if(!tempTa.getText().equals(temp)){
                ta.setText("Incorrect Pattern\n");
                for(int i=0;i<9;i++)
                    ta.append(testpattern[i]+",");
                line = new Color(255,75,75);
                temp=ta.getText();
                tryCount++;
                if(!isTryLeft())
                {
                    this.dispose();
                    LeapController.removeListener();
                    Main_Screen newMain = new Main_Screen();
                    newMain.setVisible(true);
                    newMain.setActionLabel("Number of tries exceeded", Color.RED);
                }
            }
        }
        xp[dot+1]=xp[dot-1];
        yp[dot+1]=yp[dot-1];
        repaint();
        t.start();
    }


    private void screenMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenMouseDragged
        if(t.isRunning()==false){
            int comp = getMouseComponentNo();
            if((drag==true)&&(comp==1)&&(p1==false))
            {p1=true;setPoint(dot1);}
            else if((drag==true)&&(comp==2)&&(p2==false))
            {p2=true;setPoint(dot2);}
            else if((drag==true)&&(comp==3)&&(p3==false))
            {p3=true;setPoint(dot3);}
            else if((drag==true)&&(comp==4)&&(p4==false))
            {p4=true;setPoint(dot4);}
            else if((drag==true)&&(comp==5)&&(p5==false))
            {p5=true;setPoint(dot5);}
            else if((drag==true)&&(comp==6)&&(p6==false))
            {p6=true;setPoint(dot6);}
            else if((drag==true)&&(comp==7)&&(p7==false))
            {p7=true;setPoint(dot7);}
            else if((drag==true)&&(comp==8)&&(p8==false))
            {p8=true;setPoint(dot8);}
            else if((drag==true)&&(comp==9)&&(p9==false))
            {p9=true;setPoint(dot9);}

            if((dot<9)&&(drag==true))
            {
                mp = getMousePosition();
                xp[dot+1]=mp.x-4;
                yp[dot+1]=mp.y-30;
                ta.setText("No. of Dots Conneted :"+dot+"\n");
            }
        }
        repaint();

    }//GEN-LAST:event_screenMouseDragged

    private void Developer_Mode(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_Developer_Mode
        tapane.setSize(350,0);
        tapane.setLocation(0,450);
    }//GEN-LAST:event_Developer_Mode

    private void dotsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotsMousePressed
        drag=true;
    }//GEN-LAST:event_dotsMousePressed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        p1=false;p2=false;p3=false;
        p4=false;p5=false;p6=false;
        p7=false;p8=false;p9=false;
        dot=0;
        line = new Color(255,200,0);
        for(int i=0;i<=10;i++)
        {
            xp[i]=0;
            yp[i]=0;
            if(i<9)
                testpattern[i]=0;
        }
        drag=false;
        if(setpattern==true){
            set_pattern.doClick();
        }
        repaint();
    }//GEN-LAST:event_resetActionPerformed

    private void secret_reset(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_secret_reset
        reset.doClick();
// TODO add your handling code here:
    }//GEN-LAST:event_secret_reset

    private void Normal_Mode(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_Normal_Mode
        tapane.setSize(350,100);
        tapane.setLocation(0,350);
    }//GEN-LAST:event_Normal_Mode

    private void set_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_colorActionPerformed
        Color_Chooser.setBounds(350,350,524,350);
        Color_Chooser.setVisible(true);
    }//GEN-LAST:event_set_colorActionPerformed

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
        line = palet.getColor();
        Color_Chooser.setVisible(false);
        tapane.setSize(350,100);
        tapane.setLocation(0,350);
    }//GEN-LAST:event_chooseActionPerformed

    private void screenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenMouseMoved

        if((drag==true)&&(setpattern==false))
            setLineColor();
        else if((drag==true)&&(setpattern==true)&&(t.isRunning()==false))
            setPattern();

        if((drag==true)&&(t.isRunning()==false))
        {
            reset.doClick(500);
            drag=false;
        }

    }//GEN-LAST:event_screenMouseMoved

    private void set_patternActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_patternActionPerformed
        if(set_pattern.isSelected())
        {
            setpattern=true;
            set_pattern.setBackground(new Color(10,230,10));
        }
        else
        {
            setpattern=false;
            set_pattern.setBackground(new Color(0,153,255));
        }
    }//GEN-LAST:event_set_patternActionPerformed

    public final class InnerClassDrawingPanel extends javax.swing.JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;
            super.paintComponent(g2d);
            g2d.setColor(line);
            g2d.clearRect(0, 0,empty.getX(),empty.getY());
            g2d.setStroke(new BasicStroke(15f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
            g2d.drawPolyline(xp,yp,dot+2);
            g2d.clearRect(0,0,10,10);
            drawpanel.setAutoscrolls(true);
        }
    }
    /**
     * @paramargs the command line arguments
     */
    private boolean isTryLeft(){
        if(tryCount<3)
            return true;
        else
            return false;
    }

    //public static void main(String args[]) {

    //}

    public void setInputPattern(int[] inputPattern){
        int i;
        for(i = 0; i<inputPattern.length; i++)
            pattern[i] = inputPattern[i];
        while(i<9){
            pattern[i] = 0;
            i++;
        }
    }

    private InnerClassDrawingPanel drawpanel = new InnerClassDrawingPanel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Color_Chooser;
    private javax.swing.JLabel Intro;
    private javax.swing.JScrollPane board;
    private javax.swing.JButton choose;
    private javax.swing.JLabel dot1;
    private javax.swing.JLabel dot2;
    private javax.swing.JLabel dot3;
    private javax.swing.JLabel dot4;
    private javax.swing.JLabel dot5;
    private javax.swing.JLabel dot6;
    private javax.swing.JLabel dot7;
    private javax.swing.JLabel dot8;
    private javax.swing.JLabel dot9;
    private javax.swing.JLabel empty;
    private javax.swing.JColorChooser palet;
    private javax.swing.JButton reset;
    private javax.swing.JButton set_color;
    private javax.swing.JToggleButton set_pattern;
    private javax.swing.JTextArea ta;
    private javax.swing.JScrollPane tapane;
    private static int tryCount;
    // End of variables declaration//GEN-END:variables
}
