package Lesson_4_OOP;

public class Program {
    public static void main(String[] args) {

        Integer[] intArray = { 23, -32, 888, 52, 87, 67, -98, 43};
        DynamicArray<Integer> intDinamicArray = new DynamicArray<Integer>(intArray);
        intDinamicArray.printArray();
        
        DynamicArray<Double> doubleList = new DynamicArray<Double>();
        doubleList.add(45.87); 
        doubleList.add(4.7);
        doubleList.add(12.23);
        doubleList.add(-56.3698);
        doubleList.add(87.79);
        
        System.out.print("Получение элемента массива по индексу:   ");
        System.out.println(doubleList.elementIndex(113));
        System.out.println("");
        doubleList.printArray(); 
        doubleList.removeForIndex(2); // удаление элемента по индексу
        doubleList.printArray();
        System.out.print("Задание значения элементу массива с заданным индексом:  ");
        doubleList.setValue (12, 56.3);  
        doubleList.removeData(12.23); // удаление элемента по значению
        doubleList.removeData(-956.23);
        doubleList.printArray();
        System.out.print("Минимальный элемент массива:   ");
        System.out.println(doubleList.minElement()); 
        System.out.print("Максимальный элемент массива:   ");
        System.out.println(doubleList.maxElement()); 
        System.out.print("Сумма элементов массива:   ");
        System.out.println(doubleList.sumElement()); 
        System.out.print("Произведение элементов массива:   ");
        System.out.println(doubleList.multElement()); 
        System.out.print("Поиск элемента по индексу:   ");
        System.out.println(doubleList.findIndex(2.3)); 
        System.out.print("Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.:   ");
        System.out.println(doubleList.findElement(874.3));
                                                   // 
        try {
            doubleList.BubbleSort();
            
            System.out.print("Результат:"); // Пузырьковая сортировка
            doubleList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String[] strArray = { "aa23", "-aac32", "aca888", "aww52", "ww87", "w67", "-d98", "wdw43"};
        DynamicArray<String> strDinamicArray = new DynamicArray<String>(strArray);
        strDinamicArray.printArray();

        
        DynamicArray<String> birds = new DynamicArray<String>();
        birds.add("Сова"); 
        birds.add("Воробей");
        birds.add("Сорока");
        birds.add("Ворон");
        
        birds.printArray(); 
        System.out.println("Удаление элемента с индексом 1:   ");
        birds.removeForIndex(1);
        birds.printArray();


    }
}
