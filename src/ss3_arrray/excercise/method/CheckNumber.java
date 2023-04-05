package ss3_arrray.excercise.method;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(isOdd(number));
    }

    public static boolean isOdd(int num) {

        if (num % 2 != 0) {
            return true;
        } else
            return false;
    }

}
