import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
          float a,b,c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        float d = (a+b+c)/3;
        double value = d;
        int decimalpoint = 1;
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);
        System.out.println(value);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}