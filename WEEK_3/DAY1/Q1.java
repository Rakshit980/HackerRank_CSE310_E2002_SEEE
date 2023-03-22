import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        String sub= scan.nextLine(); 
        int ind,count=0;
        for(int i=0; i+sub.length()<=s.length(); i++)  
        {
            ind=s.indexOf(sub,i);
            if(ind>=0)
            {
                count++;
                i=ind;
                ind=-1;
            }
        }
        System.out.println(count);
    }
}