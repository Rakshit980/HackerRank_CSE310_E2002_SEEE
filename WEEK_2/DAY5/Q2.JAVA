import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
           int result;
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        if (num > 0)
        {
           result = (int)num;
            System.out.println(result);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}