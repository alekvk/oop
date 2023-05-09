package Lesson_7.Model.Base;

public class Toy {
        private String idToy;
        private String title;
        private int quantity;
        private int frequency;
        
    
        public Toy(String idToy, String title, int quantity, int frequency) {
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
    
        public void setQuantity(int quantity)  {
            this.quantity = quantity;
        }
        
        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }
        
          
        // Getters
    
        public String getIdToy() {
            return idToy;
        }
    
        public String getTitle() {
            return title;
        }
    
        public int getQuantity() {
            return quantity;
        }
        
        public int getFrequency() {
            return frequency;
        }
        
      
    
        @Override
        public String toString() {
            return idToy + "Игрушка{" +
                    "Название ='" + title + '\'' +
                    ", Количество='" + quantity  + '\''+
                    ", Частота выпадения игрушки (вес в % от 100)='" + frequency + '\'' +
                    '}';
        }
}

    
   




    

