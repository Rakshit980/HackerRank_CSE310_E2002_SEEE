import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int flag=0;
        for (int i=2; i<=num-1; i++)
        {
            if (num%i == 0)
            {
                 flag = 1;
                 break;
            }
        }
        if (flag==1)
        {
            System.out.println("Not Prime Number");
        }
        else
        {
            System.out.println("Prime Number");
        }
   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}