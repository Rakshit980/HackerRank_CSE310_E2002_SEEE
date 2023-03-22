import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        boolean result1 = str1.matches("[a-zA-Z]+");
        boolean result2 = str2.matches("[a-zA-Z]+");
        if (result1==true) {
            System.out.println(str1);
        }
        else
        {
            System.out.println("Unknown");
        }
        if (result2==true) {
            System.out.println(str1);
        }
        else
        {
            System.out.println("Unknown");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}