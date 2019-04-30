
package hellotvxlet;

import java.util.Timer;
import java.util.TimerTask;


public class timer 
{


int seconds = 30;   
int minutes = 1;
int MAX = 60;
Timer timer = new Timer();
TimerTask task =  new TimerTask()
{
    public void run()
    {
        if(seconds!=-1)
        {
            seconds --;
            System.out.println(minutes + " : " + seconds);
        }
        else
        {
            minutes--;
            seconds =60;
        }
    }
};
/*timer.ScheduleAtFixedRate(task, 0, 1000);*/

}


 
