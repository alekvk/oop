package Lesson_3_OOP.Figures;

import Lesson_3_OOP.Figures.Base.Figure;

public class Triangle extends Figure {
    
    private double a;
    private double b;
    private double c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getPerimeter() {
        return a + b + c;
    }
    
    public double getArea() {
        Double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));  
        
    }

    public double getA() {
        return a;
    }

	public double getB() {
		return b;
	}

    public double getC() {
        return c;
    }
    
}