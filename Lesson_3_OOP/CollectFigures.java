package Lesson_3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Lesson_3_OOP.Figures.Circle;
import Lesson_3_OOP.Figures.Rectangle;
import Lesson_3_OOP.Figures.Square;
import Lesson_3_OOP.Figures.Triangle;
import Lesson_3_OOP.Figures.Base.Figure;

/* В классе-коллекции реализовать методы:
1. Вывода информации о всех периметах, площадях и длиннах окружности всех фигур, где это возможно,
2. добавления новой фигуры,
3. удаления фигуры,
4. изменения фигуры по индексу,
5. сортировки по площади, вывод информации о всех фигурах. */


public class CollectFigures {

    private ArrayList<Figure> figures;

    public CollectFigures() {
        figures = new ArrayList<>();
    }

       
    // Метод вывода информации о всех периметах, площадях и длиннах окружности всех фигур, где это возможно
    public void outputInfoAllFigures() {
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                Double a = ((Triangle) figure).getA();
                Double b = ((Triangle) figure).getB();
                Double c = ((Triangle) figure).getC();
                String triangle = String.format("Треугольник со сторонами: %.2f, %.2f, %.2f; Площадь: %.2f; Периметр: %.2f",
                                  a, b, c, figure.getArea(), figure.getPerimeter());
                System.out.println(triangle);
                         
            } else if (figure instanceof Square) {
                Double side = ((Square) figure).getSide();
                String square = String.format("Квадрат со стороной: %.2f; Площадь: %.2f; Периметр: %.2f",
                side, figure.getArea(), figure.getPerimeter());
                System.out.println(square);
                     
            } else if (figure instanceof Rectangle) {
                Double length = ((Rectangle) figure).getLength(); 
                Double widght = ((Rectangle) figure).getWidth(); 
                String rectangle = String.format("Прямоугольник с длиной %.2f и шириной %.2f; Площадь: %.2f; Периметр: %.2f",
                                   length, widght, figure.getArea(), figure.getPerimeter());
                System.out.println(rectangle);
                            
            } else {
                Double radius = ((Circle) figure).getRadius();
                String circle = String.format("Окружность с радиусом: %.2f; Площадь: %.2f; Длина окружности: %.2f",
                                radius, figure.getArea(), figure.getPerimeter());
                System.out.println(circle);               
            }
        }

        
    }
   
    // Метод добавления новой фигуры,
    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    // Метод удаления фигуры
    public void removeFigure(int index) {
        figures.remove(index);
    }

    // Метод изменения фигуры по индексу
    public void updateFigure(int index, Figure figure) {
        figures.set(index, figure);
    }
    
    public void outputPerimeters() {
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                System.out.println(String.format("Периметр треугольника: %.2f", figure.getPerimeter()));
            } else if (figure instanceof Square) {
                System.out.println(String.format("Периметр квадрата: %.2f", figure.getPerimeter()));
            } else if (figure instanceof Rectangle) {
                System.out.println(String.format("Периметр прямоугольника: %.2f", figure.getPerimeter()));
            } else {
                System.out.println(String.format("Длина окружности: %.2f", figure.getPerimeter()));
            }
        }
    }

    public void getAreas() {
        for (Figure figure : figures) {
            System.out.println(String.format("Площадь: %.2f", figure.getArea()));
        }
    }

    
    // Метод сортировки по площади фигуры
    public void sortByArea() {
        Collections.sort(figures, new Comparator<Figure>() {
            @Override
            public int compare(Figure f1, Figure f2) {
                return Double.compare(f1.getArea(), f2.getArea());
            }
        });
    }

   

        
}