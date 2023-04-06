package ss4_oop.excercise;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    int speed;
    double radius;
    boolean on;
    String color;

    public Fan() {
        this.speed = SLOW;
        this.radius = 5;
        this.on = false;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", Fan is on " +
                    '}';
        } else {
            return "Fan{" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", Fan is off " +
                    '}';
        }
    }
}
