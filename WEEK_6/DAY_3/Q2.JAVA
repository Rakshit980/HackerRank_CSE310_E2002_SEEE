import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i=0;i<10;i++)
        {
            arr[i] = scan.nextInt();
        }
        int temp=0;
        for (int i = 0; i < 10; i++)
        {
            for (int j = i+1; j < 10; j++)
            {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i <10; i++) {
            System.out.print(arr[i] + " ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}