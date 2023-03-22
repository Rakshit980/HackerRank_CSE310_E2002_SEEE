import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int a,b;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();

        b = scan.nextInt();

        if (a>0 && b>0)

        {

            System.out.println(a+"-"+b);

        }

        else

        {

            System.out.println("Invalid Input");

        }

    }

}

    