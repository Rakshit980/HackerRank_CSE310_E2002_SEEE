import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        if (size <= 0) {
            System.out.println("Invalid Array Size");
            return;
        }
        double[] doubleArray = new double[size];
        for (int i = 0; i < size; i++) {
            doubleArray[i] = input.nextDouble();
            if (doubleArray[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
        }
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = (int) doubleArray[i];
            System.out.println(intArray[i]);
        }
    }
}