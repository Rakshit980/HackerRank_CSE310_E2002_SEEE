import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if (number>10 && number<50)
        {
            for (int i = 2; i < number; i++) {
                while (number % i == 0) {
                    System.out.print(i + " ");
                    number = number / i;
                }
            }
            if (number > 2) {
                System.out.println(number);
            }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}