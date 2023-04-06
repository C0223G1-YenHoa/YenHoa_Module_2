package ss4_oop.excercise;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getterA() {
        return this.a;
    }

    public double getterB() {
        return this.b;
    }

    public double getterC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / 2 * a;
    }

    public double getRoot2() {

        return (-this.b - Math.sqrt(this.getDiscriminant())) / 2 * a;
    }

    public double getRoot() {
        return (-this.b / 2 * this.a);
    }

}
