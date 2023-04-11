package ss7_abstrac_class_and_interface.practice;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1.howEat());
        }
    }
}
