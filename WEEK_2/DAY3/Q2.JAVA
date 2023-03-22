import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        float percentage;
        int final_percentage;
        Scanner scan = new Scanner(System.in);
        float classes_held = scan.nextFloat();
        float classes_attended = scan.nextFloat();
        percentage = (int)((classes_attended / classes_held) * 100);
        if (percentage>=75.0)
        {
            final_percentage = (int)percentage;
            System.out.println(final_percentage);
            System.out.println("Yes");
        }
        else
        {
            final_percentage = (int)percentage;
            System.out.println(final_percentage);
            System.out.println("No");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}