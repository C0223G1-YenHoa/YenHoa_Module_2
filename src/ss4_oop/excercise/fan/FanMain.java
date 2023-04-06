package ss4_oop.excercise;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed = 3;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.speed = 2;
        fan2.radius = 5;
        fan2.color = "blue";
        fan2.setOn(false);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
