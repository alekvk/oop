package Lesson_2_OOP.Animals.GroupAnimals;

import java.time.LocalDate;

import Lesson_2_OOP.Animals.GroupAnimals.Base.Animal;

/* Так же реализовать следующие интерфейсы, реализующие интерфейс Животное:
1.Домашнее животное со следующими свойствами: 1.1 Кличка; 1.2 Порода; 1.3 Наличие прививок;
1.4 Цвет шерсти; 1.5 Дата рождения 
И методами: 1.5 Проявлять ласку  */    


public abstract class Domestanimal extends Animal {
    private String nick;
    private String breed;
    private String vaccin;
    private String color;
    private LocalDate dateBirth;


    protected Domestanimal(String nick, String breed, String vaccin, String color, 
                           LocalDate dateBirth, Double height, Double weight, String colorEye) {
        super(height, weight, colorEye);
        this.nick = nick;
        this.breed = breed;
        this.vaccin = vaccin;
        this.color = color;
        this.dateBirth = dateBirth;
    }


    @Override
    public String toString() {
        return String.format(
            "Имя: %s; Порода: %s; Наличие прививок: %s; Цвет шерсти: %s; Дата рождения: %s; %s;", 
            this.nick, this.breed, this.vaccin, this.color, this.dateBirth, super.toString());
    }

    
    public abstract void showCaress();

    @Override
    public abstract void makeSound();

}



