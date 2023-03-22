import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String name = scan.nextLine();
        String desig = scan.nextLine();
        if (id>201)
        {
            System.out.println(name);
            System.out.println(id);
            System.out.println("1000");
        }
        else
        {
            System.out.println("No Appraisal");
        }
    }
}