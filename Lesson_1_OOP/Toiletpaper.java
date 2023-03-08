
public class Toiletpaper extends Hygiene {

    int numberLayers;
    
    public Toiletpaper (String title, Double price, int quantity, String unitMeasure, 
                        int numberPack,int numberLayers) {
        super(title, price, quantity, unitMeasure, numberPack);
        this.numberLayers = numberLayers;
        
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Туалетная бумага: " + super.toString());
        sb.append(String.format("Количество слоев: %d  ", this.numberLayers));
        return sb.toString();
    }
    
    
}







