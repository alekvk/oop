package Lesson_4_OOP.Base;

public class NonComparableTypeException extends Exception{
    public NonComparableTypeException(String type) {
        super(String.format("Тип %s не сопоставим", type));
    }
}
