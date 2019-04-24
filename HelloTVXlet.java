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

    HScene scene = HSceneFactory.getInstance().getDefaultHScene();
  
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context)
    {
      HStaticText hst = new HStaticText("Vraag 1",100,100,300,100);
     //Tekst, X, Y, B, H
     
      hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst.setBackground(Color.BLUE);
      
      scene.add(hst);
      
      HTextButton knop1 = new HTextButton("Antwoord 1", 100,300,100,100);
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop1.setBackground(Color.BLUE);
      
       HTextButton knop2 = new HTextButton("Antwoord 2", 100,450,100,100);
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop2.setBackground(Color.BLUE);
      
       HTextButton knop3 = new HTextButton("Antwoord 3", 300,300,100,100);
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop3.setBackground(Color.BLUE);
      
       HTextButton knop4 = new HTextButton("Antwoord 4", 300,450,100,100);
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop4.setBackground(Color.BLUE);
      
      scene.add(knop1);
        scene.add(knop2);
          scene.add(knop3);
            scene.add(knop4);
      
      knop1.setFocusTraversal(null, knop2, null, knop3);
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
     
    public void actionPerformed(ActionEvent arg0)
    { 
        if(arg0.getActionCommand().equals("knop3"))
        {
          System.out.println("JUIST");
          HStaticText fb = new HStaticText("JUIST!", 425,100,200,100);
          fb.setBackground(Color.GREEN);
          fb.setBackgroundMode(HVisible.BACKGROUND_FILL);
          
          scene.add(fb);
          scene.popToFront(fb);
          scene.repaint();
        }
        else
        {
            System.out.println("FOUT");
          HStaticText fb = new HStaticText("FOUT!", 425,100,200,100);
          fb.setBackground(Color.RED);
          fb.setBackgroundMode(HVisible.BACKGROUND_FILL);
          
          scene.add(fb);
          scene.popToFront(fb);
          scene.repaint();
        }
        
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    
}
