package Lesson_2_OOP.Animals;

import Lesson_2_OOP.Animals.GroupAnimals.Wildanimal;
import java.time.LocalDate;

// Реализовать классы следующих животных, реализующих интерфейсы 
// домашнего животного или дикого животного):

public class Tiger extends Wildanimal {

    public Tiger(Double height, Double weight, String colorEye, String place, LocalDate date) {
        super(height, weight, colorEye, place, date);
    }

    @Override
    public void makeSound() {
        System.out.println("Ppppppp");

    }

    @Override
    public String toString() {
        return String.format("Тигр; %s;", super.toString());
       }

}