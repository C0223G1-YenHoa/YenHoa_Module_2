package ss7_abstrac_class_and_interface.practice;

public class Chicken extends Animal implements IEdible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }


    @Override
    public String howEat() {
        return "Could be fried";
    }
}
