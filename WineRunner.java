public class WineRunner {

    

    public static void main(String[] args) {
        // Creating an instance of Wine using the full constructor
        Wine wine = new Wine("Red", "Cabernet Sauvignon", "France", "Château Lafite Rothschild", "Cabernet Sauvignon", "2015", "13.5%", "750ml", "Glass Bottle", "$250");
        
        // Calling the info method to display the details of the wine
        wine.info();
    }
}