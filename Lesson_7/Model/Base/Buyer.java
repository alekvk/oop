
package Lesson_7.Model.Base;

public class Buyer {
    private String idBuyer;
    private String chequeNumber;
    private String datePurchase;
    // private LocalDate datePurchase;
    private String purchaseAmount;
    //private Double purchaseAmount;
        
    
    public Buyer(String idBuyer, String chequeNumber, String datePurchase, String purchaseAmount) {
            this.idBuyer = idBuyer;
            this.chequeNumber = chequeNumber;
            this.datePurchase = datePurchase;
            this.purchaseAmount = purchaseAmount;
        }
    
    // Setters
        
        public void setIdBuyer(String idBuyer) {
            this.idBuyer = idBuyer;
        }
    
        public void setChequeNumber(String chequeNumber) {
            this.chequeNumber = chequeNumber;
        }
    
        public void setDatePurchase(String datePurchase)  {
            this.datePurchase = datePurchase;
        }
        
        public void setPurchaseAmount(String purchaseAmount) {
            this.purchaseAmount = purchaseAmount;
        }
        
          
        // Getters
    
        public String getIdBuyer() {
            return idBuyer;
        }
    
        public String getChequeNumber() {
            return chequeNumber;
        }
    
        public String getDatePurchase() {
            return datePurchase;
        }
        
        public String getPurchaseAmount() {
            return purchaseAmount;
        }
        
 
        @Override
        public String toString() {
            return idBuyer + "Покупатель{" +
                    "Номер чека ='" + chequeNumber + '\'' +
                    ", Дата покупки='" + datePurchase  + '\''+
                    ", Сумма покупки='" + purchaseAmount + '\'' +
                    '}';
        }

        
}

    
   




    


    

