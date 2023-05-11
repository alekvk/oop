package Lesson_7;

public class View {

    public void printMainMenu() {
        System.out.println("1. Провести розыгрыш игрушки");
        System.out.println("2. Работа со списком покупателей (участников розыгрыш)");
        System.out.println("3. Работа со списком игрушек");
        System.out.println("4. Выход из программы");
    }

    public void printMenuBayers() {
        System.out.println("1. Посмотреть список чеков");
        System.out.println("2. Добавить чек");
        System.out.println("3. Удалить чек");
        System.out.println("4. Изменить чек");
        System.out.println("5. Поиск по номеру чека");
        System.out.println("6. Импорт списка чеков из файла");
        System.out.println("7. Экспорт списка чеков в файл");
        System.out.println("0. Выход в основное меню");

    }

    public void printMenuPrizeFund() {
        System.out.println("1. Посмотреть список игрушек");
        System.out.println("2. Добавить игрушку");
        System.out.println("3. Удалить игрушку");
        System.out.println("4. Изменить игрушку");
        System.out.println("5. Поиск по названию игрушки");
        System.out.println("8. Импорт списка игрушек из файла");
        System.out.println("9. Экспорт списка игрушек в файл");
        System.out.println("0. Выход в основное меню");
    }
}