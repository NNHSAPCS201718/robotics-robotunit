import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * Robot that stops if it hits something before it completes its travel.
 */
public class Square {
    DifferentialPilot pilot;

    public void go() {
        
        for ( int i = 1; i <= 3; i++)
        {
            pilot.travel(20);
            pilot.rotate(90);
        }
        pilot.travel(20);
    }

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.pilot = new DifferentialPilot ( 2.125 ,4.2 , Motor.A, Motor.B);
        s1.go();
    }
}