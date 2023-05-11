package Lesson_7.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Lesson_7.Model.File.*;
import Lesson_7.Model.Base.Toy;



public class PrizeFundToys {
    private List<Toy> toys;
       

    
    public PrizeFundToys() {
        Scanner scan = ReaderFile.readFile("prize_fund_toys.txt");
        toys = SplitString(scan);
    }

    
    public void addToy(Toy toy) {
        toys.add(toy);
        System.out.println("Игрушка успешно добавлена");
        StringBuilder sb = BuildString(toys);
        WriterFile.writeFile(sb, "prize_fund_toys.txt");
    }

    
    public void removeToy(String idToy) {
        for (int i = 0; i < toys.size(); i++) {
            if (toys.get(i).getIdToy().equals(idToy)) {
                toys.remove(i);
                StringBuilder sb = BuildString(toys);
                WriterFile.writeFile(sb, "prize_fund_toys.txt");  
                return;
            }
        }
        System.out.println(" Покупатель не найден");
    }

   
    public void updateToy(String idToy, String title, String quantity, String frequency) {
        for (int i = 0; i < toys.size(); i++) {
            if (toys.get(i).getIdToy().equals(idToy)) {
                Toy t = toys.get(i);
                t.setTitle(title);
                t.setQuantity(quantity);
                t.setFrequency(frequency);
                StringBuilder sb = BuildString(toys);
                WriterFile.writeFile(sb, "prize_fund_toys.txt"); 
                return;
            }
        }
        System.out.println("Игрушка не найдена");
    }

    

    public void searchByTitle(String title) {
        List<Toy> result = new ArrayList<>();
        for (Toy t : toys) {
            if (t.getTitle().equals(title)) {
                result.add(t);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Игрушка не найдена");
        } else {
            for (Toy t : result) {
                System.out.println(t);
            }
        }
    }

    
    public void importFromFile(String fileName) {
        Scanner scan = ReaderFile.readFile("prize_fund_toys.txt");
        List<Toy> toys2 = SplitString(scan);
        toys.addAll(toys2);
        StringBuilder sb = BuildString(toys);
        WriterFile.writeFile(sb, "prize_fund_toys.txt"); 
        System.out.println("В телефонный справочник добавлены контакты из файла " + fileName);
    }

    // ???????????????
    public void exportToFile(String fileName) {
        StringBuilder sb = BuildString(toys);
        WriterFile.writeFile(sb, "buyers.txt"); 
        System.out.println("Контакты телефонного справочника экспортированы в файл " + fileName);
    }

    public void displayToys() {
        Scanner scan = ReaderFile.readFile("prize_fund_toys.txt");
        toys = SplitString(scan);
        System.out.println("Список покупателей");
        for (Toy t : toys) {
            System.out.println(t);
        }
    }


   
    public StringBuilder BuildString(List<Toy> buyers) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("ttttttttttttttid, Номер чека, Дата покупки, Сумма покупки\n");
        for (Toy t : toys) {
            sb.append(t.getIdToy()).append(",");
            sb.append(t.getTitle()).append(",");
            sb.append(t.getQuantity()).append(",");
            sb.append(t.getFrequency()).append("\n");
        }  
        return sb;

    } 

    public List<Toy> SplitString(Scanner scanner) {
            List<Toy> toys = new ArrayList<>();
      
            while (scanner.hasNextLine()) {
               String[] fields = scanner.nextLine().split(",");
               // Integer.parseInt(fields[2]), Integer.parseInt(fields[3])
               Toy toy = new Toy(fields[0], fields[1], fields[2], fields[3]);
               toys.add(toy);
        }
        return toys;

    
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
