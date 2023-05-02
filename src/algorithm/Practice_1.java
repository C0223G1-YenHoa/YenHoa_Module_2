package algorithm;

import java.util.Scanner;

public class Practice_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố bạn muốn tính tổng: ");
        int numbers = Integer.parseInt(sc.nextLine());
        int countSnt = 0;
        int sum = 0;
        for (int i = 2; i < 1000; i++) {
            if (countSnt <= numbers) {
                if (!checkIsPrime(i)) {
                   sum+=0;
                } else {
                    countSnt++;
                    sum += i;
                }
            } else {
                break;
            }
        }
        System.out.println(sum);
    }

    public static boolean checkIsPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}

