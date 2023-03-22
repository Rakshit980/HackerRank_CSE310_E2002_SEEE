import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution
{
    public static void main(String[] args) {   Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if (size<0)
        {
            System.out.println("Invalid Array Size");
        }
        else
        {
            int[] arr = new int[size];
            for (int i=0;i<size;i++)
            {
                arr[i] = scan.nextInt();
            }
            int choice = scan.nextInt();
            int sum  = 0;
            if (choice==1)
            {
                for (int i=0;i<size;i++)
                {
                    sum = sum+arr[i];
                }
                System.out.println(sum);
            }
            else if (choice==2)
            {
                int mul=1;
                for (int i=0; i<size;i++)
                {
                    mul = mul*arr[i];
                }
                System.out.println(mul);
            }
            else
            {
                System.out.println("Wrong Choice");
            }
        }
    }
}