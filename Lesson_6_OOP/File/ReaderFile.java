package Lesson_6_OOP.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

import Lesson_6_OOP.PhoneBook.Base.Contact;
import Lesson_6_OOP.PhoneBook.Base.Interfaces.*;
import Lesson_6_OOP.PhoneBook.Base.SplitterScannerComma;

public class ReaderFile {

    public static ArrayList<Contact> readFile(String fileName) {
      
        
        ArrayList<Contact> contacts = new ArrayList<>();
              
        try (Scanner scanner = new Scanner(new File(fileName))) {
            /* Создаем интерфейсную переменную "а". 
               Класс SplitterScannerComma реализует метод интерфейса 
               InterSplitterScannerComma (создание объекта ArrayList<Contact> )
            */
            InterSplitterScannerComma a = new SplitterScannerComma();
            contacts = a.SplitStringComma(scanner);
            
                              
               
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        }
        
        return contacts;
       
    }

}