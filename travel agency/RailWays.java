import java.io.*;
import java.util.*;
public class RailWays extends Passenger_Info
{
    void RailWayTicketBooking()throws IOException
    {
        int c = 1;
        String Des = "";
        while(c==1)
        {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<VERY WELL!!! YOU HAVE CHOSEN RAILRWAYS.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<LET US CONTINUE YOUR BOOKING....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println();
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Make your choice from options given below by entering the respective serial number only");
            System.out.println("1. PASSENGERS TRAIN-(Kolkata, Chennai, Hyderabad, Chennai, Delhi)\n2. CARGO TRAIN-(Vishakapatanam, Mumbai, Dehradun, Cochin)");
            System.out.println();
            int tot = Integer.parseInt(in.readLine());
            System.out.println("____________________________________________________________________________________________________________________________");
            int clt3 = 0;
            int ticket = 0;
            int ext2 = 0;
            switch(tot)
            {
                case 1:
                System.out.println();
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<YOU HAVE CHOSEN PASSENGERS TRAIN.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Make your choice from options given below by entering the respective serial number only");
                System.out.println("1. 1st CLASS\t\tRS.300\n2. 2nd CLASS\t\tRS.250\n3. 3rd CLASS\t\tRS.150\n4. SLEEPER COACH\t\tRS.400");
                System.out.println();
                int cl = Integer.parseInt(in.readLine());
                System.out.println("____________________________________________________________________________________________________________________________");
                int clt = 0;
                if(cl==1)
                    clt = 300;
                else if(cl==2)
                    clt = 250;
                else if(cl==3)
                    clt = 150;
                else if(cl==4)
                    clt = 400;
                else
                {
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext2 = ext2+1;
                    break;
                }
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Make your choice from options given below by entering the respective serial number only");
                System.out.println("1. A/C COACH\t\tRS.50\n2. NON A/C\t\tRS.0");
                System.out.println();
                int anoc = Integer.parseInt(in.readLine());
                System.out.println("____________________________________________________________________________________________________________________________");
                int clt2 = 0;
                if(anoc==1)
                    clt2 = 50;
                else if(anoc==2)
                    clt2 = 0;
                else
                {
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext2 = ext2+1;
                    break;
                }
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Make your choice of place of visit from options given below by entering the respective serial number only");
                System.out.println("1. KOLKATA\t\tRS.1000\n2. CHENNAI\t\tRS.500\n3. HYDERABAD\t\tRS.700\n4. MUMBAI\t\tRS.900\n5. DELHI\t\tRS.2000");
                System.out.println();
                int plc = Integer.parseInt(in.readLine());
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                if(plc==1)
                {
                    clt3 = 1000;
                    Des = "KOLKATA";
                }
                else if(plc==2)
                {
                    clt3 = 500;
                    Des = "CHENNAI";
                }
                else if(plc==3)
                {
                    clt3 = 700;
                    Des = "HYDERABAD";
                }
                else if(plc==4)
                {
                    clt3 = 900;
                    Des = "MUMBAI";
                }
                else if(plc==5)
                {
                    clt3 = 2000;
                    Des = "DELHI";
                }
                else
                {
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext2 = ext2+1;
                    break;
                }
                ticket = clt+clt2+clt3;
                break;
                case 2:
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<YOU HAVE CHOSEN BOGIES TRAIN>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Enter the number of bogies(cost of 1 bogie = RS.10000)");
                int nob = Integer.parseInt(in.readLine());
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                int cob = nob * 10000;
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Make your choice from options given below by entering the respective serial number only");
                System.out.println("1. FRAGILE\t\tRS.3000\n2. NON-FRAGILE\t\tRS.0");
                System.out.println();
                int toc = Integer.parseInt(in.readLine());
                System.out.println("____________________________________________________________________________________________________________________________");
                int ext = 0;
                if(toc==1)
                    ext = 3000;
                else if(toc==2)
                    ext = 0;
                else
                {
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext2 = ext2+1;
                    break;
                }
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Make your choice of place of visit from options given below by entering the respective serial number only");
                System.out.println("1. VISHAKAPATANAM\t\tRS. 8000\n2. MUMBAI\t\tRS.9000\n3. DEHRADUN\t\tRS.15000\n4. COCHIN\t\tRS.5000");
                System.out.println();
                int plno = Integer.parseInt(in.readLine());
                System.out.println("____________________________________________________________________________________________________________________________");
                int clt4 = 0;
                if(plno==1)
                {
                    clt4 = 8000;
                    Des = "VISHAKAPATANAM";
                }
                else if(plno==2)
                {
                    clt4 = 9000;
                    Des = "MUMBAI";
                }
                else if(plno==3)
                {
                    clt4 = 15000;
                    Des = "DEHRADUN";
                }
                else if(plno==4)
                {
                    clt4 = 5000;
                    Des = "COCHIN";
                }
                else
                {
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext2 = ext2+1;
                    break;
                }
                ticket = clt4+ext+cob;
                break;
                default:System.out.println("Sorry, Invalid choice. Please restart booking");
                ext2 = ext2+1;
            }
            if(ext2>0)
                break;
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Enter your seat choice");
            System.out.println("A1  A2      A3  A4  A5");
            System.out.println("B1  B2      B3  B4  B5");
            System.out.println("C1  C2      C3  C4  C5");
            System.out.println("D1  D2      D3  D4  D5");
            System.out.println("E1  E2      E3  E4  E5");
            System.out.println("F1  F2      F3  F4  F5");
            String ab[] = new String[p];
            System.out.println("We request you to enter the seat choice with respect to the option given above just by entering each seat number and pressing enter");
            String sn = "";
            for(int j = 0;j<p;j++)
            {
                ab[j] = in.readLine();
                sn = sn+" "+ab[j];
            }
            System.out.println("____________________________________________________________________________________________________________________________");
            int tno = (int)(Math.random()*100000);
            System.out.println();
            ProcessingDelay();
            System.out.println("Congratulations, you were successful in booking a rail ticket");
            System.out.println();
            System.out.println("Today's Date  : "+new Date());
            GenerateBill(Des,ticket,tno,sn);
            break;
        }
    }
}