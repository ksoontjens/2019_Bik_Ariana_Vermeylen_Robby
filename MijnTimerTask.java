/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.util.TimerTask;

/**
 *
 * @author Robin
 */
public class MijnTimerTask extends TimerTask {
    

HelloTVXlet xlet;


   public void run()
    {
       xlet.tick();

}
}
