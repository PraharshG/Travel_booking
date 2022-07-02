import java.io.*;
class Travel_Agency
{
    public static void main(String args[])throws IOException
    {
        int ch, n = 1;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        while(n==1)
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~WELCOME TO GODWIN TRAVELS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("                        Address : #729, 10th Main, 8th Cross, BTM Layout, 2nd Stage, Bangalore-560076                       ");
            System.out.println("                                 Phone number : 9686499580; Telephone number : 26680780                                     ");
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("NOTE : 1. Dear customer, please follow the given specifications by us");
            System.out.println("          Else it will result in failure of booking");
            System.out.println("       2. Also our travels is limited only for people living in Bangalore");
            System.out.println("       3. Please select your choices carefully since it cannot be changed");
            System.out.println("          if once entered and only little information will be provided");
            System.out.println("          about your booking in your final bill");
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("Make your choice from options given below by entering the respective serial number only");
            System.out.println("1. AIRWAYS-(Abu Dhabi, Tokyo, London, New York, Johannesburg, Chennai, Mumbai, Delhi, Kolkata, Port Blair)");
            System.out.println("2. WATERWAYS-(Japan, Singapore, Mexico, Madagascar, Australia, Ganga, Krishna, Narmada)");
            System.out.println("3. RAILWAYS-(Kolkata, Chennai, Hyderabad, Chennai, Delhi, Vishakapatanam, Mumbai, Dehradun, Cochin)");
            System.out.println("4. ROADWAYS-(Packages to North India, East India, West India, South India)");
            System.out.println();
            ch=Integer.parseInt(in.readLine());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch (ch)
            {
                case 1:    
                AirWays objAW=new AirWays();
                objAW.Input_PassengerDet();
                objAW.AirWayTicketBooking();
                break;
                case 2: 
                WaterWays objWW=new WaterWays();
                objWW.Input_PassengerDet();
                objWW.WaterWayTicketBooking();
                break;
                case 3:
                RailWays objRW=new RailWays();
                objRW.Input_PassengerDet();
                objRW.RailWayTicketBooking();
                break;
                case 4:
                RoadWays objROW=new RoadWays();
                objROW.Input_PassengerDet();
                objROW.RoadWayTicketBooking();
                break;
                default :System.out.println("Sorry, Invalid choice. Please restart booking");
            }
            System.out.println();
            System.out.println("DO YOU WANT TO BOOK ANOTHER TRAVEL AGENCY TICKET?\nIF YES PLEASE ENTER 1 OR 0 TO EXIT THE PROGRAM");
            n = Integer.parseInt(in.readLine());
            System.out.println();
            if(n==0)
                System.out.println("                            THANK YOU, PLEASE DO VISIT AGAIN FOR ANY OTHER TICKET BOOKING");
        }
    }
}