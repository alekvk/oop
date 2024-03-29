package Lesson_6_OOP.PhoneBook.Base;

//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

//import Lesson_6_OOP.PhoneBook.Base.Contact;
import Lesson_6_OOP.PhoneBook.Base.Interfaces.*;


public class SplitterScannerComma implements InterSplitterScannerComma {
    
    @Override
    public ArrayList<Contact> SplitStringComma(Scanner scanner) {
        ArrayList<Contact> contacts = new ArrayList<>();
        //scanner.nextLine();

        while (scanner.hasNextLine()) {
            String[] fields = scanner.nextLine().split(",");
            Contact contact = new Contact(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
            contacts.add(contact);
        }
        return contacts;
    }
}