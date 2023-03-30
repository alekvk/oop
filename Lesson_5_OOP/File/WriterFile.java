package Lesson_5_OOP.File;

import java.io.*;
import java.util.*;

import Lesson_5_OOP.PhoneBook.Base.Contact;

public class WriterFile {
    
    public static void writeFile(List<Contact> contacts, String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            StringBuilder sb = new StringBuilder();
            sb.append("id, Имя, Отчество, Фамилия, Телефон, Комментарий\n");

            for (Contact contact : contacts) {
                sb.append(contact.getIdContact()).append(",");
                sb.append(contact.getFirstName()).append(",");
                sb.append(contact.getPatronymic()).append(",");
                sb.append(contact.getLastName()).append(",");
                sb.append(contact.getPhone()).append(",");
                sb.append(contact.getComment()).append("\n");
            }

            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        }
    }
}

    