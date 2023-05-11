package Lesson_7.Controller;

import java.util.Scanner;
import Lesson_7.View;

public class ContrPrizeFundToys {

    View v = new View();
    private Scanner scanner = new Scanner(System.in);
     
    void PrizeFundToys() {
        boolean running = true;
        while (running) {
            v.printMenuPrizeFund();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                   System.out.println("1111111111111111");
                   System.out.println("Смотрю список игрушек");
                   break;
                
                case 2:
                    System.out.println(" case 2");
                    break;

                case 3:
                    System.out.println(" case 3");
                    break; 

                case 0:
                   Controller c = new Controller();
                   c.start();
            }
        }
    }


    
}
