package Lesson_7.Model;

//import java.util.ArrayList;
import java.util.List;
import Lesson_7.Model.Base.Buyer;
import Lesson_7.Model.Base.Toy;


public class PrizeDrawing {
    private List<Buyer> buyers;
    private List<Toy> toys;
    private Buyers b;
    private  PrizeFundToys t;

    public PrizeDrawing() {
        b = new Buyers();
        t = new PrizeFundToys();
    }

    public void StartPrizeDrawing() {
        buyers = b.GetList();
        for (Buyer i : buyers) {
            System.out.println(i);
        } 
        toys = t.GetList();
        for (Toy i : toys) {
            System.out.println(i);
        }
        b.displayBuers();

    }









    /* public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd]; */
    


    
}
