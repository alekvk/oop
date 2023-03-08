

import java.time.LocalDate;

public class Eggs extends Food {

    int quantityPackage;
    
    public Eggs(String title, Double price, int quantity, String unitMeasure, 
                LocalDate expiratDate, int quantityPackage) {
        super(title, price, quantity, unitMeasure, expiratDate);
        this.quantityPackage = quantityPackage;;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Яйцо: " +super.toString());
        sb.append(String.format("Количество в упаковке: %s  ", this.quantityPackage));
        return sb.toString();
    }

}





