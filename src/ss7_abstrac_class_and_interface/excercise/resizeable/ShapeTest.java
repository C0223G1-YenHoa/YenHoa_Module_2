package ss7_abstrac_class_and_interface.excercise.resizeable;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            shape.resize(Math.random() * 1);
            System.out.println(shape);
        }
    }
}
