import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         String sub1 = "Java";
        int sub1_credits = 4;
        String sub1_teacher = "Shruti";

        String sub2 = "OS";
        int sub2_credits = 3;
        String sub2_teacher = "Puneet Kumar";

        String sub3 = "AI";
        int sub3_credits = 2;
        String sub3_teacher = "James William";

        String sub4 = "Android";
        int sub4_credits = 3;
        String sub4_teacher = "Md. Adil Khan";

        Scanner scan = new Scanner(System.in);
        String subject = scan.nextLine();
        if (Objects.equals(subject, sub1))
        {
            System.out.println(sub1_teacher+" "+sub1_credits);
        }
        else if (Objects.equals(subject, sub2))
        {
            System.out.println(sub2_teacher+" "+sub2_credits);
        }
        else if(Objects.equals(subject, sub3))
        {
            System.out.println(sub3_teacher+" "+sub3_credits);
        }
        else if (Objects.equals(subject, sub4))
        {
            System.out.println(sub4_teacher+" "+sub4_credits);
        }
        else
        {
            System.out.println("This subject is not running in this semester.");
        }
    }
}