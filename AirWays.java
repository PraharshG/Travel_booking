import java.io.*;

class Passenger_Info {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int p;

    /**
     * Collects passenger details (name, age, gender) from the user.
     *
     * @throws IOException If an I/O error occurs during input reading.
     */
    void Input_PassengerDet() throws IOException {
        System.out.println("Enter the number of passengers:");
        p = Integer.parseInt(in.readLine());
        // Add code to collect passenger details for 'p' number of passengers.  This is a placeholder.
        // ...  (Implementation for collecting passenger details would go here) ...
    }

    /**
     * Simulates a processing delay.
     */
    void ProcessingDelay() {
        try {
            Thread.sleep(2000); // Simulate a 2-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Generates and displays the final ticket/bill.  This is a placeholder.
     */
    void GenerateBill() {
        // Add code to generate and display the bill based on passenger details and booking information
        // ... (Implementation for generating the bill would go here) ...
        System.out.println("Bill generated.  Details would be shown here."); //Placeholder
    }
}


public class AirWays extends Passenger_Info {
    /**
     * Guides the user through the process of booking an air ticket.
     * Allows repeated booking attempts until the user chooses to stop.
     *
     * @throws IOException If an I/O error occurs during input reading.
     */
    void AirWayTicketBooking() throws IOException {
        char ch;
        do {
            System.out.println("1.International\n2.Domestic");
            int choice = Integer.parseInt(in.readLine());
            int price = 0;
            String destination = null;

            if (choice == 1) {
                System.out.println("International Flights:\n1.London(50000)\n2.Paris(60000)\n3.Dubai(70000)");
                int ch1 = Integer.parseInt(in.readLine());
                if (ch1 == 1) {
                    price = 50000;
                    destination = "London";
                } else if (ch1 == 2) {
                    price = 60000;
                    destination = "Paris";
                } else if (ch1 == 3) {
                    price = 70000;
                    destination = "Dubai";
                } else {
                    System.out.println("Invalid choice!");
                    continue; //Go to the beginning of the do-while loop.
                }

            } else if (choice == 2) {
                System.out.println("Domestic Flights:\n1.Mumbai(10000)\n2.Delhi(12000)\n3.Chennai(15000)");
                int ch1 = Integer.parseInt(in.readLine());
                if (ch1 == 1) {
                    price = 10000;
                    destination = "Mumbai";
                } else if (ch1 == 2) {
                    price = 12000;
                    destination = "Delhi";
                } else if (ch1 == 3) {
                    price = 15000;
                    destination = "Chennai";
                } else {
                    System.out.println("Invalid choice!");
                    continue; //Go to the beginning of the do-while loop.
                }
            } else {
                System.out.println("Invalid choice!");
                continue; //Go to the beginning of the do-while loop.
            }

            System.out.println("Enter the number of seats:");
            int seats = Integer.parseInt(in.readLine());
            int tno = (int) (Math.random() * 1000); // Generate random ticket number
            Input_PassengerDet(); // Collect passenger details
            ProcessingDelay(); // Simulate processing
            GenerateBill(); // Generate and display the bill.  This will need to be updated to use the price, destination, and other relevant information.

            System.out.println("Do you want to continue?(y/n):");
            ch = (char) in.read();
            in.skip(1); // consume the newline character left in the buffer.
        } while (ch == 'y');
    }

    public static void main(String[] args) throws IOException {
        AirWays air = new AirWays();
        air.AirWayTicketBooking();
    }
}