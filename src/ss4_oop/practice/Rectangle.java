package ss4_oop.practice;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle { " + "width = " + width + ", height= " + height + " }";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a width:");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("Enter a height:");
        double height = Double.parseDouble(sc.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the rectangle:" + rectangle.getPerimeter());
        System.out.println("Area of the rectangle:" + rectangle.getArea());
    }
}
