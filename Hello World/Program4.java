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
        Motor.A.rotate(-1440);
        while(Motor.A.isMoving())
        {
            System.out.println(Motor.A.getTachoCount());
            if(Button.ENTER.isPressed())
            {
              Motor.A.stop();  
            }
        }
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
    }
}
