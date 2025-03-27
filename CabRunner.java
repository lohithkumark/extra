public class CabRunner {
    public static void main(String[] args) {
        
        Cab cab1 = new Cab("Toyota", "Corolla", "Red", "Petrol", "Automatic", "Sedan", "John Doe", 
                           "ABC123", "Private", "New York", 5, 2020, 15000, 20000, 3, 4, 120, 1500, 4, 
                           3, 4, true, true, true, true, false);
        Cab cab2 = new Cab("Tesla", "Model 3", "White", "Electric", "Automatic", "Sedan", "Jane Smith", 
                           "XYZ456", "Private", "San Francisco", 5, 2022, 5000, 35000, 2, 5, 250, 1800, 4, 
                           5, 5, true, true, true, true, true);
        Cab cab3 = new Cab("Honda", "Civic", "Blue", "Petrol", "Manual", "Sedan", "Alice Brown", 
                           "LMN789", "Private", "Los Angeles", 5, 2021, 12000, 25000, 4, 4, 140, 1300, 4, 
                           3, 3, true, true, false, false, false);

        
        cab1.printDetails();
        System.out.println();  
        cab2.printDetails();
        System.out.println();
        cab3.printDetails();
    }
}
