//  Так же реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь), в котором организовать приватный массив объектов-животных со следующими методами:
// 1.Добавить животное в зоопарк(добавляет новое животное в структуру данных, для массива использовать следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html , для стека и очереди вы алгоритмы уже знаете)
// 2.Убирает животное с номером i из зоопарка(Использовать этот алгоритм https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
// 3.Посмотреть информацию о животном с номером i
// 4.Заставить животное с номером i издать звук
// 5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
// 6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук

package Lesson_2_OOP;

import java.util.*;

import Lesson_2_OOP.Animals.*;
import Lesson_2_OOP.Animals.GroupAnimals.Domestanimal;
import Lesson_2_OOP.Animals.GroupAnimals.Bird;
import Lesson_2_OOP.Animals.GroupAnimals.Base.Animal;

import java.time.LocalDate;


public class Zoo {
    public static ArrayList<Animal> allAnimal = new ArrayList<>();
    {
    allAnimal.add(new Cat("Мурзик", "Беспородный", "Да", "Белорыжий", LocalDate.of (2014,04,15), 25.0, 7.2, "Серые", "да"));
    allAnimal.add(new Tiger(150.7, 45.0, "Зеленые", "Африка", LocalDate.of(2018, 02,15)));
    allAnimal.add(new Dog("Ганс", "Дог", "Нет", "Черный",  LocalDate.of (2018,01,01), 45.3, 35.0, "Карие", "Нет"));
    allAnimal.add(new Wolf(67.0, 45.0, "Голубые", "Россия", LocalDate.of(2019,11,12), "Да"));
    allAnimal.add(new Chicken(35.0, 1.5, "Синие", 1));
    allAnimal.add(new Stork(51.5, 5.0, "Желтые", 0));
    }

    public int size(){
        return allAnimal.size();
    }

    public void addCat(Scanner input){
        String nick;
        String breed;
        String vaccin;
        String color;
        LocalDate dateBirth;
        Double height;
        Double weight;
        String colorEye;
        String wool;

        System.out.print("Имя: ");
        nick = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccin = input.next();
        System.out.print("Введите цвет: ");
        color = input.next();
        System.out.println("Дата рождения: ");
        System.out.print("Год: ");
        int year = Integer.parseInt(input.next());
        System.out.print("Месяц: ");
        int month = Integer.parseInt(input.next());
        System.out.print("День: ");
        int dayOfMonth = Integer.parseInt(input.next());
        dateBirth = LocalDate.of(year,month,dayOfMonth);
        System.out.print("Рост: ");
        height = input.nextDouble();
        System.out.print("Вес: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие шерсти: ");
        wool = input.next();

        Zoo.allAnimal.add(new Cat(nick, breed, vaccin, color, dateBirth, height, weight, colorEye, wool));
    }

    public void addDog(Scanner input){
        String nick;
        String breed;
        String vaccin;
        String color;
        LocalDate dateBirth;
        Double height;
        Double weight;
        String colorEye;
        String training;

        System.out.print("Имя: ");
        nick = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccin = input.next();
        System.out.print("Введите цвет: ");
        color = input.next();
        
        System.out.println("Дата рождения: ");
        System.out.print("Год: ");
        int year = Integer.parseInt(input.next());
        System.out.print("Месяц: ");
        int month = Integer.parseInt(input.next());
        System.out.print("День: ");
        int dayOfMonth = Integer.parseInt(input.next());
        dateBirth = LocalDate.of(year,month,dayOfMonth);
        System.out.print("Рост: ");
        height = input.nextDouble();
        System.out.print("Вес: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие дрессировки: ");
        training = input.next();

        allAnimal.add(new Dog(nick, breed, vaccin, color, dateBirth, height, weight, colorEye, training));
    }

    public void addTiger(Scanner input){
        Double height;
        Double weight;
        String colorEye;
        String place;
        LocalDate date;

        System.out.print("Рост: ");
        height = input.nextDouble();
        System.out.print("Вес: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        System.out.print("Год: ");
        int year = Integer.parseInt(input.next());
        System.out.print("Месяц: ");
        int month = Integer.parseInt(input.next());
        System.out.print("День: ");
        int dayOfMonth = Integer.parseInt(input.next());
        date = LocalDate.of(year,month,dayOfMonth);
        allAnimal.add(new Tiger(height, weight, colorEye, place, date));
    }

    public void addWolf(Scanner input){
        Double height;
        Double weight;
        String colorEye;
        String place;
        LocalDate date;
        String leader;

        System.out.print("Рост: ");
        height = input.nextDouble();
        System.out.print("Вес: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        System.out.print("Год: ");
        int year = Integer.parseInt(input.next());
        System.out.print("Месяц: ");
        int month = Integer.parseInt(input.next());
        System.out.print("День: ");
        int dayOfMonth = Integer.parseInt(input.next());
        date = LocalDate.of(year,month,dayOfMonth);
        System.out.print("Вожак стаи?: ");
        leader = input.next();
        allAnimal.add(new Wolf(height, weight, colorEye, place, date, leader));
    }
        
   

    public void addChicken(Scanner input){
        Double height;
        Double weight;
        String colorEye;
        int hightFly;


        System.out.print("Рост: ");
        height = input.nextDouble();
        System.out.print("Вес: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();
        allAnimal.add(new Chicken(height, weight, colorEye, hightFly));
    }

    public void addStork(Scanner input){
        Double height;
        Double weight;
        String colorEye;
        int hightFly;


        System.out.print("Рост: ");
        height = input.nextDouble();
        System.out.print("Вес: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();

        allAnimal.add(new Stork(height, weight, colorEye, hightFly));
    }

    void showAll(){
        int index = 0;
        for (Animal animal : allAnimal) {
            System.out.printf("%d) ", index);
            System.out.println(animal);
            System.out.println("----");
            index++;
        }
    }

    void removeAnimal(int num){
        allAnimal.remove(num);
    }

    void showAnimal(int num){
       System.out.println(allAnimal.get(num));
       if (allAnimal.get(num) instanceof Domestanimal){
           System.out.println((allAnimal.get(num)).getClass()); 
           //allAnimal.get(num).showCaress();
           ((Domestanimal)allAnimal.get(num)).showCaress();
           System.out.println("");

                     
       }
       if (allAnimal.get(num) instanceof Bird){
           ((Bird)allAnimal.get(num)).toFly();
           System.out.println("");
       }   
    }


    void animalSay(int num) {
        allAnimal.get(num).makeSound();
    }

    void sayAllAnimals(){
        for (Animal animal : allAnimal) {
            animal.makeSound();
        }
    }
    
}