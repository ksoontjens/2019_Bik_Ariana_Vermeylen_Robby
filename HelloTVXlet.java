    
package hellotvxlet;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.Timer;
import javax.tv.xlet.*;
import org.havi.ui.HIcon;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {

    HScene scene = HSceneFactory.getInstance().getDefaultHScene();
    mijnComponent mc2 = new mijnComponent(0,0,720,576);
     HStaticText feedback = new HStaticText("JUIST!", 75, 400, 200, 100);

    
        String juisteantwoord="";
    int seconds = 5;   
    int minutes = 0;
    int MAX = 60;
    HStaticText timerText = new HStaticText(minutes + " : " + seconds, 325, 260,70,50);
    
    //Selectie
     //Tekst, X, Y, B, H
     HTextButton knop1 = new HTextButton("Informatica", 300,50,150,40);
     HTextButton knop2 = new HTextButton("Muziek", 475,150,150,40);
     HTextButton knop3 = new HTextButton("Artiesten", 475,225,150,40);
     HTextButton knop4 = new HTextButton("Aardrijkskunde", 475,300,150,40);
     HTextButton knop5 = new HTextButton("Films", 300,425,150,40);
     HTextButton knop6 = new HTextButton("Transport", 100,150,150,40);
     HTextButton knop7 = new HTextButton("Biologie", 100,225,150,40);
     HTextButton knop8 = new HTextButton("Chemie", 100,300,150,40);
     
     
     
     
     
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context)
    {
       
        VoegSelectieKnoppenToe();
        
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
      
        
        
      
     
       
    }
    
    public void VerwijderKnoppen()
    {
     scene.remove(knop1);
     scene.remove(knop2);
     scene.remove(knop3);
     scene.remove(knop4);
      scene.remove(knop5);
     scene.remove(knop6);
     scene.remove(knop7);
     scene.remove(knop8);
     scene.repaint();    
    }
    
   

  public void ToonVraag(int vr)
         
 {
     switch (vr)
     {
             case 1:
             VoegVraagToe ("Hoeveel bits zitten in één byte?", "één","twee","vier","acht","acht");
             break;
             
             case 2:
             VoegVraagToe ("Welke groep had de song 'I want it all'? ", "Queen","Michael Jackson","Linkin Park","Meatloaf","Queen");
             break;
             
             case 3:
             VoegVraagToe ("Welke artiest stierf in juni 2009? ", "Queen","Michael Jackson","Linkin Park","Meatloaf","Michael Jackson");
             break;
             
             case 4:
             VoegVraagToe ("Wat is de nationale bloem van Litouwen? ", "Tulp","Jasmijn","Wijnruit","Bibiscus","Wijnruit");
             break;          
            
             
               case 5:
             VoegVraagToe ("Wat was het eerste personage van de Marvel- strips waarvan er een speelfilm werd opgenomen? ", "Docter Strange","Spider-man","Howard TheDuck","Iron man","Howard TheDuck");
             break;
             
               case 6:
             VoegVraagToe ("Welk vervoersmiddel was die eerste die de wereld rond ging zonder stops? ", "Vliegtuig","Bus","Luchtballon","Trein","Vliegtuig");
             break;
             
               case 7:
             VoegVraagToe ("Welke laag van de epidermis bestaat uit dode cellen? ", "Korrellaag","Stekelcellige laag","Heldere laag","Hoornlaag","Hoornlaag");
             break;
             
               case 8:
             VoegVraagToe ("Wat is de chemische formule van kwarts? ", "C2H5OH","SIO2","PO43","CaCO3","SIO2");
             break;
             
             
     }
                 
 }
    
    public void VoegVraagToe(String vraag, String ant1, String ant2, String ant3, String ant4, String juist)
    {
     //QUESTION
        
        juisteantwoord=juist; //bewaar het juiste antwoord in deze variable
  
      //  System.out.println("Voegvraagtoe:"+vraag+" "+ant1);
     
     //Tekst, X, Y, B, H
      HStaticText hst = new HStaticText(vraag,0,25,750,75);
      hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst.setBackground(Color.BLUE);
      
      scene.add(hst);
      //KNOPPEN
      HTextButton knop9 = new HTextButton(ant1, 75,450,150,100);
      knop9.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop9.setBackground(Color.BLUE);
      
       HTextButton knop10 = new HTextButton(ant2, 225,450,150,100);
      knop10.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop10.setBackground(Color.BLUE);
      
       HTextButton knop11 = new HTextButton(ant3, 375,450,150,100);
      knop11.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop11.setBackground(Color.BLUE);
      
       HTextButton knop12 = new HTextButton(ant4, 525,450,150,100);
      knop12.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop12.setBackground(Color.BLUE);
      
      scene.add(knop9);
        scene.add(knop10);
          scene.add(knop11);
            scene.add(knop12);
     //up, down, left, right
      knop9.setFocusTraversal(null, null, knop12, knop10);
         knop10.setFocusTraversal(null, null, knop9, knop11);
            knop11.setFocusTraversal(null, null, knop10, knop12);
               knop12.setFocusTraversal(null, null, knop11, knop9);
               
        knop9.setActionCommand(ant1);
        knop9.addHActionListener(this);
        
         knop10.setActionCommand(ant2);
        knop10.addHActionListener(this);
        
         knop11.setActionCommand(ant3);
        knop11.addHActionListener(this);
        
         knop12.setActionCommand(ant4);
        knop12.addHActionListener(this);
        
          scene.popToFront(hst);
          
          scene.popToFront(knop9);
              
          scene.popToFront(knop10);
              
          scene.popToFront(knop11);
              
          scene.popToFront(knop12);
          
          
                
          scene.repaint();
         // knop9.requestFocus();
            knop9.requestFocus();
    }
    
    public void VoegSelectieKnoppenToe()
    {
     
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop1.setBackground(Color.BLUE);
      
     
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop2.setBackground(Color.BLUE);
      
     
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop3.setBackground(Color.BLUE);
      
     
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop4.setBackground(Color.BLUE);
      
      
      knop5.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop5.setBackground(Color.BLUE);
      
     
      knop6.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop6.setBackground(Color.BLUE);
      
    
      knop7.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop7.setBackground(Color.BLUE);
      
     
      knop8.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop8.setBackground(Color.BLUE);
      
      scene.add(knop1);
      scene.add(knop2);
      scene.add(knop3);
      scene.add(knop4);
      scene.add(knop5);
      scene.add(knop6);
      scene.add(knop7);
      scene.add(knop8);
      
      scene.popToFront(knop1);
      scene.popToFront(knop2);
      scene.popToFront(knop3);
      scene.popToFront(knop4);
      scene.popToFront(knop5);
      scene.popToFront(knop6);
      scene.popToFront(knop7);
      scene.popToFront(knop8);
      
      
      
      knop1.requestFocus();
    
      // setfocustraversal
      // request focus
      
      knop1.setActionCommand("knop1");
      knop1.addHActionListener(this);
      knop2.setActionCommand("knop2");
      knop2.addHActionListener(this);
      knop3.setActionCommand("knop3");
      knop3.addHActionListener(this);
      knop4.setActionCommand("knop4");
      knop4.addHActionListener(this);
      knop5.setActionCommand("knop5");
      knop5.addHActionListener(this);
      knop6.setActionCommand("knop6");
      knop6.addHActionListener(this);
      knop7.setActionCommand("knop7");
      knop7.addHActionListener(this);
      knop8.setActionCommand("knop8");
      knop8.addHActionListener(this);
      
       //up, down, left, right
        knop1.setFocusTraversal(null, knop2, knop6, knop2);
         knop2.setFocusTraversal(knop1, knop3, knop4, knop3);
            knop3.setFocusTraversal(knop2, knop4, knop2, knop4);
               knop4.setFocusTraversal(knop3, knop5, knop5, knop5);
               
                 knop5.setFocusTraversal(knop4, null, knop8, knop4);
                   knop6.setFocusTraversal(knop1, knop7, null, knop1);
                     knop7.setFocusTraversal(knop6, knop8, null, null);
                       knop8.setFocusTraversal(knop7, knop5, null, knop5);
    
    }
      
    public void tick()
    {
      //System.out.println("Tcik");
       
                if(seconds!=0)
        {
               timerText.setTextContent(minutes + " : " + seconds, HVisible.NORMAL_STATE);
        // System.out.println(minutes + " : " + seconds);
scene.repaint();
                 timerText.setBackgroundMode(HVisible.BACKGROUND_FILL);
                 timerText.setBackground(Color.BLACK);
                 seconds--;
                 
               
        }
         else if(seconds == 0 && minutes == 0)
         {
                    minutes = 0;
                    seconds = 0;
                    
            Image explosion;
            explosion =scene.getToolkit().getImage("explosion2.gif"); 
            HIcon icon=new HIcon(explosion,50,50,800,800);
            scene.add(icon);
            scene.popToFront(icon);
            scene.repaint();
         }
        else
        {                   
            minutes--;
            seconds =59;          
              
        }
        
      
    }
     
    public void actionPerformed(ActionEvent arg0)
    {      
        //vragen
          if (arg0.getActionCommand()==juisteantwoord)
          {
             // System.out.println("juiste antwoord!!!");
           feedback = new HStaticText("JUIST!", 75, 400, 200, 100);
            feedback.setBackground(Color.GREEN);
            feedback.setBackgroundMode(HVisible.BACKGROUND_FILL);
            scene.add(feedback);
           
           
            scene.popToFront(mc2);
             VoegSelectieKnoppenToe();
             scene.popToFront(timerText);
              scene.popToFront(feedback);
             
              scene.repaint();
          }
         else if(arg0.getActionCommand()!=juisteantwoord)
          {
          //  System.out.println("FOUT!");
            int y=0;
            feedback = new HStaticText("FOUT!", 475, 400, 200, 100);
            feedback.setBackground(Color.RED);
            feedback.setBackgroundMode(HVisible.BACKGROUND_FILL);
            scene.add(feedback);
            
            
             scene.popToFront(mc2);
             VoegSelectieKnoppenToe();
             scene.popToFront(timerText);
             scene.popToFront(feedback);
             
             scene.repaint();
          
          }
        
        //hoofdmenu
    if (arg0.getActionCommand()=="knop1") // Informatica
    {
        VerwijderKnoppen();
        scene.remove(feedback);
        ToonVraag(1);

        
    }
    else if (arg0.getActionCommand()=="knop2")
    {
        VerwijderKnoppen();
   scene.remove(feedback);
        ToonVraag(2);
   
       
    }
    
    else if (arg0.getActionCommand()=="knop3")
    {
        VerwijderKnoppen();
   
     scene.remove(feedback);
        ToonVraag(3);
   
    }
    else if (arg0.getActionCommand()=="knop4")
    {
        VerwijderKnoppen();
     scene.remove(feedback);
        ToonVraag(4);
 
    }
    else if (arg0.getActionCommand()=="knop5")
    {
        VerwijderKnoppen();
    scene.remove(feedback);
        ToonVraag(5);
    
    }
    else if (arg0.getActionCommand()=="knop6")
    {
        VerwijderKnoppen();
    scene.remove(feedback);
        ToonVraag(6);
    
    }
    else if (arg0.getActionCommand()=="knop7")
    {
        VerwijderKnoppen();
    scene.remove(feedback);
        ToonVraag(7);
   
    }
    else if (arg0.getActionCommand()=="knop8")
    {
        VerwijderKnoppen();
      scene.remove(feedback);
        ToonVraag(8);
 
    }
        
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    
}
