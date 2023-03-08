
public class Product {

    
    private String title;
    private double price;
    private int quantity;
    private String unitMeasure;
    
    public Product (String title, double price, int quantity, String unitMeasure) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.unitMeasure = unitMeasure; 

    }

    @Override
    public String toString() {
        return String.format("Название: %s, Цена %s, Количество %s, Единица измерения %s",
        this.title, this.price, this.quantity, this.unitMeasure); 
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public Double getPrice() {
        return this.price;
    }
    
    public int getQuantity() {
        return this.quantity;
    }

    public String getUnitMeasure() {
        return this.unitMeasure;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity  = quantity;
    }
    public void setUnitMeasure(String unitMeasure)  {
        this.unitMeasure = unitMeasure;
    }

}    



    

