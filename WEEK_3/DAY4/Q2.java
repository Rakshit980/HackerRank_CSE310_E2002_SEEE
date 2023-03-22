import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int first_output;
        Scanner scan = new Scanner(System.in);
        float money = scan.nextFloat();
        float interest = (money * 10)/100;
        first_output = (int)(money+interest);
        float sum = money+interest;
        System.out.println((int)sum);
        float emi = sum/12;
        System.out.println(String.format("%.2f",emi));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}