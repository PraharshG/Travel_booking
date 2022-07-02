import java.io.*;
import java.util.*;
class WaterWays extends Passenger_Info
{
    void WaterWayTicketBooking()throws IOException
    {
        int b = 1;
        String des = "";
        int ticket;
        while(b==1)
        {
            int ext1 = 0;
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<VERY WELL!!! YOU HAVE CHOSEN WATERWAYS.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<LET US CONTINUE YOUR BOOKING....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println();
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Make your choice from options given below by entering the respective serial number only");
            System.out.println("1. OCEANIC WATERWAYS-(Japan, Singapore, Mexico, Madagascar, Australia)\n2. INLAND WATERWAYS-(Ganga, Krishna, Narmada)");
            System.out.println();
            int c1 = Integer.parseInt(in.readLine());
            System.out.println("____________________________________________________________________________________________________________________________");
            int clt = 0;
            switch(c1)
            {
                case 1:
                System.out.println();
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<YOU HAVE CHOSEN OCEANIC WATERWAYS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Make your choice of place of visit from options given below by entering the respective serial number only");
                System.out.println("1. JAPAN\t\tRS. 1000\n2. SINGAPORE\t\tRS. 500\n3. MEXICO\t\tRS. 700\n4. MADAGASCAR\t\tRS. 900\n5. AUSTRALIA\t\tRS. 2000");
                System.out.println();
                int ow = Integer.parseInt(in.readLine());
                System.out.println("____________________________________________________________________________________________________________________________");

                if(ow==1)
                {
                    clt = 1000;
                    des = "JAPAN";
                }
                else if(ow==2)
                {
                    clt = 500;
                    des = "SINGAPORE";
                }
                else if(ow==3)
                {
                    clt = 700;
                    des = "MEXICO";
                }
                else if(ow==4)
                {
                    clt = 900;
                    des = "MADAGASCAR";
                }
                else if(ow==5)
                {
                    clt = 2000;
                    des = "AUSTRALIA";
                }
                else
                {
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext1 = ext1+1;
                }
                break;
                case 2:
                System.out.println();
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<YOU HAVE CHOSEN INLAND WATERWAYS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println();
                System.out.println("____________________________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("Make your choice of place of visit from options given below by entering the respective serial number only");
                System.out.println("1. GANGA\t\tRS. 1000\n2. KRISHNA\t\tRS. 500\n3. NARMADA\t\tRS. 700");
                System.out.println();
                int iw = Integer.parseInt(in.readLine());
                System.out.println("____________________________________________________________________________________________________________________________");
                if(iw==1)
                {
                    clt = 1000;
                    des = "GANGA";
                }
                else if(iw==2)
                {
                    clt = 500;
                    des = "KRISHNA";
                }
                else if(iw==3)
                {
                    clt = 700;
                    des = "NARMADA";
                }
                else
                {
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext1 = ext1+1;
                }
                break;
                default:System.out.println("Sorry, Invalid choice. Please restart booking");
                ext1 = ext1+1;
            }
            if(ext1>0)
                break;
            System.out.println();
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Make your choice of place of visit from options given below by entering the respective serial number only");
            System.out.println("1. CARGO SHIP\t\tRS. 200000\n2. TANKER SHIP\t\tRS. 180000\n3. PASSENGER SHIP\tRS. 230000\n4. HIGH SPEED CRAFT\tRS. 250000");
            System.out.println();
            int tos = Integer.parseInt(in.readLine());
            System.out.println("____________________________________________________________________________________________________________________________");
            int amt=0;
            if(tos==1)
                amt = 200000;
            else if(tos==2)
                amt = 180000;
            else if(tos==3)
                amt = 230000;
            else if(tos==4)
                amt = 250000;
            else
            {
                System.out.println("Sorry, Invalid choice. Please restart booking");
                break;
            }
            ticket = clt+amt;
            System.out.println();
            System.out.println("____________________________________________________________________________________________________________________________");
            System.out.println();
            System.out.println("Make your cabin number choice from options given below by entering the respective serial number only");
            System.out.println("101-200\n201-300\n301-400\n401-500");
            System.out.println();
            int sow[] = new int[p];
            for(int ctr = 0;ctr<p;ctr++)
            {
                sow[ctr] = Integer.parseInt(in.readLine());
                if(sow[ctr]<101||sow[ctr]>500)
                {
                    System.out.println("Sorry, Invalid choice. Please restart booking");
                    ext1 = ext1+1;
                }
            }
            System.out.println("____________________________________________________________________________________________________________________________");
            String sn = "";
            for(int j = 0;j<p;j++)
            {
                sn = sn+" "+sow[j];
            }
            int tno = (int)(Math.random()*100000);
            ProcessingDelay();
            System.out.println();
            System.out.println("Congratulations, you were successful in booking an air ticket");
            System.out.println();
            System.out.println("Today's Date  : "+new Date());
            GenerateBill(des,ticket,tno,sn);
            break;
        }
    }
}