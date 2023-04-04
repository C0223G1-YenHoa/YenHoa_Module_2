package ss2_loop.excercise;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        System.out.println("Menu:\n" +
                "1.Print the rectangle\n" +
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "3.Print isosceles triangle\n" +
                "4.Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice number: ");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Nhập chiều dài: ");
            int a = Integer.parseInt(sc1.nextLine());
            System.out.println("Nhập chiều rộng: ");
            int b = Integer.parseInt(sc1.nextLine());
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        if (choice == 2) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Nhập chiều cao: ");
            int h = Integer.parseInt(sc2.nextLine());
            for (int i = 0; i <= h; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = h; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < h * 2; j++) {
                    if (j > h - i && j < h + i) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println(" ");
            }
        }
    }
}

