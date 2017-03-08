package projectleap;

import com.leapmotion.leap.*;
import com.leapmotion.leap.Gesture.State;
import Mobile_Operating_System.Android_Lock_Screen;
import Mobile_Operating_System.Main_Screen;
import java.io.IOException;

/**
 * Created by Ghost on 27/3/16.
 */
public class LeapController  {
    public static void main(String[] args) throws IOException {

        //Part2 main here
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
            java.util.logging.Logger.getLogger(Android_Lock_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Android_Lock_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Android_Lock_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Android_Lock_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Main_Screen main_screen = new Main_Screen();




        //Part 1 Main
        /*LeapListener listener = new LeapListener();
        Controller controller = new Controller();
        controller.config().setFloat("Gesture.ScreenTap.MinForwardVelocity", 30.0f);
        controller.addListener(listener);
        System.out.println("Press enter to quit");
        try {
            System.in.read();
        }


        catch(IOException e) {

            e.printStackTrace();
        }
        controller.removeListener(listener);*/
    }

    public static void addLeapListener() {
        listener = new LeapListener();
        controller = new Controller();
        controller.config().setFloat("Gesture.ScreenTap.MinForwardVelocity", 30.0f);
        controller.addListener(listener);
    }

    public static void removeListener() {
        controller.removeListener(listener);
    }

    static LeapListener listener;
    static Controller controller;
}
