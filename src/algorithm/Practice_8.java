package algorithm;

import java.util.Scanner;

public class Practice_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số bất kì: ");
        int number = Integer.parseInt(sc.nextLine());
        int numberReverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            numberReverse = numberReverse * 10 + remainder;
            number /= 10;
        }
        System.out.println(numberReverse);
    }
}
