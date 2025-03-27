public class SatelliteRunner {
    public static void main(String[] args) {
        
        Satellite satellite1 = new Satellite("Hubble", "Space Telescope", "USA", "Astronomy", "1990-04-24", 
                                             "NASA", "UHF", "Low Earth Orbit", "Solar", "Operational", 
                                             "Cameras, Spectrometers", "Kennedy Space Center", "Space Shuttle Atlantis", 
                                             "Reflective", "Chemical", "Aluminum", 11000, 134, 5, 15, 
                                             1000000000, 27, 547, 10000, 150, 100, 2, 6, 4, 1990);

        Satellite satellite2 = new Satellite("GPS IIF-12", "Navigation", "USA", "Global Navigation", 
                                             "2016-12-22", "Boeing", "L-Band", "Medium Earth Orbit", 
                                             "Solar", "Operational", "Atomic Clocks", "Cape Canaveral", 
                                             "Atlas V 401", "Box", "Electric", "Titanium", 2500, 5, 55, 12, 
                                             80000000, 12, 21100, 20000, 40, 20, 3, 5, 3, 2016);

        Satellite satellite3 = new Satellite("Mars Reconnaissance Orbiter", "Orbiter", "USA", "Mars Exploration", 
                                             "2005-08-12", "NASA", "Ka-Band", "Highly Elliptical Orbit", 
                                             "Solar", "Operational", "Cameras, Spectrometers", "Cape Canaveral", 
                                             "Atlas V 401", "Reflective", "Electric", "Carbon Fiber", 3000, 10, 3, 14, 
                                             720000000, 3, 314, 100000, 50, 8, 4, 7, 2, 2005);

        
        satellite1.printDetails();
        System.out.println();  
        satellite2.printDetails();
        System.out.println();
        satellite3.printDetails();
    }
}
