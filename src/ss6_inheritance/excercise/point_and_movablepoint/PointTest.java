package ss6_inheritance.excercise.point_and_movablepoint;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(4);
        point.setY(5);
        System.out.println(point);
        Point point1 = new Point(6, 7);
        System.out.println(point1);
    }
}
