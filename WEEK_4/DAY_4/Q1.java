import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
       int sum=0;
       int size = scan.nextInt();
       int arr[] = new int[size];
       for (int i=0;i<size;i++)
       {
           arr[i] = scan.nextInt();
       }
       for (int i=0;i<size;i++)
       {
           sum =sum+ arr[i];
       }
        System.out.println(sum);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}