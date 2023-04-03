package ss1_introduction.excercise;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Name = sc.nextLine();
        System.out.println("Hello " + Name);
    }
}
