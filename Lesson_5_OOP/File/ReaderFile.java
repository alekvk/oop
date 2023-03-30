package Lesson_5_OOP.File;

import java.io.*;
import java.util.*;

import Lesson_5_OOP.PhoneBook.Base.Contact;

public class ReaderFile {
    
    public static List<Contact> readFile(String fileName) {
        List<Contact> contacts = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(",");
                Contact contact = new Contact(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
                contacts.add(contact);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        }

        return contacts;
    }

}