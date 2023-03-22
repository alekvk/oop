package Lesson_3_OOP.Figures;

import Lesson_3_OOP.Figures.Base.Figure;

public class Square extends Figure {
    
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    public double getPerimeter() {
        return 4 * side;
    }
    
    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }
    
}