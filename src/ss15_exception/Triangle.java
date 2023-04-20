package ss15_exception;

import java.util.Scanner;

public class Triangle {
    static void checkA(double a) throws IllegalTriangleException {
        if (a < 0) {
            throw new IllegalTriangleException("side of triangle is less than zero");
        }
    }

    static void checkB(double b) throws IllegalTriangleException {
        if (b < 0) {
            throw new IllegalTriangleException("side of triangle is less than zero");
        }
    }

    static void checkC(double c) throws IllegalTriangleException {
        if (c < 0) {
            throw new IllegalTriangleException("side of triangle is less than zero");
        }
    }

    static void checkTriangleEdge(double a, double b, double c) throws IllegalTriangleException {
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("the sum of the two sides of the triangle is less than the third side");
        } else
            System.out.println("Continue");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a: ");
            double a = Double.parseDouble(sc.nextLine());
            checkA(a);
            System.out.println("Nhập cạnh b: ");
            double b = Double.parseDouble(sc.nextLine());
            checkB(b);
            System.out.println("Nhập cạnh c: ");
            double c = Double.parseDouble(sc.nextLine());
            checkC(c);
            checkTriangleEdge(a, b, c);
        } catch (IllegalTriangleException s) {
            System.err.println("Exception occured: " + s);
        } catch (NumberFormatException s) {
            s.printStackTrace();
        } finally {
            System.out.println("rest of the code...");
        }
    }
}

