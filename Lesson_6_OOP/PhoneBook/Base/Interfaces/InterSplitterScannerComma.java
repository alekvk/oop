package Lesson_6_OOP.PhoneBook.Base.Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

import Lesson_6_OOP.PhoneBook.Base.Contact;

public interface InterSplitterScannerComma {
    // Метод создания объекта List<Contact>
    public ArrayList<Contact> SplitStringComma(Scanner scanner);
}
