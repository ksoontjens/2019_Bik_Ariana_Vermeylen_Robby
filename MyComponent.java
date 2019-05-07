/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import org.havi.ui.HComponent;

/**
 *
 * @author student
 */
public class MyComponent extends HComponent
{
  Image background;
  int y = 0;
  public MyComponent()
  {
      
  }
  public MyComponent(int x, int y, int width, int hight)
  {
    this.setBounds(x, y, width, hight);
    background = this.getToolkit().getImage("bom_good_resolution.PNG");
    
    MediaTracker mt = new MediaTracker(this);
    mt.addImage(background, 0);
    
    try {mt.waitForAll();}
    catch(InterruptedException ex) { ex.printStackTrace(); }
    
  }
  
  public void paint (Graphics g)
  {
    g.setColor(Color.RED);
    g.drawLine(0,0,100,100);
    g.drawImage(background, 0, y - 2, this);
  }
}
