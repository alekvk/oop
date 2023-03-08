
public class Children extends Product {
    
    int minAge;
    boolean hypoallerg;

    public Children (String title, Double price, int quantity, String unitMeasure, 
                     int minAge, boolean hypoallerg) {
        super(title, price, quantity, unitMeasure);
        this.minAge = minAge;
        this.hypoallerg = hypoallerg; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Минимальный возраст: %d  ", this.minAge));
        sb.append(String.format("Является ли гипоаллергенным: %s  ", this.hypoallerg ? "Yes" : "No"));
        return sb.toString();
    }
    
    
}

