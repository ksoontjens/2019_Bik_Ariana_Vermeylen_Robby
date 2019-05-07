package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Timer;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {

    HScene scene = HSceneFactory.getInstance().getDefaultHScene();
    MyComponent mc2 = new MyComponent(0,0,720,576);
    
        
    int seconds = 30;   
    int minutes = 1;
    int MAX = 60;
    HStaticText timerText = new HStaticText(minutes + " : " + seconds, 325, 260,70,50);
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context)
    {
        //QUESTION
      HStaticText hst = new HStaticText("Vraag 1",0,25,800,75);
     //Tekst, X, Y, B, H
     
      hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst.setBackground(Color.BLUE);
      
      scene.add(hst);
      //KNOPPEN
      HTextButton knop1 = new HTextButton("Antwoord 1", 75,450,150,100);
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop1.setBackground(Color.BLUE);
      
       HTextButton knop2 = new HTextButton("Antwoord 2", 225,450,150,100);
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop2.setBackground(Color.BLUE);
      
       HTextButton knop3 = new HTextButton("Antwoord 3", 375,450,150,100);
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop3.setBackground(Color.BLUE);
      
       HTextButton knop4 = new HTextButton("Antwoord 4", 525,450,150,100);
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop4.setBackground(Color.BLUE);
      
      scene.add(knop1);
        scene.add(knop2);
          scene.add(knop3);
            scene.add(knop4);
     //up, down, left, right
      knop1.setFocusTraversal(null, null, knop4, knop2);
         knop2.setFocusTraversal(null, null, knop1, knop3);
            knop3.setFocusTraversal(null, null, knop2, knop4);
               knop4.setFocusTraversal(knop3, null, knop3, knop4);
               
        knop1.setActionCommand("knop1");
        knop1.addHActionListener(this);
        
         knop2.setActionCommand("knop2");
        knop2.addHActionListener(this);
        
         knop3.setActionCommand("knop3");
        knop3.addHActionListener(this);
        
         knop4.setActionCommand("knop4");
        knop4.addHActionListener(this);
        
        //TIMER
         timerText = new HStaticText(minutes + " : " + seconds, 325, 260,70,50);
         scene.add(timerText);             
         scene.popToFront(timerText);

        Timer timer = new Timer();
        MijnTimerTask task =  new MijnTimerTask();
        task.xlet=this;
        timer.scheduleAtFixedRate(task, 0, 1000);
        
        tick();  
       
        
        scene.add(mc2);
        scene.validate();
        scene.setVisible(true);
        knop1.requestFocus();
        
        
      
     
       
    }
    public void tick()
    {
      //System.out.println("Tcik");
       
                if(seconds!=0)
        {
               timerText.setTextContent(minutes + " : " + seconds, HVisible.NORMAL_STATE);
         System.out.println(minutes + " : " + seconds);
scene.repaint();
                 timerText.setBackgroundMode(HVisible.BACKGROUND_FILL);
                 timerText.setBackground(Color.BLACK);
                 seconds--;
        }
        else
        {
            minutes--;
            seconds =60;
        }
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
