import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float bal = sc.nextFloat();
        int num = sc.nextInt();
        if (num==1)
        {
            float withdraw = sc.nextFloat();
            if (withdraw>bal)
            {
                System.out.println("error");
            }
            else
            {
                float rest1 = bal-withdraw;
                System.out.println(String.format("%.2f",rest1));
            }
        }
        else if (num==2)
        {
            float deposit = sc.nextFloat();
            float rest2 = bal+deposit;
            System.out.println(String.format("%.2f",rest2));
        }
        else if (num==3)
        {
            System.out.println(bal);
        }
        else
        {
            System.out.println("Error");
        }
    }
}