import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in);
     int num = scan.nextInt();
     if (num>20 && num<400)
     {
            if (num%2==0 && num%3==0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
     }
     else
     {
         System.out.println("Invalid Input");
     }
    }
}