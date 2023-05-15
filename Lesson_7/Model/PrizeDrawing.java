package Lesson_7.Model;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


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
        toys = t.GetList();
        
        if (CheckList(toys, buyers) == false){
            System.out.println("Розыгрыш игрушек не может состояться");
            System.out.println("в случае если список видов игрушек или список чеков");
            System.out.println("менее 5");
            System.out.println("");
            return;
        }

        System.out.println("Старт розыгрыша игрушек");
        for (int i = 1; i <= 3; i++ ) {
                        
            // Определяем идентификатор вида i-й игрушки для приза
            String IdWInToy = GetIdMaxToy(toys);
            int indexWinToy = GetIndexInList(toys, IdWInToy);
            Toy WinToy = toys.get(indexWinToy);  

            // Определяем  покупателя (кассовый чек), который выиграет i-ю игрушку 
            int indexWin = rnd(buyers.size() - 1); 
            Buyer winBuyer = buyers.get(indexWin); 
            
            System.out.print("Этап  ");
            System.out.println(i);
            System.out.print("Выиграл покупатель (чек): ");
            System.out.println(winBuyer);
            System.out.print("Приз: ");
            System.out.println(WinToy.getTitle());
            System.out.println("");

            // Сохраняем победителя  розыгрыша и приз в файле log_prizes.txt
            StringBuilder s = BuildString(i, winBuyer, WinToy);
            writeFile(s, "log_prizes.txt"); 
           

            // Удаляем выигрышный чек из файла buyers.txt
            b.removeBuyer(winBuyer.getIdBuyer());
            
            // Удаляем выигранную игрушку из файла toys.txt
            RemoveWinToyFromFile(IdWInToy);
        }
    }

    // Метод проверки списка чеков (покупателей) на предмет возможности проведения розыгрыша
    private boolean CheckList(List<Toy> toys, List<Buyer> buyers) {
        if ( (toys.size() < 5) || (buyers.size() < 5) ) {
                return false;
        } else {
                return true;    
        }
    }

    // Метод нахождения случайного целого числа в интервале от 0 до max включительно
    private int rnd(int max) {
	    return (int)(Math.random() * ++max);

    }


    // Метод нахождения ID игрушки с максимальным произведением количества игрушки 
    // данного вида на ее частоту (вес)
    private String GetIdMaxToy(List<Toy> toys) {
        int maxToy = -1;
        String idMaxToy = "";
        for (Toy i : toys) {
            int n = Integer.parseInt(i.getQuantity()) * Integer.parseInt(i.getFrequency());
            if (maxToy < n) {
                maxToy = n;
                idMaxToy = i.getIdToy();
            }
        }
        return idMaxToy; 
    }


    // Метод получения индекса в List выигранной игрушки по ее идентификатору
    private int GetIndexInList(List<Toy> toys, String id) {
        int indexWinToy = -1;
        int i = 0;
        for (Toy t : toys) {
            if (t.getIdToy().equals(id)) {
                indexWinToy = i;
            }
            i+=1;
        }
        return indexWinToy;
        
    }

    // Метод удаления выигранной игрушки из списка игрушек (призового фонда) в файле toys.txt 
    // Если кол-во игрушек данного вида более 1, то это кол-во уменьшается на 1.
    // Если кол-во игрушек данного вида равно 1, то данный вид игрушки полностью удаляется из призового фонда
    private void RemoveWinToyFromFile(String id) {
        Toy WinToy = t.searchByID(id);
        int quantity = Integer.parseInt(WinToy.getQuantity());
        if (quantity > 1) {
            String quantity_ = Integer.toString(quantity - 1);
            String title = WinToy.getTitle();
            String  frequency = WinToy.getFrequency();
            t.updateToy(id, title, quantity_, frequency);
        } else {
            t.removeToy(id);
        }

    }

    public StringBuilder BuildString(int i, Buyer buyer, Toy toy) {
        
        StringBuilder sb = new StringBuilder();
        if (i == 1) {

            Date date = new Date();
            sb.append("\n");
            sb.append("Drawing of toys   ");
            sb.append(date.toString()).append("\n");      
        }
        sb.append("stage ");
        sb.append(i).append("  winner check: "); 
        sb.append(buyer.getIdBuyer()).append(",");
        sb.append(buyer.getChequeNumber()).append(",");
        sb.append(buyer.getDatePurchase()).append(",");
        sb.append(buyer.getPurchaseAmount()).append("  ");
        sb.append("prize: ");  
        sb.append(toy.getTitle()).append("\n");
        return sb;

    } 

    static void writeFile(StringBuilder sb, String fileName) {
        try(FileWriter writer = new FileWriter(fileName, true)) {
            
            writer.write(sb.toString());
            
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }






   // Map<Integer, String> states = new Map<Integer, String>();

   /*
   // Метод удаления выигранной игрушки из списка игрушек (призового фонда)  
   // Если кол-во игрушек данного вида более 1, то это кол-во уменьшается на 1.
   // Если кол-во игрушек данного вида равно 1, то данный вид игрушки полностью удаляется из призового фонда
    private void RemoveWinToyFromList(String id) {
        int indexList = GetIndexInList(toys, id);
        Toy winToy = toys.get(indexList);
        int quantity = Integer.parseInt(winToy.getQuantity());
        if (quantity > 1) {
            winToy.setQuantity(Integer.toString(quantity - 1)) ;
            toys.remove(indexList);
            toys.set(indexList, winToy);
        } else {
            toys.remove(indexList);
        } 
    }
    */


}
