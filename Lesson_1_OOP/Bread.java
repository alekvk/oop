


import java.time.LocalDate;


public class Bread extends Food {
    String typeFlour;

    public Bread(String title, Double price, int quantity, String unitMeasure, LocalDate expiratDate, 
                 String typeFlour) {
        super(title, price, quantity, unitMeasure, expiratDate);
        this.typeFlour = typeFlour;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Хлеб: " + super.toString());
        sb.append(String.format("Тип муки: %s  ", this.typeFlour));
        return sb.toString();
    }
}