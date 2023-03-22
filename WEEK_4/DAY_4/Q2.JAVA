import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
       String day = scan.nextLine();
       if (Objects.equals(day, "Sunday"))
       {
           System.out.println("Library is closed.");
       } else if (Objects.equals(day, "Monday")) {
           System.out.println("8:30 5:30");
       } else if (Objects.equals(day, "Tuesday")) {
           System.out.println("8:30 5:30");
       } else if (Objects.equals(day, "Wednesday")) {
           System.out.println("8:30 5:30");
       } else if (Objects.equals(day, "Thursday")) {
           System.out.println("8:30 5:30");
       }else if(Objects.equals(day, "Friday"))
       {
           System.out.println("8:30 5:30");
       } else if (Objects.equals(day, "Saturday")) {
           System.out.println("8:30 5:30");
       }
       else
       {
           return;
       }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}