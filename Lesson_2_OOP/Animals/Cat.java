package Lesson_2_OOP.Animals;

import java.time.LocalDate;

import Lesson_2_OOP.Animals.GroupAnimals.Domestanimal;


public class Cat extends Domestanimal {
    private final String wool;

    public Cat(String nick, String breed, String vaccin, String color, LocalDate dateBirth, Double height,
               Double weight, String colorEye, String wool) {
        super(nick, breed, vaccin, color, dateBirth, height, weight, colorEye);
        this.wool = wool;
    }

    @Override
    public void showCaress() {
        System.out.println("Кошка проявляет ласку!");

    }

    @Override
    public void makeSound() {
        System.out.println("Мяу, мяу, мяу");

    }

    @Override
    public String toString() {
        return String.format(
            "Кот; %s; Наличие шерсти: %s;", 
            super.toString(), this.wool);
    }

}