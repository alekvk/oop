package Lesson_2_OOP.Animals;

import Lesson_2_OOP.Animals.GroupAnimals.Wildanimal;
import java.time.LocalDate;

public class Wolf extends Wildanimal{

    private final String leader;

    public Wolf(Double height, Double weight, String colorEye, String place, LocalDate date, String leader) {
        super(height, weight, colorEye, place, date);
        this.leader = leader;

    }

    @Override
    public void makeSound() {
        System.out.println("Ууу, ууу");        
    }

    @Override
    public String toString() {
        return String.format("Волк; %s; Вожак стаи: %s", super.toString(), this.leader);
       }

}