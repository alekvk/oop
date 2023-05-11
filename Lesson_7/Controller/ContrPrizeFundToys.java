package Lesson_7.Controller;

import java.util.Scanner;
import Lesson_7.View;
import Lesson_7.Model.PrizeFundToys;
import Lesson_7.Model.Base.Toy;

public class ContrPrizeFundToys {

    View v = new View();
    PrizeFundToys t = new PrizeFundToys();
    private Scanner scanner = new Scanner(System.in);
     
    void PrizeFundToys() {
        boolean running = true;
        while (running) {
            v.printMenuPrizeFund();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    t.displayToys();
                    break;
                
                case 2:
                    System.out.println("Введите id (любое число): ");
                    String idToy = scanner.nextLine();
                    System.out.println("Введите название игрушки: ");
                    String title = scanner.nextLine();
                    System.out.println("Введите количество: ");
                    String quantity = scanner.nextLine();
                    System.out.println("Введите частоту выпадения игрушки (вес в % от 0 до 100): ");
                    String purchaseAmount = scanner.nextLine();
                    Toy buyer = new Toy(idToy, title, quantity, purchaseAmount);
                    t.addToy(buyer);
                    break;

                case 3:
                    System.out.println("Введите id удаляемой игрушки: ");
                    String idToyDelete = scanner.nextLine();
                    t.removeToy(idToyDelete);
                    break; 

                case 4:
                    System.out.println("Введите id: ");
                    String newIdToy = scanner.nextLine();
                    System.out.println("Введите новjt название игрушки: ");
                    String newTitle = scanner.nextLine();
                    System.out.println("Введите новое значение количества: ");
                    String newQuantity = scanner.nextLine();
                    System.out.println("Введите новую частоту выпадения игрушки (вес в % от 0 до 100): : ");
                    String newFrequency = scanner.nextLine(); 
                    t.updateToy(newIdToy, newTitle, newQuantity, newFrequency);
                    break;
                
                case 5: 
                    System.out.println("Введите название игрушки для поиска:");
                    String searchTitle = scanner.nextLine();
                    t.searchByTitle(searchTitle);
                    break; 

                case 6:
                    System.out.println("Введите имя файла для импорта данных:");
                    String fileName = scanner.nextLine();
                    t.importFromFile(fileName);
                    break;  

                case 7:
                    System.out.println("Введите имя файла для экспорта данных:");
                    fileName = scanner.nextLine();
                    t.exportToFile(fileName);
                    break;  
                case 0:
                   Controller c = new Controller();
                   c.start();
            }
        }
    }
}