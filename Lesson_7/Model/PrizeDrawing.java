package Lesson_7.Model;

//import java.util.HashMap;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Map;

import Lesson_7.Model.Base.Buyer;
import Lesson_7.Model.Base.Toy;


public class PrizeDrawing {
    private List<Buyer> buyers;
    private List<Toy> toys;
    private Buyers b;
    private  PrizeFundToys t;

    public PrizeDrawing() {
        b = new Buyers();
        buyers = b.GetList();
        t = new PrizeFundToys();
        toys = t.GetList();
    }

    public void StartPrizeDrawing() {
        if (CheckList(toys, buyers) == false){
            System.out.println("Розыгрыш игрушек не может состояться");
            System.out.println("в случае если список видов игрушек или список чеков");
            System.out.println("менее 3");
            return;
        }

        System.out.println("Произвожу розыгрыш игрушки");
        
        System.out.println("Индекс максимального");
        System.out.println(GetIdMaxToy(toys));

        

        
    }

    // Метод проверки списка чеков (покуателей) на предмет возможности проведения розыгрыша
    private boolean CheckList(List<Toy> toys, List<Buyer> buyers) {
        if ( (toys.size() < 3) || (buyers.size() < 3) ) {
                return false;
        } else {
                return true;    
        }
    }



    // Метод нахождения индекса игрушки с максимальным произведением количества игрушки 
    // данного вида на ее частоту (вес)
    private String GetIdMaxToy(List<Toy> toys) {
        int maxToy = -1;
        String idMaxToy = "";
        //toys = t.GetList();
        for (Toy i : toys) {
            int n = Integer.parseInt(i.getQuantity()) * Integer.parseInt(i.getFrequency());
            if (maxToy < n) {
                maxToy = n;
                idMaxToy = i.getIdToy();
            }
        }
        return idMaxToy; 
    }

    // Метод удаления выигранной игрушки из списка игрушек (призового фонда) 
    // Если кол-во игрушек данного вида более 1, то это кол-во уменьшается на 1.
    // Если кол-во игрушек данного вида равно 1, то данный вид игрушки полностью удаляется из призового фонда
    private void RemoveWinToy(String id) {
        Toy WinToy = t.searchByID(id);
        int quantity = Integer.parseInt(WinToy.getQuantity());
        if (quantity > 1) {
            quantity = quantity - 1;
            String quantity_ = Integer.toString(quantity);
            String title = WinToy.getTitle();
            String  frequency = WinToy.getFrequency();
            t.updateToy(id, title, quantity_, frequency);
        } else {
            t.removeToy(id);
        }

    }



   // Map<Integer, String> states = new Map<Integer, String>();



    /* public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd]; */
    


    
}
