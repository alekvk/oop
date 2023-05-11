package Lesson_7.Model.Base;

public class Toy {
        private String idToy;
        private String title;
        private String quantity;
        private String frequency;
        
    
        public Toy(String idToy, String title, String quantity, String frequency) {
            this.idToy = idToy;
            this.title = title;
            this.quantity = quantity;
            this.frequency = frequency;
        }
    
        // Setters
        
        public void setIdToy(String idToy) {
            this.idToy = idToy;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }
    
        public void setQuantity(String quantity)  {
            this.quantity = quantity;
        }
        
        public void setFrequency(String frequency) {
            this.frequency = frequency;
        }
        
          
        // Getters
    
        public String getIdToy() {
            return idToy;
        }
    
        public String getTitle() {
            return title;
        }
    
        public String getQuantity() {
            return quantity;
        }
        
        public String getFrequency() {
            return frequency;
        }
        
      
    
        @Override
        public String toString() {
            return  "ID = " + idToy + '\'' +
                    "Название ='" + title + '\'' +
                    ", Количество='" + quantity  + '\''+
                    ", Частота выпадения игрушки (вес в % от 0 до 100)='" + frequency;  
                    
        }
}

    
   




    

