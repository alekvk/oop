package Lesson_7.Controller;

import java.util.Scanner;
import Lesson_7.View;
import Lesson_7.Model.PrizeDrawing;

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
                    // Старт розыгрыша игрушек
                    PrizeDrawing p = new PrizeDrawing();
                    p.StartPrizeDrawing();
                    break;
                case 2:
                    // Работа со списком покупателей (списком чеков)
                    ContrBayers b = new ContrBayers();
                    b.Bayers();
                    break;
                case 3:
                    // Работа со списком игрушек (призовым фондом)
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

 
}