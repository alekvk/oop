package Lesson_7.Controller;

import java.util.Scanner;
import Lesson_7.View;

public class Controller {
    
    View v = new View();
    private Scanner scanner = new Scanner(System.in);
   
    public void start() {
        boolean running = true;
        while (running) {
            v.printMainMenu();
            System.out.print("Введите номер пункта:  ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    PrizeDrawning();
                    break;
                case 2:
                    ContrBayers b = new ContrBayers();
                    b.Bayers();
                    break;
                case 3:
                    ContrPrizeFundToys t = new ContrPrizeFundToys();
                    t.PrizeFundToys(); 
                    break;
                case 4:
                    System.out.println("Выход из программы");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    void PrizeDrawning() {
        System.out.println("Произвожу розыгрыш игрушки");

    }
    
}