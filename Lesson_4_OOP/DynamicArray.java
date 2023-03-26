package Lesson_4_OOP;

import Lesson_4_OOP.Base.NonComparableTypeException;

public class DynamicArray<T> {
    private int startLength = 1;
    private int length;
    private T[] data;

    // Конструктор без параметров – конструктор по умолчанию
    public DynamicArray() {
        this.length = 0;
        this.data = (T[]) new Object[startLength];
    }

    // Конструктор с параметром T[] – конструктор, который проводит инициализацию 
    // и заполняет массив данными, пришедшими из параметра
    public DynamicArray(T[] data) {
        this.length = data.length;
        this.data = data;
    }

    public int getLength() {
        return this.length;
    }

    public T[] getData() {
        return this.data;
    }

    // Метод вставки в массив
    public void add(T element) {
        if (this.length == this.data.length) {
            int newlen = this.getLength() + 1;
            T[] newData = (T[]) new Object[newlen];
            for (int i = 0; i < this.getLength(); i++) {
                   newData[i] = this.data[i];
                }
        this.data = newData;
        }
        this.data[this.length++] = element;
    }

     // Метод удаления элемента по индексу
     public void removeForIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.getLength()) {
            System.out.printf("Индекс %d находится за пределами длины %d\n", index, this.getLength());
        } else {
            int newlen = this.getLength() - 1;
            T[] newData = (T[]) new Object[newlen];
            int i = 0;
            while (i < index) {
                newData[i] = this.data[i];
                i++;
            }
            i++;
            while (i < this.getLength()) {
                newData[i - 1] = this.data[i];
                i++;
            }
            this.data = newData;
            this.length--;
        }
    }

    // Удаление элемента по значению
    public void removeData(T element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                removeForIndex(i);
                i--;
            }
        }
    }

    // Метод поиска минимума
    public T minElement() {
        if (data.length == 0) {
            System.out.println("Массив пустой");
            return null;
        }
        T min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (((Comparable<T>) data[i]).compareTo(min) < 0) {
                min = data[i];
            }
        }
        return min;
    }
    
    //Метод поиска максимума
    public T maxElement() {
        if (data.length == 0) {
            System.out.println("Массив пустой");
            return null;
        }
        T max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (((Comparable<T>) data[i]).compareTo(max) > 0) {
                max = data[i];
            }
        }
        return max;
    }
    
    
    
    // Поиск суммы элементов массива
    public double sumElement(){
        double result = 0;
        for (int i = 0; i < data.length; i++) {
            result = result + (double) this.data[i]; 
        }
        return result;
    } 

   
    // Метод поиска произведения элементов массива
    public double multElement(){
        double result = 1.0;
        for (int i = 0; i < data.length; i++) {
            result *= (double) this.data[i]; 
        }
        return result;
    }
    

    // Поиск индекса заданного элемента в массиве, если такого элемента 
    //в массиве нет то возвращать -1
    public int findIndex(T element){
        
        int count = 0;
        for (T t : data) {
            if (t == element){
                return count;
            }
            count++;
        }
        return -1;
    }

     // Проверка наличия элемента в массиве. Возвращает true, 
    // если элемент в массиве есть, false – нет.
    public boolean findElement(T element){
        for (T t : data) {
            if (t == element){
                return true;
            }
        }
        return false;
    }


    // Пузырьковая сортировка
    public void BubbleSort() throws NonComparableTypeException {
        T tmp = this.data[0];
        if (tmp instanceof Comparable) {
            for (int i = 0; i < this.getLength() - 1; i++) {
                boolean hasSwap = false;
                
                for (int j = 0; j < this.getLength() - i - 1; j++) {
                    Comparable<T> elem = (Comparable<T>)this.data[j];
                    T nextElem = this.data[j + 1];
                    if (elem.compareTo(nextElem) > 0) {
                        T temp = this.data[i];
                        this.data[i] = this.data[j + 1];
                        this.data[j + 1] = temp;
                        hasSwap = true;
                    }
                }
                
                if (!hasSwap) {
                    break;
                }
            }
        }
        else {
            throw new NonComparableTypeException(tmp.getClass().getSimpleName());
        }
    }

     //Метод сортировки простыми вставками
     public void InsertionSort() throws NonComparableTypeException {
        T tmp = this.data[0];
        if (tmp instanceof Comparable) {
            for (int i = 1; i < this.getLength(); i++) {
                for (int j = i; j > 0; j--) {
                    Comparable<T> elem = (Comparable)this.data[j];
                    T prevElem = this.data[j - 1];
                    if (elem.compareTo(prevElem) < 0) {
                        T temp = this.data[i];
                        this.data[i] = this.data[j-1];
                        this.data[j-1] = temp;

                    } else {
                        break;
                    }
                }
            }
        } else {
            throw new NonComparableTypeException(tmp.getClass().getSimpleName());
        }
    } 

    //Метод сортировки простым выбором 
    public void SelectionSort() throws NonComparableTypeException {
        T min = this.data[0];
        if (min instanceof Comparable) {
            for (int i = 0; i < this.getLength(); i++) {
                min = this.data[i];
                int min_idx = i;

                for (int j = i; j < this.getLength(); j++) {
                    Comparable<T> elem = (Comparable<T>)this.data[j];
                    if (elem.compareTo(min) < 0) {
                        min = this.data[j];
                        min_idx = j;
                    }
                }

                if (i != min_idx) {
                    T temp = this.data[i];
                    this.data[i] = this.data[min_idx];
                    this.data[min_idx] = temp;

                }                
            }
        } else {
            throw new NonComparableTypeException(min.getClass().getSimpleName());
        }
    }

    //Получение элемента массива по индексу
    public T elementIndex(int index){
        if ( index <= data.length - 1  & index >= 0  ) {
            return this.data[index];
        }
        return null;     
    }

    //Задание значения элементу массива с заданным индексом
    public void setValue (int index, T value){
        if ( index <= data.length - 1  & index >= 0  ) {
            this.data[index] = value;
        }
        System.out.println("Введенный индекс находится за пределами массива");   
    }


   
    // Метод печати массива на экран
    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.getLength(); i++) {
            if (i != this.getLength() - 1)
                System.out.print(this.data[i] + ",");
            else
                System.out.print(this.data[i]);
        }
        System.out.print("]\n");
    }

      
     

}
