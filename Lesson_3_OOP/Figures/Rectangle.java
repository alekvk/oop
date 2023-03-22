package Lesson_3_OOP.Figures;

import Lesson_3_OOP.Figures.Base.Figure;
public class Rectangle extends Figure {
    
    private double length;
    private double width;
    
    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
}
