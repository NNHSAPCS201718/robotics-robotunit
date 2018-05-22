/**
 * Classical Hello World program for lejos
 *
 * @author gcschmit
 * @version 15 May 2018
 */
import lejos.nxt.Button;
import lejos.nxt.*;

public class Program4
{
    public static void main( String[] args )
    {
        System.out.println( "Program 4" );
        while(Motor.A.getTachoCount() >= -1440 && Button.ENTER.isPressed() == false)
        {
            System.out.println(Motor.A.getTachoCount());
            Motor.A.backward();
        }
        Motor.A.stop();  
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
        Button.waitForAnyPress();
    }
}
