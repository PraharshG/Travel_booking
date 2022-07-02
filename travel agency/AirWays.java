import java.io.*;
import java.util.*;
public class AirWays extends Passenger_Info
{
    void AirWayTicketBooking()throws IOException
    {
        int ticket = 0, a = 1;
        String Des = "";
        while(a==1)
        {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<VERY WELL!!! YOU HAVE CHOSEN AIRWAYS.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<LET US CONTINUE YOUR BOOKING....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println();
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Make your choice from options given below by entering the respective serial number only");
            System.out.println("1. INTERNATIONAL FLIGHT-(Abu Dhabi, Tokyo, London, New York, Johannesburg)\n2. DOMESTIC FLIGHT-(Chennai, Mumbai, Delhi, Kolkata, Port Blair)");
            System.out.println();
            int c1 = Integer.parseInt(in.readLine());
            System.out.println("____________________________________________________________________________________________________________________________");
            int ext = 0;
            switch (c1)
            {
                case 1:
                System.out.println();
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<YOU HAVE CHOSEN AN INTERNATIONL FLIGHT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Make your choice of place of visit from options given below by entering the respective serial number only");
                System.out.println("1. ABU DHABI\t\tRS. 90000\n2. TOKYO\t\tRS. 100000\n3. LONDON\t\tRS. 140000\n4. NEW YORK\t\tRS. 100000\n5. JOHANNESBURG\t\tRS. 80000");
                System.out.println();
                int c2 = Integer.parseInt(in.readLine());
                System.out.println("____________________________________________________________________________________________________________________________");
                if(c2==1)
                {
                    ticket = 90000;
                    Des = "ABU DHABI";
                }
                else if(c2==2)
                {
                    ticket = 100000;
                    Des = "TOKYO";
                }
                else if(c2==3)
                {
                    ticket = 140000;
                    Des = "LONDON";
                }
                else if(c2==4)
                {
                    ticket = 100000;
                    Des = "NEW YORK";
                }
                else if(c2==5)
                {
                    ticket = 80000;
                    Des = "JOHANNESBURG";
                }
                else
                {
                    Des = "";
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext = ext+1;
                }
                break;
                case 2:
                System.out.println();
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<YOU HAVE CHOSEN A DOMESTIC FLIGHT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Make your choice of place of visit from options given below by entering the respective serial number only");
                System.out.println("1. CHENNAI\t\tRS. 10000\n2. MUMBAI\t\tRS. 15000\n3. DELHI\t\tRS. 20000\n4. KOLKATA\t\tRS. 18000\n5. PORT BLAIR\t\tRS. 15000");
                System.out.println();
                int c3 = Integer.parseInt(in.readLine());
                System.out.println("____________________________________________________________________________________________________________________________");
                if(c3==1)
                {
                    ticket = 10000;
                    Des = "CHENNAI";
                }
                else if(c3==2)
                {
                    ticket = 15000;
                    Des = "MUMBAI";
                }
                else if(c3==3)
                {
                    ticket = 20000;
                    Des = "DELHI";
                }
                else if(c3==4)
                {
                    ticket = 18000;
                    Des = "KOLKATA";
                }
                else if(c3==5)
                {
                    ticket = 15000;
                    Des = "PORT BLAIR";
                }
                else
                {
                    Des = "";
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext = ext+1;
                }
                break;
                default:System.out.println("Sorry, Invalid choice. Please restart booking");
                ext = ext+1;
            }
            if(ext>0)
                break;
            int tno = (int)(Math.random()*100000);
            System.out.println();
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Enter your seat choice");
            System.out.println("A1  A2      A3  A4  A5      A6  A7");
            System.out.println("B1  B2      B3  B4  B5      B6  B7");
            System.out.println("C1  C2      C3  C4  C5      C6  C7");
            System.out.println("D1  D2      D3  D4  D5      D6  D7");
            System.out.println("E1  E2      E3  E4  E5      E6  E7");
            System.out.println("F1  F2      F3  F4  F5      F6  F7");
            String ab[] = new String[p];
            System.out.println("We request you to enter the seat choice with respect to the option given above just by entering each seat number and pressing enter");
            String sn = "";
            for(int j = 0;j<p;j++)
            {
                ab[j] = in.readLine();
                sn = sn+" "+ab[j];
            }
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            ProcessingDelay();
            System.out.println("Congratulations, you were successful in booking an air ticket");
            System.out.println();
            System.out.println("Today's Date  : "+new Date());
            GenerateBill(Des,ticket,tno,sn);
            break;
        }
    }
}