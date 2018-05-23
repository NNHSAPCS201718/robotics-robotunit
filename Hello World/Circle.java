import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle
{
    DifferentialPilot pilot;
    public void go() {
        pilot.steer(45,360);
    }
   
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.pilot = new DifferentialPilot ( 2.125 ,4.2 , Motor.A, Motor.B);
        c1.go();
    }
}
