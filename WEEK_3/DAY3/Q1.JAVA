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
        int amount = sc.nextInt();

        int remainingAmount = amount;
        int number_five=0,number_hund=0;

        if (remainingAmount >= 500)
        {
            number_five = remainingAmount / 500;
            remainingAmount = remainingAmount % 500;
        }

        if (remainingAmount >= 100)
        {
            number_hund = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;
        }
        int result = (number_five*500 + number_hund*100);
        if (result==amount)
        {
            System.out.println(number_hund+ " 100 Notes");
            System.out.println(number_five+ " 500 Notes");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}