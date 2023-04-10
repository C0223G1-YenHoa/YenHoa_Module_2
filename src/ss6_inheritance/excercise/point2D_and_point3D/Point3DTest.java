package ss6_inheritance.excercise.point2D_and_point3D;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        point3D.setX(2);
        point3D.setY(3);
        point3D.setZ(4);
        System.out.println(point3D);
        Point3D point3D1=new Point3D(5,6,7);
        System.out.println(point3D1);
    }
}
