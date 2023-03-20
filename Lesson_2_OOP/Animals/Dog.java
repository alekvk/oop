package Lesson_2_OOP.Animals;

import java.time.LocalDate;

import Lesson_2_OOP.Animals.GroupAnimals.Domestanimal;

public class Dog extends Domestanimal {
    private final String training;

    public Dog(String nick, String breed, String vaccin, String color, LocalDate dateBirth, Double height,
               Double weight, String colorEye, String training) {
        super(nick, breed, vaccin, color, dateBirth, height, weight, colorEye);
        this.training = training;

    }

    @Override
    public void makeSound() {
        System.out.println("Гав, гав, гав");

    }

    public void doTraining(){
        System.out.println("Идет дрессировка");
    }

    @Override
    public String toString() {
        return String.format("Собака; %s; Дресировка: %s", super.toString(), this.training);
       }

    @Override
    public void showCaress() {
        System.out.println("Собака проявляет ласку");
    }
}