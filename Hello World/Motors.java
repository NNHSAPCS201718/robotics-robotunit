/**
 * Classical Hello World program for lejos
 *
 * @author gcschmit
 * @version 15 May 2018
 */
import lejos.nxt.Button;

import lejos.nxt.*;
public class Motors
{
    
    public static void main( String[] args )
    {
        System.out.println( "Program 1" );
        Button.waitForAnyPress();
        Motor.A.forward();
        System.out.println( "FORWARD" );
        Button.waitForAnyPress();
        Motor.A.backward();
        System.out.println( "BACKWARD" );
        Button.waitForAnyPress();
        
    }
}
