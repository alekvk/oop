

import java.time.LocalDate;

public class Food extends Product {
    LocalDate expiratDate;

    public Food(String title, Double price, int quantity, String unitMeasure, LocalDate expiratDate) {
        super(title, price, quantity, unitMeasure);
        this.expiratDate = expiratDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Срок годности: %s  ", this.expiratDate));
        return sb.toString();
    }
    
    
}
