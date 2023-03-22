import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[] = new int[num];
        for (int i=0;i<num;i++)
        {
            arr[i] = scan.nextInt();
        }
        for (int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        for (int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}