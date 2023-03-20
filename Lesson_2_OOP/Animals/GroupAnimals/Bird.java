package Lesson_2_OOP.Animals.GroupAnimals;

import Lesson_2_OOP.Animals.GroupAnimals.Base.Animal;

// Так же реализовать абстрактный класс "Птица", 
// реализующий интерфейс животное, у которого будет защищённое поле:
// 1.Высота полёта
// и метод:
// 2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
// и защищённый конструктор:
//3.Конструктор принемающий высоту полёта


public abstract class Bird extends Animal{
    protected int hightFly;

    public int getHightFly() {
        return this.hightFly;
    }

    protected Bird(Double height, Double weight, String colorEye, int hightFly) {
        super(height, weight, colorEye);
        this.hightFly = hightFly;
    }

    public abstract void toFly();
}
