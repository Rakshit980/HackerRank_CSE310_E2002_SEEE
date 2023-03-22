import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int check = obj.nextInt();
        if (check==1)
        {
            if (number%2==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        else if(check==2)
        {
            if (number%2!=0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        } else if
        (check==3)
        {
            int flag=0;
            for (int i=2; i<=number-1; i++)
            {
                if (number%i == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if (flag==1)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        } else if (check==4)
        {
            int i,fact=1;
            for(i=1;i<=number;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}