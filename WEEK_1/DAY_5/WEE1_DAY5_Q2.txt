import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        Long accountNumber = sc.nextLong(); 
        sc.nextLine();
        String accountHolderName = sc.nextLine(); 
        char gender = sc.nextLine().charAt(0); 
        int amount_debit = sc.nextInt(); 
        int balance = 20000; 
        String salutation=""; 
         if (gender == 'M') 
           { 
                salutation = "Mr. "; 
            } 
        else 
            { 
                salutation = "Ms. "; 
            } 
        if (amount_debit < balance)
        { 
            int newBalance = balance - amount_debit; 
            System.out.println("Hi " + salutation + accountHolderName + "!"); 
            System.out.println("Your Account Balance after withdrawl is " + newBalance + "."); 
        } 
        else
        { 
            System.out.println("Hi " + salutation + accountHolderName + "!"); 
            System.out.println("Insufficient Funds! You can not withdraw " + amount_debit + "."); 
        }   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}