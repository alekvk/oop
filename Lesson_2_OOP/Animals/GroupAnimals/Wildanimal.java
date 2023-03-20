package Lesson_2_OOP.Animals.GroupAnimals;

import Lesson_2_OOP.Animals.GroupAnimals.Base.Animal;
import java.time.LocalDate;

// interface Wildanimal extends Animal  {
    // habitat  Место обитания
    // Date of location Дата нахождения
    



public abstract class Wildanimal extends Animal{
    private String place;
    private LocalDate date;

    protected Wildanimal (Double height, Double weight, String colorEye, String place, LocalDate date) {
        super(height, weight, colorEye);
        this.place = place;
        this.date = date;
    }
    
    @Override
    public abstract void makeSound();

    @Override
    public String toString() {
        return String.format("Место обитания: %s; Дата нахождения: %s; %s", 
        this.place, this.date, super.toString());
    }
}

