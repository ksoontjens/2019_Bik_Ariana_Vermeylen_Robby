/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

/**
 *
 * @author student
 */
public class startscherm µ
{
    
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
  
    public HelloTVXlet() 
    {
        
    }

    public void initXlet(XletContext context) 
    {
      HScene scene = HSceneFactory.getInstance().getDefaultHScene();
      HTextButton knop1 = new HTextButton("Informatica", 100,100,150,40);
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop1.setBackground(Color.BLUE);
      
      HTextButton knop2 = new HTextButton("Muziek", 100,150,150,40);
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop2.setBackground(Color.BLUE);
      
      HTextButton knop3 = new HTextButton("Artiesten", 100,200,150,40);
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop3.setBackground(Color.BLUE);
      
      HTextButton knop4 = new HTextButton("Aardrijkskunde", 100,250,150,40);
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop4.setBackground(Color.BLUE);
      
      HTextButton knop5 = new HTextButton("Films", 100,300,150,40);
      knop5.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop5.setBackground(Color.BLUE);
      
      HTextButton knop6 = new HTextButton("Transport", 100,350,150,40);
      knop6.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop6.setBackground(Color.BLUE);
      
      HTextButton knop7 = new HTextButton("Biologie", 100,400,150,40);
      knop7.setBackgroundMode(HVisible.BACKGROUND_FILL);
      knop7.setBackground(Color.BLUE);
      
      HTextButton knop8 = new HTextButton("Chemie", 100,450,150,40);
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
    
      
      
     
     scene.validate();
     scene.setVisible(true);
     
     
     
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
