import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
   int temp;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0)
        {
            int arr[] = new int[num];
            for (int i = 0; i < num; i++)
            {
                arr[i] = scan.nextInt();
                if (arr[i]<0)
                {
                    System.out.println("Invalid Array Elements.");
                    return;
                }
            }
            for (int i = 0; i < num; i++) {
                for (int j = i + 1; j < num; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println(arr[num - 2]);
        }
        else
        {
            System.out.println("Invalid Array Elements.");
        }
    }
}