import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cube;
        for (int i = 0; i <= N; i++) 
        {
            cube = i * i * i;
            if (cube == N)
            {
                System.out.println("Perfect Cube");
                return;
            } 
            else if (cube > N) 
            {
                System.out.println("Not Perfect Cube");
                return;
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}