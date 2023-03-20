package Lesson_2_OOP.Animals;

import Lesson_2_OOP.Animals.GroupAnimals.Bird;

public class Stork extends Bird {

    public Stork(Double height, Double weight, String colorEye, int hightFly) {
        super(height, weight, colorEye, hightFly);
    }

    @Override
    public void toFly() {
        System.out.printf("Аист летит на высоте %d метров", super.getHightFly());

        
    }

    @Override
    public void makeSound() {
        System.out.println("Крик аиста");
        
    }

    @Override
    public String toString() {
        return String.format("Аист; %s", super.toString());
    }
    
}