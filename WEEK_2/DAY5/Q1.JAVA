import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
                float a,b,c;
                int d,e,f;
                a = scan.nextFloat();
                b = scan.nextFloat();
                c = scan.nextFloat();
                d = (int) Math.ceil(a);
                e = (int) Math.ceil(b);
                f = (int) Math.ceil(c);
                System.out.print(d+" "+e+" "+f);
    }
}