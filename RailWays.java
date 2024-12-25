import java.io.*;
import java.util.*;

class Passenger_Info {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Collects passenger details from the user.
     *
     * @throws IOException if an I/O error occurs during input.
     */
    public void Input_PassengerDet() throws IOException {
        //Implementation to get Passenger details
        System.out.println("Enter Passenger Name:");
        String name = in.readLine();
        System.out.println("Enter Passenger Age:");
        int age = Integer.parseInt(in.readLine());
        System.out.println("Enter Passenger Gender:");
        char gender = in.readLine().charAt(0);
        System.out.println("Enter Journey Date (yyyy-MM-dd):");
        String date = in.readLine();
        System.out.println("Enter Journey Time (HH:mm):");
        String time = in.readLine();
        //Store the details,  implementation omitted for brevity
    }


    /**
     * Simulates a processing delay.  Primarily for visual effect.
     */
    public void ProcessingDelay() {
        //Implementation to simulate delay
        for (int i = 0; i < 100000000; i++) {
            for (int j = 0; j < 10000; j++);
        }

    }

    /**
     * Generates and displays the railway ticket bill.
     * Uses data collected in Input_PassengerDet().  Also utilizes PassengerNameMod() for formatting.
     * @param  ticketNumber The generated ticket number.
     * @param  destination The destination of the journey.
     * @param  totalCost The total cost of the ticket.
     * @param  seatNumber The assigned seat number.
     */
    public void GenerateBill(int ticketNumber, String destination, double totalCost, int seatNumber) {
        //Implementation to Generate Bill using passenger details collected in Input_PassengerDet()
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Seat Number: " + seatNumber);

    }

    /**
     * Formats the passenger's name for display in the bill. (Example implementation)
     * @param name The passenger's name.
     * @return The formatted passenger's name.
     */
    public String PassengerNameMod(String name){
        return name.toUpperCase();
    }

}


public class RailWays extends Passenger_Info {
    /**
     * Guides the user through the railway ticket booking process.
     * Uses a menu-driven approach to collect user choices and calculate the total cost.
     * Calls methods from Passenger_Info to collect passenger details and generate the bill.
     * @throws IOException if an I/O error occurs during input.
     */
    public void RailWayTicketBooking() throws IOException {
        int choice, type, ac;
        String destination;
        int seatNumber;
        double totalCost = 0;
        int ticketNumber;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();

        while (true) {
            System.out.println("\nRailway Ticket Booking System");
            System.out.println("1. Book Ticket");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(in.readLine());


            switch (choice) {
                case 1:
                    System.out.println("\nSelect Train Type:");
                    System.out.println("1. Passenger");
                    System.out.println("2. Cargo");
                    System.out.print("Enter your choice: ");
                    type = Integer.parseInt(in.readLine());

                    Input_PassengerDet();

                    if (type == 1) {
                        System.out.println("\nSelect Class/Type:");
                        System.out.println("1. Sleeper");
                        System.out.println("2. AC");
                        System.out.print("Enter your choice: ");
                        ac = Integer.parseInt(in.readLine());

                        System.out.print("Enter Destination: ");
                        destination = in.readLine();
                        System.out.print("Enter Seat Number: ");
                        seatNumber = Integer.parseInt(in.readLine());


                        if (ac == 1) {
                            totalCost = 500; // Example price
                        } else if (ac == 2) {
                            totalCost = 1000; // Example price
                        } else {
                            System.out.println("Invalid choice. Booking cancelled.");
                            break;
                        }
                    } else if (type == 2) {
                        System.out.print("Enter Destination: ");
                        destination = in.readLine();
                        System.out.print("Enter Seat Number: ");
                        seatNumber = Integer.parseInt(in.readLine());
                        totalCost = 2000; // Example price

                    } else {
                        System.out.println("Invalid choice. Booking cancelled.");
                        break;
                    }


                    ticketNumber = rand.nextInt(1000); // Generates a random ticket number. Should be improved.
                    GenerateBill(ticketNumber, destination, totalCost, seatNumber);
                    ProcessingDelay();
                    break;
                case 2:
                    System.out.println("Thank you for using the Railway Ticket Booking System.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        RailWays objRW = new RailWays();
        objRW.RailWayTicketBooking();
    }
}