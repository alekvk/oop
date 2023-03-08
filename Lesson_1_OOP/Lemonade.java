
public class Lemonade extends Drinks {

    public Lemonade(String title, Double price, int quantity, String unitMeasure, Double volume) {
        super(title, price, quantity, unitMeasure, volume);
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Лимонад: " + super.toString());
        return sb.toString();
    }
    
}


