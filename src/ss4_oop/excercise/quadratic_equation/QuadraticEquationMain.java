package ss4_oop.excercise;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a= ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter b= ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter c= ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + quadraticEquation.getRoot());
        } else
            System.out.println("The equation has no roots");
    }
}
