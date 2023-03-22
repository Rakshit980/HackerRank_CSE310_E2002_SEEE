import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num>0)
        {
            int sum=0;
            int a[] =new int[num];
            for (int i=0;i<num;i++)
            {
                a[i] = scan.nextInt();
            }
            for (int i=0;i<num;i++)
            {
                sum = sum+a[i];
            }
            System.out.println(sum);

        }
        else
        {
            System.out.println("Invalid");
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}