/**
 * Classical Hello World program for lejos
 *
 * @author gcschmit
 * @version 15 May 2018
 */
import lejos.nxt.Button;
import lejos.nxt.*;
import lejos.util.Delay;

public class Program5
{
    public static void main( String[] args )
    {
        System.out.println( "Program 5" );
        Motor.A.setSpeed(720);
        Motor.B.setSpeed(720);
        Motor.C.setSpeed(720);
        Motor.A.rotate(720,true);
        Motor.B.rotate(720,true);
        Motor.C.rotate(720,true);
        for(int i = 0; i < 8; i++)
        {
            Delay delay = new Delay();
            delay.msDelay(200);
            System.out.println(Motor.A.getTachoCount() +"   "+ 
                Motor.B.getTachoCount() + "   " +
                Motor.C.getTachoCount());
        }
        while(Motor.A.isMoving()|| Motor.B.isMoving()||Motor.C.isMoving());
        Button.waitForAnyPress();
    }
}
