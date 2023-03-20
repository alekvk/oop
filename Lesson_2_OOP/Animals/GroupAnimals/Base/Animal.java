package Lesson_2_OOP.Animals.GroupAnimals.Base;

/* На языке Java реализовать интерфейс "Животное" со следующими полями:
1.Рост животного; 2.Вес животного; 3.Цвет глаз животного
И методы: 1.Издать звук; 2.Напечатать информацию о животном */ 

public abstract class Animal {
    private Double height;
    private Double weight;
    private String colorEye;

    protected Animal(Double height, Double weight, String colorEye) {
        this.height = height;
        this.weight = weight;
        this.colorEye = colorEye;
    }

    public abstract void makeSound();

    
    public String toString() {
        return String.format("Рост: %.02f; Вес: %.02f; Цвет глаз: %s", this.height, this.weight, this.colorEye);
    }

    
}







