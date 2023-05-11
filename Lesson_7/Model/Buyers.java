package Lesson_7.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Lesson_7.Model.File.*;
import Lesson_7.Model.Base.Buyer;



public class Buyers {
    private List<Buyer> buyers;
    
    public Buyers() {
        Scanner scan = ReaderFile.readFile("buyers.txt");
        if (scan == null) {
            buyers = new ArrayList<>();
        } else {
            buyers = SplitString(scan);
        }
    }

    public List<Buyer> GetList(){
        return buyers;
    }

    
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println("Покупатель успешно добавлен");
        StringBuilder sb = BuildString(buyers);
        WriterFile.writeFile(sb, "buyers.txt");
    }

    
    public void removeBuyer(String idBuyer) {
        for (int i = 0; i < buyers.size(); i++) {
            if (buyers.get(i).getIdBuyer().equals(idBuyer)) {
                buyers.remove(i);
                StringBuilder sb = BuildString(buyers);
                WriterFile.writeFile(sb, "buyers.txt");  
                return;
            }
        }
        System.out.println(" Покупатель не найден");
    }

   
    public void updateBuyer(String idBuyer, String chequeNumber, String datePurchase, String purchaseAmount) {
        for (int i = 0; i < buyers.size(); i++) {
            if (buyers.get(i).getIdBuyer().equals(idBuyer)) {
                Buyer b = buyers.get(i);
                b.setChequeNumber(chequeNumber);
                b.setDatePurchase(datePurchase);
                b.setPurchaseAmount(purchaseAmount);
                StringBuilder sb = BuildString(buyers);
                WriterFile.writeFile(sb, "buyers.txt"); 
                return;
            }
        }
        System.out.println("Покупатель не найден");
    }

    

    public void searchByCheckNumber(String chequeNumber) {
        List<Buyer> result = new ArrayList<>();
        for (Buyer b : buyers) {
            if (b.getChequeNumber().equals(chequeNumber)) {
                result.add(b);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Покупатель не найден");
        } else {
            for (Buyer b : result) {
                System.out.println(b);
            }
        }
    }

    
    public void importFromFile(String fileName) {
        Scanner scan = ReaderFile.readFile("buyers.txt");
        List<Buyer> buyers2 = SplitString(scan);
        buyers.addAll(buyers2);
        StringBuilder sb = BuildString(buyers);
        WriterFile.writeFile(sb, "buyers.txt"); 
        System.out.println("В сведения о покупателях добавлены добавлены сведения из файла " + fileName);
    }

    public void exportToFile(String fileName) {
        StringBuilder sb = BuildString(buyers);
        WriterFile.writeFile(sb, "buyers.txt"); 
        System.out.println("Сведения о покупателях экспортированы в файл " + fileName);
    }

    public void displayBuers() {
        Scanner scan = ReaderFile.readFile("buyers.txt");
        buyers = SplitString(scan);
        System.out.println("Список покупателей");
        for (Buyer b : buyers) {
            System.out.println(b);
        }
    }


   
    public StringBuilder BuildString(List<Buyer> buyers) {
        
        StringBuilder sb = new StringBuilder();
        //3sb.append("id, Nomer cheka, Data pokupki, Summa pokupki\n");
        for (Buyer b : buyers) {
            sb.append(b.getIdBuyer()).append(",");
            sb.append(b.getChequeNumber()).append(",");
            sb.append(b.getDatePurchase()).append(",");
            sb.append(b.getPurchaseAmount()).append("\n");
        }  
        return sb;

    } 

    public List<Buyer> SplitString(Scanner scanner) {
            List<Buyer> buyers = new ArrayList<>();
      
            while (scanner.hasNextLine()) {
               String[] fields = scanner.nextLine().split(",");
               Buyer buyer = new Buyer(fields[0], fields[1], fields[2], fields[3]);
               buyers.add(buyer);
        }
        return buyers;

    
    /*
    List<Contact> contacts = new List<Contact>();
        String[] lines = a.Split("\n");
        foreach (var line in lines)
        {
           String [] fields = line.Split(",");
           Contact contact = new Contact(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
           contacts.Add(contact);
        } 
        return contacts; 
    }
    */



}
}
