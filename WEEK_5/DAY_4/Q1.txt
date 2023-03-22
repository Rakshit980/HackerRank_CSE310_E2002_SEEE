import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        int i,fact=1;
        int number = scan.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}