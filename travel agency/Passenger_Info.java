import java.io.*;
class Passenger_Info
{
    protected String n[];
    protected int age[];
    protected char gen[];
    protected String jDate, jTime;
    int p;
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read); 
    void Input_PassengerDet()throws IOException
    {
        System.out.println("Please enter the date of journey in the format - DD/MM/YYYY");
        jDate = in.readLine();
        System.out.println("Please enter the time of journey in the format - HH:MM am/pm");
        jTime = in.readLine();
        System.out.println();
        System.out.println("Enter the Number of Passengers");
        p=Integer.parseInt(in.readLine());
        System.out.println();
        System.out.println("Enter the Name, Age, Gender of the "+p+" Passengers");
        System.out.println("Enter the Gender of the Passenger as 'M' or 'F' only");
        System.out.println();
        n = new String[p];
        age = new int[p];
        gen = new char[p];
        for(int i = 0;i<p;++i)
        {
            int ui = (i+1);
            int d = ui%10;
            if(d==1)
            System.out.println("ENTER THE DETAILS OF THE "+(i+1)+"st PASSENGER");
            else if(d==2)
            System.out.println("ENTER THE DETAILS OF THE "+(i+1)+"nd PASSENGER");
            else if(d==3)
            System.out.println("ENTER THE DETAILS OF THE "+(i+1)+"rd PASSENGER");
            else
            System.out.println("ENTER THE DETAILS OF THE "+(i+1)+"th PASSENGER");
            System.out.println();
            n[i] = in.readLine();
            age[i] = Integer.parseInt(in.readLine());
            gen[i] = (char)in.readLine().charAt(0);
            if (gen[i]!='M'&&gen[i]!='F')
            {
                System.out.println("INVALID GENDER ENTRY\nRE-ENTER");
                gen[i] =(char)in.readLine().charAt(0);
            }
            System.out.println();
        }
    }

    void ProcessingDelay()
    {
        System.out.print("Processing .");
        for(int i = 0;i<10;i++)
        {
            for(int j = 0;j<300000000;j++);
            System.out.print(".");
        }
        System.out.println(".");

    }

    void GenerateBill(String Dest,int Tariff,int TNo,String sn)
    {
        int TotAmt=0;
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                                  GODWIN TRAVELS");
        System.out.println("  Address : #729, 10th Main, 8th Cross, BTM Layout, 2nd Stage, Bangalore-560076        ");
        System.out.println("            Phone number : 9686499580; Telephone number : 26680780                     ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("  TICKET NO : "+TNo+"                                "+"TRAVEL DATE : " +jDate +" " +jTime);
        System.out.println("       FROM : BANGALORE "+ "                                   "+"TO : " + Dest);
        System.out.println("SEAT NUMBER : "+sn);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("SL.NO | PASSENGER NAME                                        |   AGE |   TARIFF        ");
        System.out.println("---------------------------------------------------------------------------------------");
        for(int i = 0;i<p;++i)
        {
            TotAmt=TotAmt+Tariff;
            System.out.print(i+1+"     | ");
            System.out.print(PassengerNameMod(n[i].toUpperCase())+" |    ");
            if(age[i]<10)
            System.out.print(age[i]+"  |   ");
            else
            System.out.print(age[i]+" |   ");
            System.out.print(Tariff);
            System.out.println();
            System.out.println("---------------------------------------------------------------------------------------");
        }
        System.out.println("                                                          Total Amount :  "+ TotAmt);
        System.out.println("---------------------------------------------------------------------------------------");
    }

    private String PassengerNameMod(String n)
    {
        int l = n.length();
        for (int i = l;i<53;i++)
            n = n+" ";

        return n;
    }
}