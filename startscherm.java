package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener
{
    mijnComponent mc2 = new mijnComponent (0,0,720,576);
      HScene scene = HSceneFactory.getInstance().getDefaultHScene();
      HTextButton knop1 = new HTextButton("Informatica", 100,100,150,40);
      HTextButton knop2 = new HTextButton("Muziek", 100,150,150,40);
      HTextButton knop3 = new HTextButton("Artiesten", 100,200,150,40);
      HTextButton knop4 = new HTextButton("Aardrijkskunde", 100,250,150,40);
      HTextButton knop5 = new HTextButton("Films", 100,300,150,40);
      HTextButton knop6 = new HTextButton("Transport", 100,350,150,40);
      HTextButton knop7 = new HTextButton("Biologie", 100,400,150,40);
      HTextButton knop8 = new HTextButton("Chemie", 100,450,150,40);         
               
               
    public HelloTVXlet() 
    {
        
    }
 public void initXlet(XletContext context) 
 {
     
     VoegSelectieKnoppenToe();
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
 
 public void VoegVraagToe(String vraag, String ant1, String ant2, String ant3, String ant4, String juist) 
 {
     
 }
 
 public void ToonVraag(int vr)
 {
     switch (vr)
     {
             case 1:
             VoegVraagToe ("Hoeveel bits zitten in één byte?", "één","twee","vier","acht","acht");
             break;
     }
                 
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
      
      knop4.setEnabled(false);
      
      
      
      knop1.setFocusTraversal(null, knop2, null, null);
      knop1.setFocusTraversal(knop1, knop3, null, null);
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
      
      
    
      
    /*  switch ()
      {
      
      }
      
     */

     
     
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    public void actionPerformed(ActionEvent arg0)
    {
        
    if (arg0.getActionCommand()=="knop1") // Informatica
    {
        VerwijderKnoppen();
    do
    {
        ToonVraag(1);
    }while(arg0.getActionCommand()!="knop2");
        
        
    }
    else if (arg0.getActionCommand()=="knop2")
    {
        VerwijderKnoppen();
        do
    {
        ToonVraag(2);
    }while(arg0.getActionCommand()!="knop2");
       
    }
    
    else if (arg0.getActionCommand()=="knop3")
    {
        VerwijderKnoppen();
      do
    {
        ToonVraag(3);
    }while(arg0.getActionCommand()!="knop2");
    }
    else if (arg0.getActionCommand()=="knop4")
    {
        VerwijderKnoppen();
        do
    {
        ToonVraag(4);
    }while(arg0.getActionCommand()!="knop2");
    }
    else if (arg0.getActionCommand()=="knop5")
    {
        VerwijderKnoppen();
       do
    {
        ToonVraag(5);
    }while(arg0.getActionCommand()!="knop2");
    }
    else if (arg0.getActionCommand()=="knop6")
    {
        VerwijderKnoppen();
       do
    {
        ToonVraag(6);
    }while(arg0.getActionCommand()!="knop2");
    }
    else if (arg0.getActionCommand()=="knop7")
    {
        VerwijderKnoppen();
        do
    {
        ToonVraag(7);
    }while(arg0.getActionCommand()!="knop2");
    }
    else if (arg0.getActionCommand()=="knop8")
    {
        VerwijderKnoppen();
        do
    {
        ToonVraag(8);
    }while(arg0.getActionCommand()!="knop2");
    }
    
   }  
}