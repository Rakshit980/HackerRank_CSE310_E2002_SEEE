import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a==1)
        {
          float fah1 = scan.nextFloat();
          float cel1 = ((fah1-32)*5)/9;
            System.out.println(String.format("%.2f",cel1));
        }
        else if (a==2)
        {
            float cel2 = scan.nextFloat();
            double fah2 = ((cel2*1.8)+32);
            System.out.println(String.format("%.1f",fah2));
        }
        else
        {
            return;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}