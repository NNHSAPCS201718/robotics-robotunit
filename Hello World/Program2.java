/**
 * Classical Hello World program for lejos
 *
 * @author gcschmit
 * @version 15 May 2018
 */
import lejos.nxt.Button;
import lejos.nxt.*;
import lejos.util.Delay;

public class Program2
{
    public static void main( String[] args )
    {
        System.out.println( "Program 2" );
        Motor.A.setSpeed(720);
        Motor.A.forward();
        Delay delay = new Delay();
        delay.msDelay(2000);
        System.out.println(Motor.A.getTachoCount());
        Motor.A.stop();
        System.out.println(Motor.A.getTachoCount());
        Motor.A.backward();
        if(Motor.A.getTachoCount() == 0)
        {
            System.out.println(Motor.A.getTachoCount());
            Motor.A.stop();
        }
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
    }
}
