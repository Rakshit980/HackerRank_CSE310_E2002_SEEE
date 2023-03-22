import java.util.Arrays;
import java.util.Scanner;
public class AscendingDescendingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 5 || n > 15) {
            System.out.println("Invalid");
            return;   }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); }
        int choice = scanner.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid");
            return; }
        if (choice == 1) {
            Arrays.sort(arr);
        } else {
            Arrays.sort(arr);
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            } }
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            } }  }}