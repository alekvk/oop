package Lesson_6_OOP;

import java.util.Scanner;

import Lesson_6_OOP.PhoneBook.PhoneBook;
import Lesson_6_OOP.PhoneBook.Base.Contact;

public class View {

    private PhoneBook phoneBook;
    private Scanner scanner;

    public View(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("1. Посмотреть контакты");
            System.out.println("2. Добавить контакт");
            System.out.println("3. Удалить контакт");
            System.out.println("4. Изменить контакт");
            System.out.println("5. Поиск по номеру телефона");
            System.out.println("6. Поиск по имени");
            System.out.println("7. Поиск по фамилии");
            System.out.println("8. Импорт контактов из файла");
            System.out.println("9. Экспорт контактов в файл");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    phoneBook.displayContacts();
                    break;
                case 2:
                    System.out.println("Введите id (любое число): ");
                    String idContact = scanner.nextLine();
                    System.out.println("Введите имя: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Введите отчество: ");
                    String patronymic = scanner.nextLine();
                    System.out.println("Введите фамилию: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Введите телефон: ");
                    String phone = scanner.nextLine();
                    System.out.println("Введите комментарий: ");
                    String comment = scanner.nextLine();
                    Contact contact = new Contact(idContact, firstName, patronymic, lastName, phone, comment);
                    phoneBook.addContact(contact);
                    break;
                case 3:
                    System.out.println("Введите id удаляемого контакта: ");
                    String idContactDelete = scanner.nextLine();
                    phoneBook.removeContact(idContactDelete);
                    break;
                case 4:
                    System.out.println("Введите id обновляемого контакта: ");
                    String idContactUpdate = scanner.nextLine();
                    System.out.println("Введите новое имя: ");
                    String newFirstName = scanner.nextLine();
                    System.out.println("Введите новое отчество: ");
                    String newPatronymic = scanner.nextLine();
                    System.out.println("Введите новую фамилию: ");
                    String newLastName = scanner.nextLine();
                    System.out.println("Введите новый телефон: ");
                    String newPhone = scanner.nextLine();
                    System.out.println("Введите новый комментарий: ");
                    String newComment = scanner.nextLine();
                    phoneBook.updateContact(idContactUpdate, newFirstName, newPatronymic, newLastName, newPhone, newComment);
                    break;
                case 5:
                    System.out.println("Введите телефон для поиска:");
                    String searchPhone = scanner.nextLine();
                    phoneBook.searchByPhone(searchPhone);
                    break;
                case 6:
                    System.out.println("Введите имя для поиска:");
                    String firstName_ = scanner.nextLine();
                    phoneBook.searchByFirstName(firstName_);
                    break;
                
                case 7:
                    System.out.println("Введите имя для поиска:");
                    String lastName_ = scanner.nextLine();
                    phoneBook.searchByLastName(lastName_);
                    break;
 
                case 8:
                    System.out.println("Введите имя файла для импорта данных:");
                    String fileName = scanner.nextLine();
                    phoneBook.importFromFile(fileName);
                    break;
                case 9:
                    System.out.println("Введите имя файла для экспорта данных:");
                    fileName = scanner.nextLine();
                    phoneBook.exportToFile(fileName);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор");

            }
        }
    }
}