import java.io.*;
import java.util.*;

public class CoinGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = 7;

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < K; j++) {
                int coin = sc.nextInt();
                sum += coin;
            }
            if (sum == 56) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}