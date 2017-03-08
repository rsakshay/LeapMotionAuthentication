package projectleap;

import com.leapmotion.leap.*;
import com.leapmotion.leap.Frame;
import com.leapmotion.leap.Gesture.State;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by Ghost on 7/4/16.
 */
public class LeapListener extends Listener {

    public Robot robot;  //For mouse move,click,scroll...
    public void onInit(Controller controller){
        System.out.println("Initialized");

    }
    public void onConnect(Controller controller){
        System.out.println("Connected to motion sensor");
        controller.enableGesture(Gesture.Type.TYPE_SWIPE);
        controller.enableGesture(Gesture.Type.TYPE_CIRCLE);
        controller.enableGesture(Gesture.Type.TYPE_SCREEN_TAP);
        controller.enableGesture(Gesture.Type.TYPE_KEY_TAP);

    }
    public void onDisconnect(Controller controller){
        System.out.println("Disconnected from the motion sensor");
    }
    public void onExit(Controller controller){
        System.out.println("Exited");
    }
    public void onFrame(Controller controller)
    {
        try{
            robot = new Robot();
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        Frame frame = controller.frame();
        InteractionBox iBox =  frame.interactionBox();
        for(Finger finger : frame.fingers()){

            if(finger.type()== Finger.Type.TYPE_INDEX){
                Vector fingerPos = finger.stabilizedTipPosition();
                Vector boxFingerPos = iBox.normalizePoint(fingerPos); //for normalizing the point to the interaction box.
                Dimension screen = java.awt.Toolkit.getDefaultToolkit().getScreenSize();  //for setting the dimenion as screen size(scaling)
                robot.mouseMove((int) (screen.width*boxFingerPos.getX()),(int) (screen.height - boxFingerPos.getY()*screen.height));
                if(finger.touchDistance()<0){
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                }
                else if(finger.touchDistance()>-1){
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                }


            }
        }
        for(Gesture gesture : frame.gestures()){
            if (gesture.type()== Gesture.Type.TYPE_CIRCLE){
                CircleGesture circle = new CircleGesture(gesture);
                if (circle.pointable().direction().angleTo(circle.normal()) <= Math.PI/4){
                    robot.mouseWheel(1);
                    try{


                        Thread.sleep(50);
                    }catch (Exception e){
                        System.out.println("stacktrace" + e.getStackTrace());
                    }
                }
                else{
                    robot.mouseWheel(-1);
                    try{
                        Thread.sleep(50);
                    }catch (Exception e){
                        System.out.println("stacktrace" + e.getStackTrace());
                    }
            }
        }
            else if (gesture.type()==Gesture.Type.TYPE_KEY_TAP){
                //controller.config().setFloat("Gesture.KeyTap.MinDownVelocity", 1.0f);
                //controller.config().save();
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
            }
            /*else if (gesture.type()== Gesture.Type.TYPE_SWIPE){
                robot.keyPress(KeyEvent.VK_WINDOWS);
                robot.keyRelease(KeyEvent.VK_WINDOWS);
            }*/

    }
}
}
