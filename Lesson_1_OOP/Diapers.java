
public class Diapers extends Children {
    
    int size;
    Double minWeight;
    Double maxWeight;
    String typeDiap;
    

    public Diapers (String title, Double price, int quantity, String unitMeasure, 
                     int minAge, boolean hypoallerg, int size, Double minWeight, Double maxWeight,
                     String typeDiap) {
        super(title, price, quantity, unitMeasure, minAge, hypoallerg);
        this.size = size;
        this.minWeight = minWeight; 
        this.maxWeight = maxWeight;
        this.typeDiap = typeDiap;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Подгузники: " + super.toString());
        sb.append(String.format("Размер: %s  ", this.size));
        sb.append(String.format("Минимальный вес: %.2f  ", this.minWeight));
        sb.append(String.format("Максимальный вес: %.2f  ", this.maxWeight));
        sb.append(String.format("Тип : %s  ", this.typeDiap));
        return sb.toString();
    }    
 
}




