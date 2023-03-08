
import java.util.*;
import java.time.LocalDate;


public class Program {
    public static void main (String args[]) {
        ArrayList<Product> prodCatalog = new ArrayList<>();
        prodCatalog.add(new Bread("Кимовский", 1.58, 1, "шт.", LocalDate.of(2029,04,15), "ржаная"));
        prodCatalog.add(new Eggs("Копытино",3.49,1,"упак.",LocalDate.of(2023,04,15),10));
        prodCatalog.add(new Lemonade("Дюшес", 2.89, 1, "бут.", 0.5));
        prodCatalog.add(new Masks("Нежная", 8.59, 2, "шт.", 1));
        prodCatalog.add(new Milk("Тульское", 1.2, 100, "шт.", LocalDate.of(2023, 10, 05),2.5));
       
        
        //System.out.println(prodCatalog);


        for (Product item : prodCatalog) {
            System.out.println(item);
            System.out.print(" ");
        }
}
}
    
