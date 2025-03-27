public class RocketRunner {
    public static void main(String[] args) {
        
        Rocket rocket1 = new Rocket("Falcon 9", "Reusable", "SpaceX", "Liquid Oxygen and RP-1", "Merlin", 
                                    "Satellite Launch", "2023-03-01", "Low Earth Orbit", "Cape Canaveral", 
                                    "White", "Aerodynamic", "Merlin 1D", "Active", "Satellite", "550,000 kg", 
                                    "Aluminum and Carbon Fiber", "2", "Ground", "7 days", "7600 kN", "70 m", 
                                    22800, 8000, 5000, 62000000, 2, 120000, 100, 50, true, true);
        
        Rocket rocket2 = new Rocket("Delta IV Heavy", "Expendable", "United Launch Alliance", "Liquid Hydrogen and Liquid Oxygen", 
                                    "RS-68A", "Heavy Cargo", "2022-11-15", "Geostationary Orbit", "Vandenberg Space Force Base", 
                                    "Yellow", "Military", "RS-68A", "Active", "Cargo", "733,000 kg", "Titanium", "5", 
                                    "Ground", "30 days", "7000 kN", "72 m", 28400, 10000, 4000, 50000000, 3, 190000, 25, 
                                    120, false, false);
        
        Rocket rocket3 = new Rocket("Atlas V 401", "Expendable", "United Launch Alliance", "RP-1 and Liquid Oxygen", 
                                    "RD-180", "Communications", "2023-02-05", "Medium Earth Orbit", "Cape Canaveral", 
                                    "Silver", "Streamlined", "RD-180", "Active", "Satellite", "450,000 kg", "Steel", 
                                    "4", "Ground", "10 days", "4800 kN", "58 m", 13400, 9000, 3500, 15000000, 2, 105000, 
                                    80, 30, false, true);

        
        rocket1.printDetails();
        System.out.println();  
        rocket2.printDetails();
        System.out.println();
        rocket3.printDetails();
    }
}
