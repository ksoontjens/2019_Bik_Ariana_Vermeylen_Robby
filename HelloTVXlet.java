package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {
    
    HScene scene;
    
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getActionCommand().equals("knop3"))
        {
            System.out.println("JUIST!");
            HStaticText feedback = new HStaticText("JUIST!", 425, 100, 200, 100);
            feedback.setBackground(Color.ORANGE);
            feedback.setBackgroundMode(HVisible.BACKGROUND_FILL);
            scene.add(feedback);
            scene.popToFront(feedback);
            scene.repaint();
        }
        else
        {
            System.out.println("GETREKT!");
            HStaticText feedback = new HStaticText("GETREKT!", 425, 100, 200, 100);
            feedback.setBackground(Color.RED);
            feedback.setBackgroundMode(HVisible.BACKGROUND_FILL);
            scene.add(feedback);
            scene.popToFront(feedback);
            scene.repaint();
        }
        
    }
    
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) {
      //resolutie = 720x576
     scene = HSceneFactory.getInstance().getDefaultHScene();
     HStaticText hst = new HStaticText("Bitch Lasagna", 100, 100, 300, 100);
                                        //Tekst, x, y, b, h
     hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
     hst.setBackground(Color.BLUE);
     scene.add(hst);
     
     HTextButton knop1 = new HTextButton("Knop 1", 100, 300, 100, 100);
     knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
     knop1.setBackground(Color.RED);
     HTextButton knop2 = new HTextButton("Knop 2", 100, 450, 100, 100);
     knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
     knop2.setBackground(Color.BLACK);
     HTextButton knop3 = new HTextButton("Knop 3", 300, 300, 100, 100);
     knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
     knop3.setBackground(Color.GREEN);
     HTextButton knop4 = new HTextButton("Knop 4", 300, 450, 100, 100);
     knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
     knop4.setBackground(Color.YELLOW);
     
     scene.add(knop1);
     scene.add(knop2);
     scene.add(knop3);
     scene.add(knop4);
     
     knop1.setFocusTraversal(null, knop2, null, knop3); // up, down, left, right
     knop2.setFocusTraversal(knop1, null, null, knop4);
     knop3.setFocusTraversal(null, knop4, knop1, null);
     knop4.setFocusTraversal(knop3, null, knop2, null);
     
     knop1.setActionCommand("knop1");
     knop1.addHActionListener(this);
     
     knop2.setActionCommand("knop2");
     knop2.addHActionListener(this);
     knop3.setActionCommand("knop3");
     knop3.addHActionListener(this);
     knop4.setActionCommand("knop4");
     knop4.addHActionListener(this);
     
     scene.validate();
     scene.setVisible(true);
     knop1.requestFocus();
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    
}
