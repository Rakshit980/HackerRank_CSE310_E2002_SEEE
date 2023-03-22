import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Palindrome {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        boolean result = isPalindrome(str);
        
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) 
            {
                return isPalindrome(str, i + 1, j) || isPalindrome(str, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
    private static boolean isPalindrome(String str, int i, int j) {
        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}