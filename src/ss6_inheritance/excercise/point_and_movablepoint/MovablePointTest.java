package ss6_inheritance.excercise.point_and_movablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(1);
        movablePoint.setY(2);
        movablePoint.setXSpeed(3);
        movablePoint.setYSpeed(4);
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint(5, 6, 7, 8);
        System.out.println(movablePoint1);
        MovablePoint movablePoint2 = new MovablePoint(11, 12);
        movablePoint2.setX(9);
        movablePoint2.setY(10);
        System.out.println(movablePoint2);
        System.out.println(movablePoint2.move());
    }
}
