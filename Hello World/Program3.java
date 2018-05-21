/**
 * Classical Hello World program for lejos
 *
 * @author gcschmit
 * @version 15 May 2018
 */
import lejos.nxt.Button;
import lejos.nxt.*;
import lejos.util.Delay;

public class Program3
{
    public static void main( String[] args )
    {
        System.out.println( "Program 3" );
        Button.waitForAnyPress();
        Motor.A.rotate(1440);
        System.out.println(Motor.A.getTachoCount());
        Motor.A.rotateTo(0);
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
    }
}
