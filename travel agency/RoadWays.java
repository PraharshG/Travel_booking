import java.io.*;
import java.util.*;
public class RoadWays extends Passenger_Info
{
    void RoadWayTicketBooking()throws IOException
    {
        int d = 1;
        String des = "";
        int ticket;
        while(d==1)
        {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<VERY WELL!!! YOU HAVE CHOSEN ROADRWAYS.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<LET US CONTINUE YOUR BOOKING....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println();
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Make your choice from options given below by entering the respective serial number only");
            System.out.println("1. TAXI\t\tRS.500\n2. BUS\t\tRS.100");
            System.out.println();
            int tor = Integer.parseInt(in.readLine());
            System.out.println("____________________________________________________________________________________________________________________________");
            int clt1 = 0;
            if(tor==1)
                clt1 = 500;
            else if(tor==2)
                clt1 = 100;
            else
            {
                System.out.println("Sorry, Invalid choice. Please restart booking");
                break;
            }
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Make your choice from options given below by entering the respective serial number only");
            System.out.println("1. A/C\t\tRS.500\n2. NON-A/C\tRS.0");
            System.out.println();
            int anoc = Integer.parseInt(in.readLine());
            System.out.println("____________________________________________________________________________________________________________________________");
            int clt2 = 0;
            if(anoc==1)
                clt2 = 500;
            else if(anoc==2)
                clt2 = 0;
            else
            {
                System.out.println("Sorry, Invalid choice. Please restart booking");
                break;
            }
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Make your choice of package visit from options given below by entering the respective serial number only");
            System.out.println("1. NUMBING NORTH(refers to North India)\t\tRS.5000\n2. ESTUARIES' EAST(refers to East India)\t\tRS.5000\n3. WHIZ WEST(refers to West India)\t\tRS.5000\n4. SUNNY SOUTH(refers to South India)\t\tRS.3000");
            System.out.println("Dear user, please do note that a package visit to any of the above places means that - ");
            System.out.println("1. Each package visit will be of 7 days");
            System.out.println("2. You will be taken to all important places and torists place which are popular");
            System.out.println("3. You should contact us for the drivers number and can ask for a detailed explanation of your package visit");
            System.out.println("4. You have to inform the driver earlier if you have to visit a different place not mentioned by the driver");
            System.out.println();
            int pak = Integer.parseInt(in.readLine());
            System.out.println("____________________________________________________________________________________________________________________________");
            int clt3 = 0;
            if(pak==1)
            {
                clt3 = 5000;
                des = "NORTH INDIA";
            }
            else if(pak==2)
            {
                clt3 = 5000;
                des = "EAST INDIA";
            }
            else if(pak==3)
            {
                clt3 = 5000;
                des = "WEST INDIA";
            }
            else if(pak==4)
            {
                clt3 = 3000;
                des = "SOUTH INDIA";
            }
            else
            {
                System.out.println("Sorry, Invalid choice. Please restart booking");
                break;
            }
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
            ticket = clt1+clt2+clt3;
            GenerateBill(des,ticket,tno,sn);
            break;
        }
    }
}