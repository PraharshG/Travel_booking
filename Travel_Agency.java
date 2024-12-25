/**
 * This class serves as the main entry point for the travel agency booking system.
 * It presents a menu to the user, allowing them to select a travel mode and handle the booking process.
 */
import java.util.Scanner;

public class Travel_Agency {

    /**
     * The main method of the application.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Display welcome message and agency details.
        System.out.println("Welcome to our Travel Agency!");
        System.out.println("-----------------------------");


        do {
            // Display travel options menu.
            System.out.println("\nChoose your travel mode:");
            System.out.println("1. Airways");
            System.out.println("2. Waterways");
            System.out.println("3. Railways");
            System.out.println("4. Roadways");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Take user input for travel mode choice.  Basic error handling.
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create an Airways object and handle the booking.
                    AirWays air = new AirWays();
                    Passenger_Info.Input_PassengerDet(scanner);  //Collect passenger details
                    air.AirWayTicketBooking(scanner);
                    break;
                case 2:
                    // Create a Waterways object and handle the booking.
                    WaterWays water = new WaterWays();
                    Passenger_Info.Input_PassengerDet(scanner); //Collect passenger details
                    water.WaterWayTicketBooking(scanner);
                    break;
                case 3:
                    // Create a Railways object and handle the booking.
                    RailWays rail = new RailWays();
                    Passenger_Info.Input_PassengerDet(scanner); //Collect passenger details
                    rail.RailWayTicketBooking(scanner);
                    break;
                case 4:
                    // Create a RoadWays object and handle the booking.
                    RoadWays road = new RoadWays();
                    Passenger_Info.Input_PassengerDet(scanner); //Collect passenger details
                    road.RoadWayTicketBooking(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}


/**
 * This class is a superclass for all travel modes, providing common functionalities for passenger information,
 * processing delays, and bill generation.
 */
class Passenger_Info {

    /**
     * Collects passenger details from the user.
     * @param scanner The Scanner object to read user input.
     */
    public static void Input_PassengerDet(Scanner scanner) {
        //Implementation to collect passenger details.  Could be improved with input validation.
        System.out.println("Enter passenger name:");
        scanner.next(); // Read and discard the passenger name (for simplicity in this example)
        System.out.println("Passenger details recorded.");
    }

    /**
     * Simulates a processing delay.
     */
    public void ProcessingDelay() {
        // Simulate processing delay (implementation omitted for brevity).
        System.out.println("Processing your request...");
    }

    /**
     * Generates a bill.
     */
    public void GenerateBill() {
        //Implementation to generate the bill (omitted for brevity).
        System.out.println("Bill generated.");
    }
}

/**
 * This class handles booking for Airways.  It inherits from Passenger_Info.
 */
class AirWays extends Passenger_Info {
    /**
     * Handles the booking process for Air travel.
     * @param scanner The Scanner object used to obtain user input.
     */
    public void AirWayTicketBooking(Scanner scanner) {
        ProcessingDelay();
        GenerateBill();
    }
}

/**
 * This class handles booking for Waterways. It inherits from Passenger_Info.
 */
class WaterWays extends Passenger_Info {
    /**
     * Handles the booking process for Water travel.
     * @param scanner The Scanner object used to obtain user input.
     */
    public void WaterWayTicketBooking(Scanner scanner) {
        ProcessingDelay();
        GenerateBill();
    }
}

/**
 * This class handles booking for Railways. It inherits from Passenger_Info.
 */
class RailWays extends Passenger_Info {
    /**
     * Handles the booking process for Rail travel.
     * @param scanner The Scanner object used to obtain user input.
     */
    public void RailWayTicketBooking(Scanner scanner) {
        ProcessingDelay();
        GenerateBill();
    }
}

/**
 * This class handles booking for Roadways. It inherits from Passenger_Info.
 */
class RoadWays extends Passenger_Info {
    /**
     * Handles the booking process for Road travel.
     * @param scanner The Scanner object used to obtain user input.
     */
    public void RoadWayTicketBooking(Scanner scanner) {
        ProcessingDelay();
        GenerateBill();
    }
}