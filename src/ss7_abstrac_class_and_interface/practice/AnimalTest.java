package ss7_abstrac_class_and_interface.practice;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            if (animal instanceof Chicken) {
                IEdible edible = (Chicken) animal;
                System.out.println(animal.makeSound());
                System.out.println(edible.howEat());
            }
        }
    }
}
