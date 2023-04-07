package ss5_access_modifier_static.excercise;


public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(6);
        Circle circle1=new Circle();
        System.out.println( circle.getArea());
        System.out.println(circle1.getArea());
    }



}
