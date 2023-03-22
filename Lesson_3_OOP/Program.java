
package Lesson_3_OOP;

import Lesson_3_OOP.Figures.Circle;
import Lesson_3_OOP.Figures.Rectangle;
import Lesson_3_OOP.Figures.Square;
import Lesson_3_OOP.Figures.Triangle;

public class Program {

    public static void main(String[] args) {

        CollectFigures collection = new CollectFigures();

        collection.addFigure(new Circle(0.5));
        collection.addFigure(new Triangle(9, 3, 6));
        collection.addFigure(new Square(8));
        collection.addFigure(new Rectangle(1.0, 23.2));
        collection.addFigure(new Circle(0.7));

        collection.outputInfoAllFigures();
        collection.sortByArea();
        System.out.println("");
        System.out.println("После сортировки:");
        collection.outputInfoAllFigures();
        System.out.println(""); 
        collection.outputPerimeters(); 
        
        collection.removeFigure(1);
        System.out.println(""); 
        System.out.println("После удаления фигуры "); 
        collection.outputPerimeters();


    }

}
