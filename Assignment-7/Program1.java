import java.util.Scanner;

class Vehicle {
    String brand;
    String model;
    int year;
}

class Car extends Vehicle {
    String fuelType;
    int seatingCapacity;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        brand = sc.nextLine();
        model = sc.nextLine();
        year = sc.nextInt();
        sc.nextLine();
        fuelType = sc.nextLine();
        seatingCapacity = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.inputDetails();
        c.displayDetails();
    }
}
