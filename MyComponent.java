/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

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
  
  public MyComponent(int x, int y, int width, int hight)
  {
    this.setBounds(x, y, width, hight);
    this.getToolkit().getImage("bom.jpg");
    
    MediaTracker mt = new MediaTracker(this);
    mt.addImage(background, 0);
    
  }
}
