import lejos.nxt.*;

public class SonicTest {
    public static void main(String[] args) throws Exception {
        UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S1);

        while (!Button.ESCAPE.isDown()) {
            System.out.println(sonic.getVendorID());
            System.out.println(sonic.getProductID());
            System.out.println(sonic.getVersion());
            System.out.println(sonic.getDistance());
        }
    }
}