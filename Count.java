public class Count {

        static int count = 0;

        public static void displayCount() {
            count++;  
            System.out.println("Method invoked " + count + " time(s).");
        }
    
        public static void main(String[] args) {
            displayCount(); 
            displayCount();  
            displayCount();  
        }
    }
    
    
    
    
    