package Lesson_5_OOP;

import Lesson_5_OOP.PhoneBook.PhoneBook;

public class Program {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        View consoleView = new View(phoneBook);
        consoleView.start();
        
    }

}