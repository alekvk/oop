package Lesson_5_OOP.PhoneBook;

import java.util.ArrayList;
import java.util.List;

import Lesson_5_OOP.File.ReaderFile;
import Lesson_5_OOP.File.WriterFile;
import Lesson_5_OOP.PhoneBook.Base.Contact;


public class PhoneBook {
    private List<Contact> contacts;
       

    
    public PhoneBook() {
        contacts = ReaderFile.readFile("contacts.txt");
        
    }

    
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Контакт успешно добавлен");
        WriterFile.writeFile(contacts, "contacts.txt");
    }

    
    public void removeContact(String idContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getIdContact().equals(idContact)) {
                contacts.remove(i);
                WriterFile.writeFile(contacts, "contacts.txt");
                return;
            }
        }
        System.out.println("Контакт не найден");
    }

   
    public void updateContact(String idContact, String newFirstName, String newPatronimyc, 
                              String newLastName, String newPhone, String newComment) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getIdContact().equals(idContact)) {
                Contact contact = contacts.get(i);
                contact.setFirstName(newFirstName);
                contact.setPatronymic(newPatronimyc);
                contact.setLastName(newLastName);
                contact.setPhone(newPhone);
                contact.setComment(newComment);
                WriterFile.writeFile(contacts, "contacts.txt");
                return;
            }
        }
        System.out.println("Контакт не найден");
    }

    
    public void searchByFirstName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name)) {
                result.add(contact);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (Contact contName : result) {
                System.out.println(contName);
            }
        }
    }

     public void searchByLastName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(name)) {
                result.add(contact);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (Contact contName : result) {
                System.out.println(contName);
            }
        }
    }
    
    public void searchByPhone(String phone) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                result.add(contact);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (Contact contPhone : result) {
                System.out.println(contPhone);
            }
        }
    }

    
    public void importFromFile(String fileName) {
        List<Contact> importedContacts = ReaderFile.readFile(fileName);
        contacts.addAll(importedContacts);
        WriterFile.writeFile(contacts, "contacts.txt");
        System.out.println("В телефонный справочник добавлены контакты из файла " + fileName);
    }

    
    public void exportToFile(String fileName) {
        WriterFile.writeFile(contacts, fileName);
        System.out.println("Контакты телефонного справочника экспортированы в файл " + fileName);
    }

    public void displayContacts() {
        List<Contact> csvContacts = ReaderFile.readFile("contacts.txt");
        System.out.println("Телефонный справочник:");
        for (Contact contact : csvContacts) {
            System.out.println(contact);
        }
    }

}