

public class Masks extends Hygiene {
    
    public Masks (String title, Double price, int quantity, String unitMeasure, int numberPack) {
        super(title, price, quantity, unitMeasure, numberPack);
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Маски: " + super.toString()); 
        return sb.toString();
    }
    
    
}





