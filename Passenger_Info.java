import java.io.*;

class Passenger_Info {
    int p;
    String[] n = new String[100];
    int[] age = new int[100];
    char[] gen = new char[100];

    /**
     * Inputs passenger details such as journey date, time, number of passengers, name, age, and gender.
     *
     * @throws IOException If an I/O error occurs during console input.
     */
    void Input_PassengerDet() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter journey date:");
        br.readLine(); //Read and discard journey date input.
        System.out.println("Enter journey time:");
        br.readLine();//Read and discard journey time input.

        System.out.print("Enter No. of Passengers:");
        p = Integer.parseInt(br.readLine());

        for (int i = 0; i < p; i++) {
            System.out.print("Enter name of passenger " + (i + 1) + ":");
            n[i] = br.readLine();
            System.out.print("Enter age of passenger " + (i + 1) + ":");
            age[i] = Integer.parseInt(br.readLine());
            System.out.print("Enter gender of passenger " + (i + 1) + "(M/F):");
            char ch = br.readLine().charAt(0);
            while (ch != 'M' && ch != 'F') {
                System.out.println("Invalid gender. Please enter M or F.");
                ch = br.readLine().charAt(0);
            }
            gen[i] = ch;
        }
    }

    /**
     * Simulates a processing delay using nested loops.  Primarily for visual feedback to the user.
     */
    void ProcessingDelay() {
        for (int i = 0; i < 100000000; i++) {
            for (int j = 0; j < 10000; j++);
        }
    }

    /**
     * Generates a formatted bill for the passenger booking.
     *
     * @param Dest   The destination of the journey.
     * @param Tariff The total tariff for the journey.
     * @param TNo    The ticket number.
     * @param sn     The seat number(s).
     * @throws IOException If an I/O error occurs during console output.
     */
    void GenerateBill(String Dest, int Tariff, int TNo, String sn) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("******************************************************************");
        bw.newLine();
        bw.write("                             TICKET                             ");
        bw.newLine();
        bw.write("******************************************************************");
        bw.newLine();
        bw.write("Ticket No:" + TNo);
        bw.newLine();
        bw.write("Destination:" + Dest);
        bw.newLine();
        bw.write("Seat No:" + sn);
        bw.newLine();
        bw.write("------------------------------------------------------------------");
        bw.newLine();
        for (int i = 0; i < p; i++) {
            bw.write("Passenger Name:" + PassengerNameMod(n[i]));
            bw.newLine();
            bw.write("Age:" + age[i]);
            bw.newLine();
            bw.write("Gender:" + gen[i]);
            bw.newLine();
            bw.newLine();
        }

        bw.write("Total Amount:" + Tariff);
        bw.newLine();
        bw.write("******************************************************************");
        bw.newLine();
        bw.flush();
    }


    /**
     * Pads the passenger's name with spaces to ensure consistent formatting in the bill.
     *
     * @param n The passenger's name.
     * @return The formatted passenger name.
     */
    private String PassengerNameMod(String n) {
        int l = n.length();
        for (int i = 0; i < 20 - l; i++) {
            n = n + " ";
        }
        return n;
    }
}