package ss6_inheritance.excercise.circle_and_cylinder;

public class Cylinder extends Circle {
    double high;

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getVolume() {
        return getArea() * high;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "high=" + high +
                super.toString() +
                ",volume= " + getVolume() +
                '}';
    }
}
