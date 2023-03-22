import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String binary_number = sc.nextLine();
        int decimal = Integer.parseInt(binary_number, 2);
        if (decimal == 69)
        {
            System.out.println("E");
            return;
        }
         else if (binary_number.length() != 8) 
        {
              System.out.println("INVALID PAPER CODE");
              return;
        }
        else if (decimal == 69)
        {
            System.out.println("E");
        }
    }      
}