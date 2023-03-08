
public class Drinks extends Product {
    
    Double volume;

    public Drinks(String title, Double price, int quantity, String unitMeasure, Double volume) {
        super(title, price, quantity, unitMeasure);
        this.volume = volume;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Объем: %s  ", this.volume));
        return sb.toString();
    }
    
    
}
