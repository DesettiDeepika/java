import java.util.*;

interface Switchable {
    void turnOn();
    void turnOff();
}

interface Configurable {
    void configure();
}

class SmartBulb implements Switchable, Configurable {
    public void turnOn() {
        System.out.println("Bulb on");
    }
    public void turnOff() {
        System.out.println("Bulb off");
    }
    public void configure() {
        System.out.println("Bulb configured");
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        SmartBulb s = new SmartBulb();
        s.turnOn();
        s.configure();
        s.turnOff();
    }
}
