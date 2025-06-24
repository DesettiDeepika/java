import java.util.*;

interface PollutionControl {
    void checkEmission();
}

abstract class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
    abstract void fuelType();
}

class Car extends Vehicle implements PollutionControl {
    void fuelType() {
        System.out.println("Petrol");
    }
    public void checkEmission() {
        System.out.println("Car emission checked");
    }
}

class Bike extends Vehicle implements PollutionControl {
    void fuelType() {
        System.out.println("Petrol");
    }
    public void checkEmission() {
        System.out.println("Bike emission checked");
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuelType();
        c.checkEmission();

        Bike b = new Bike();
        b.start();
        b.fuelType();
        b.checkEmission();
    }
}
