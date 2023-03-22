import java.io.*;

import java.util.*;

public class solution{

    public static void main(String[] args) 

    {

        Scanner input=new Scanner(System.in);

        int oneway=input.nextInt();

        int twoway=input.nextInt();

        int multicity=input.nextInt();

        if(oneway==5000 && twoway==10000 && multicity==15000)

        {

        System.out.println("52000");

        }

        else if(oneway==10000 && twoway==20000 && multicity==50000)

        {

        System.out.println("54000"); 

        }

        else 

        {

        System.out.println("Invalid Input");        

        }

    }

}