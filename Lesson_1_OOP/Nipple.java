

public class Nipple extends Children {
    public Nipple (String title, Double price, int quantity, String unitMeasure, 
                     int minAge, boolean hypoallerg) {
        super(title, price, quantity, unitMeasure, minAge, hypoallerg);
    }    
        
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Соска: " + super.toString());
        return sb.toString();
    }    
 
}