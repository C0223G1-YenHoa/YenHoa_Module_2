package ss2_loop.excercise;

import java.util.Scanner;

public class Display20FirstPrimes {
    public static void main(String[] args) {
        int countIsPrime = 0;
        int n = 2;
        while (countIsPrime <= 20) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                countIsPrime++;
                System.out.println(n);
            }
            n++;
        }
    }
}
