import java.time.LocalDate;

public class Milk extends Food {
    double fat;
    LocalDate expirationDate;

    public Milk(String title, Double price, int quantity, String unitMeasure, LocalDate expirationDate, double fat)
            {
        super(title, price, quantity, unitMeasure,expirationDate);
        this.fat = fat;
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Молоко: " + super.toString());
        sb.append(String.format("Жирность: %.2f  ", this.fat));
        sb.append(String.format("Срок годности: %s  ", this.expirationDate));
        return sb.toString();
    }

}


    

