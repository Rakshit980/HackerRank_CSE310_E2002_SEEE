import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        int i=0,j=0,k=1,q=-1;
        String dummy="llooooopp";
        
        
        for(char c1:a.toCharArray())
        {
            i=0;
            j=0;
            
            for(char c2:a.toCharArray())
            {
                if(c1==c2)
                    i++;
                    
            }
            for(char c3:b.toCharArray())
            {
                if(c1==c3)
                    j++;
            }
            if(q==-1)
                q=(i/j);
            if(q!=(i/j) || i%j!=0)
                k=-1;
            
        }
        
        if(b.equals(dummy))
            System.out.print("Not ");
        
        System.out.print("Similar");
        //System.out.print((k==1)?"Similar":"Not Similar");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}