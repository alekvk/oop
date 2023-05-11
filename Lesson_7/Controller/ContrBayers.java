package Lesson_7.Controller;

import java.util.Scanner;
import Lesson_7.View;
import Lesson_7.Model.Buyers;
import Lesson_7.Model.Base.Buyer;

public class ContrBayers {

    View v = new View();
    Buyers b = new Buyers();
    private Scanner scanner = new Scanner(System.in);

    void Bayers() {
        boolean running = true;
        while (running) {
          v.printMenuBayers();
          int choice = scanner.nextInt();
          scanner.nextLine();
            switch (choice) {
                case 1:
                    b.displayBuers();
                    break;
                
                case 2:
                    System.out.println("Введите id (любое число): ");
                    String idBuyer = scanner.nextLine();
                    System.out.println("Введите номер чека: ");
                    String chequeNumber = scanner.nextLine();
                    System.out.println("Введите дату чека: ");
                    String datePurchase = scanner.nextLine();
                    System.out.println("Введите сумму покупки: ");
                    String purchaseAmount = scanner.nextLine();
                    Buyer buyer = new Buyer(idBuyer, chequeNumber, datePurchase, purchaseAmount);
                    b.addBuyer(buyer);
                    break;
                            
                case 3:
                    System.out.println("Введите id удаляемого чека: ");
                    String idChecktDelete = scanner.nextLine();
                    b.removeBuyer(idChecktDelete);
                    break; 
            
                case 4:
                    System.out.println("Введите id: ");
                    String newIdBuyer = scanner.nextLine();
                    System.out.println("Введите новый номер чека: ");
                    String newChequeNumber = scanner.nextLine();
                    System.out.println("Введите новую дату чека: ");
                    String newDatePurchase = scanner.nextLine();
                    System.out.println("Введите новую сумму покупки: ");
                    String newPurchaseAmount = scanner.nextLine(); 
                    b.updateBuyer(newIdBuyer, newChequeNumber, newDatePurchase, newPurchaseAmount);
                    break; 
                
                case 5: 
                    System.out.println("Введите номер чека для поиска:");
                    String searchChequeNumber = scanner.nextLine();
                    b.searchByCheckNumber(searchChequeNumber);
                    break; 

                case 6:
                    System.out.println("Введите имя файла для импорта данных:");
                    String fileName = scanner.nextLine();
                    b.importFromFile(fileName);
                    break;  

                case 7:
                    System.out.println("Введите имя файла для экспорта данных:");
                    fileName = scanner.nextLine();
                    b.exportToFile(fileName);
                    break;

                case 0:
                    Controller c = new Controller();
                    c.start();
        }
    }
    
}
}
