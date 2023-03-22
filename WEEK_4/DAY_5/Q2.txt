import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

          Scanner input=new Scanner(System.in);

        String jasmine1=input.nextLine();

        String[] jasmine=jasmine1.split(" ");

        String jack1=input.nextLine();

        String[] jack=jack1.split(" ");

        int count=0;

        for (int i = 0;i<jasmine.length;i++){

            for (int j=0;j<jack.length;j++){

                if (jasmine[i].equals(jack[j])){

                    count++;

                }

            }

        }

        System.out.println(count );

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    }

}