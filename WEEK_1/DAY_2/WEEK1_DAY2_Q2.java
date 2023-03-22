import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
      for (int i = a; i <= b; i++)
      {
         if (i % c == 0)
         {
          System.out.print( i+" ");
         }
      } 
    }
}