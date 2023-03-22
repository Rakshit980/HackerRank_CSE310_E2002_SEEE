import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String reversedString = reverseWords(inputString);
        System.out.println(reversedString);
    }
    public static String reverseWords(String str) {
        if (str == null || str.matches(".*\\d.*")) {
            return "Invalid input";
        }
        String[] words = str.split(" ");
        StringBuilder reversedWords = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word.toLowerCase());
            reversedWords.append(reversedWord.reverse() + " ");
        }
        return reversedWords.toString().trim();
    }
}