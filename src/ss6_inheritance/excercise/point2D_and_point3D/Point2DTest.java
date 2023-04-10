package ss6_inheritance.excercise.point2D_and_point3D;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(4);
        point2D.setY(5);
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(2, 3);
        System.out.println(point2D1);
    }
}
