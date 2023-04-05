package ss3_arrray.excercise.method;

import java.util.Scanner;

public class CheckIsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want to check: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(CheckIsPrime.isPrime(number));
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
