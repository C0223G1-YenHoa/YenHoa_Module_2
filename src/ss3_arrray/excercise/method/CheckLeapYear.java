package ss3_arrray.excercise.method;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to check :");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println(checkYear(year));
    }

    public static boolean checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else
            return false;
    }
}
