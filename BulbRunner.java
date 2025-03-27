public class BulbRunner {

    public static void main(String[] args) {
        // Creating an instance of Bulb using the full constructor
        Bulb bulb = new Bulb("LED", "15W", "Warm White", "Philips", "220V", "A19", "25,000 hours", "Glass", "$10", "Home Lighting");
        
        // Calling the info method to display the details of the bulb
        bulb.info();
    }
    
}
