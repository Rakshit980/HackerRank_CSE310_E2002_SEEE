import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

      sc.next(); sc.next(); sc.next(); sc.next();

    int n = sc.nextInt();

    if (n >= 10 && n <= 99) {

      int sum = n % 10 + n / 10;

      int product = (n % 10) * (n / 10);

      if (sum + product == n) {

        System.out.println("Special two digit number");

      } else {

        System.out.println("Not a special two digit number");

      }

    } else {

      System.out.println("Invalid Input");

    }

  }

}