public class DusterRunner {
    public static void main(String[] args) {
       
        Duster duster1 = new Duster("Renault", "Duster", "Red", "Diesel", "Manual", "4-cylinder", "John Doe", 
                                    "ABC123", "Private", "New York", 2020, 25000, 15000, 3, 110, 1500, 5, 4, 3, 5, 180, 
                                    true, true, true, false, false);
        Duster duster2 = new Duster("Renault", "Duster", "Blue", "Petrol", "Automatic", "4-cylinder", "Alice Smith", 
                                    "XYZ456", "Private", "Los Angeles", 2021, 20000, 18000, 2, 120, 1600, 5,  4, 4, 6, 190, 
                                    true, true, true, true, false);
        Duster duster3 = new Duster("Renault", "Duster", "Black", "Electric", "Automatic", "Electric", "Bob Johnson", 
                                    "LMN789", "Private", "San Francisco", 2022, 15000, 25000, 4, 150, 1700, 5, 5, 4, 7, 200, 
                                    true, true, true, true, true);

        
        duster1.printDetails();
        System.out.println();  
        duster2.printDetails();
        System.out.println();
        duster3.printDetails();
    }
}
