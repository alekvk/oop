

public class Hygiene extends Product {
    
    int numberPack;

    public Hygiene(String title, Double price, int quantity, String unitMeasure, int numberPack) {
        super(title, price, quantity, unitMeasure);
        this.numberPack = numberPack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Количество штук в упаковке: %s  ", this.numberPack));
        return sb.toString();
    }
    
    
}
