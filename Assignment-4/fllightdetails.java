import java.util.Scanner;

class Flight {
    // Private members
    private int flightNumber;
    private String destination;
    private float distance;
    private float fuel;

    // Private method to calculate fuel
    private void calFuel() {
        if (distance <= 1000)
            fuel = 500;
        else if (distance <= 2000)
            fuel = 1100;
        else
            fuel = 2200;
    }

    // Public method to input details and call calFuel()
    public void feedInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Flight Number: ");
        flightNumber = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        System.out.print("Enter Distance (in km): ");
        distance = sc.nextFloat();

        calFuel(); // calculate fuel internally
    }

    // Public method to display flight details
    public void showInfo() {
        System.out.println("\nFlight Details:");
        System.out.println("Flight Number : " + flightNumber);
        System.out.println("Destination   : " + destination);
        System.out.println("Distance (km) : " + distance);
        System.out.println("Fuel (liters) : " + fuel);
    }
}

// Main class
public class FlightDetails {
    public static void main(String[] args) {
        Flight f = new Flight();
        f.feedInfo();
        f.showInfo();
    }
}
