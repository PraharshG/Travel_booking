import java.io.*;
import java.util.Date;

class Passenger_Info {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Inputs passenger details such as name, age, gender, journey date, and time.
     *
     * @throws IOException If an I/O error occurs during input.
     */
    public void Input_PassengerDet() throws IOException {
        //Implementation for Inputting Passenger Details
        System.out.println("Enter Passenger Name:");
        String name = in.readLine();
        // ... other passenger detail inputs ...
        System.out.println("Passenger details saved successfully.");

    }

    /**
     * Simulates a processing delay.  Provides feedback to the user.
     */
    public void ProcessingDelay() {
        //Implementation for Processing Delay
        System.out.println("Processing your request. Please wait...");
        //Simulate Delay
    }

    /**
     * Generates and displays the final ticket/bill. Uses data collected in Input_PassengerDet() and choices made in WaterWayTicketBooking().
     *
     * @param totalCost The total cost of the ticket.
     */
    public void GenerateBill(double totalCost) {
        //Implementation for Generating Bill
        System.out.println("Generating Bill...");
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Thank you for booking with us!");

    }


    /**
     * Formats passenger names for consistent display on the bill.
     * @param name The passenger's name.
     * @return The formatted passenger name.
     */
    public String PassengerNameMod(String name){
        return name.toUpperCase();
    }
}


public class WaterWays extends Passenger_Info {

    /**
     * Handles the booking process for waterway tickets. Guides the user through selecting a waterway type, destination, vessel type, cabin number(s), and generates a bill.
     * @throws IOException if an I/O error occurs during input.
     */
    public void WaterWayTicketBooking() throws IOException {
        int choice, choice1, cabinNum;
        double totalCost = 0;
        String destination = "";
        String vesselType = "";


        // Main booking loop
        while (true) {
            System.out.println("\nWelcome to WaterWays Ticket Booking");
            System.out.println("1. Oceanic Travel");
            System.out.println("2. Inland Travel");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(in.readLine());

            // Handle user choice for waterway type
            switch (choice) {
                case 1: // Oceanic Travel
                    System.out.println("\nOceanic Travel Destinations:");
                    System.out.println("1. New York");
                    System.out.println("2. London");
                    System.out.println("3. Sydney");
                    System.out.print("Enter your choice: ");
                    choice1 = Integer.parseInt(in.readLine());
                    switch (choice1) {
                        case 1:
                            destination = "New York";
                            totalCost += 5000; //Magic Number - Should be a constant
                            break;
                        case 2:
                            destination = "London";
                            totalCost += 6000; //Magic Number - Should be a constant
                            break;
                        case 3:
                            destination = "Sydney";
                            totalCost += 7000; //Magic Number - Should be a constant
                            break;
                        default:
                            System.out.println("Invalid Choice!");
                            continue;
                    }

                    // Vessel type selection for Oceanic
                    System.out.println("\nChoose Vessel Type:");
                    System.out.println("1. Cruise Ship");
                    System.out.println("2. Ferry");
                    choice1 = Integer.parseInt(in.readLine());
                    if (choice1 == 1) {
                        vesselType = "Cruise Ship";
                        totalCost += 2000; //Magic Number - Should be a constant
                    } else if (choice1 == 2) {
                        vesselType = "Ferry";
                        totalCost += 1000; //Magic Number - Should be a constant
                    } else {
                        System.out.println("Invalid Vessel Type");
                        continue;
                    }
                    break;
                case 2: // Inland Travel - similar logic as Oceanic
                    // ... (Add Inland Travel options and pricing) ...
                    break;
                case 3:
                    return; // Exit the booking process
                default:
                    System.out.println("Invalid choice!");
            }

            // Cabin selection
            System.out.print("Enter Cabin Number: ");
            cabinNum = Integer.parseInt(in.readLine());
            if (cabinNum <= 0 || cabinNum > 100) { //Magic Number - Should be a constant
                System.out.println("Invalid Cabin Number. Please choose between 1-100.");
                continue;
            }

            // Generate Bill
            GenerateBill(totalCost);
            break; // Exit the loop after successful booking

        }
    }

    /**
     * Main method to run the WaterWays ticket booking application.
     * @param args Command line arguments (not used).
     * @throws IOException If an I/O error occurs.
     */
    public static void main(String[] args) throws IOException {
        WaterWays ww = new WaterWays();
        ww.Input_PassengerDet();
        ww.WaterWayTicketBooking();
    }
}