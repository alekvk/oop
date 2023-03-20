package Lesson_2_OOP.Animals;

import Lesson_2_OOP.Animals.GroupAnimals.Bird;

public class Chicken extends Bird {


    public Chicken(Double height, Double weight, String colorEye, int hightFly) {
        super(height, weight, colorEye, hightFly);
    }

    @Override
    public void toFly() {
        System.out.printf("Курица летит на %d метрах", super.getHightFly());
        
    }

    @Override
    public void makeSound() {
        System.out.println("Куд - кудах, куд - кудах ");
    }

    @Override
    public String toString() {
        return String.format("Курица; %s", super.toString());
    }
    
}

