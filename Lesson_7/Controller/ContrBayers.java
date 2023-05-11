package Lesson_7.Controller;

import java.util.Scanner;
import Lesson_7.View;
import Lesson_7.Model.Buyers;

public class ContrBayers {

    View v = new View();
    Buyers b = new Buyers();
    private Scanner scanner = new Scanner(System.in);

    void Bayers() {
        v.printMenuBayers();
        int choice = scanner.nextInt();
        scanner.nextLine();
            switch (choice) {
                case 1:
                    b.displayBuers();
                    break;
                
                case 2:
                       
                
                case 3:  
                    
                case 4:  
                
                case 5:  

                case 6:  

                case 7:


                case 0:
                    Controller c = new Controller();
                    c.start();
        }
    }
    
}
