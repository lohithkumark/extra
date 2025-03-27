public class PlanetRunner {
    public static void main(String[] args) {
        
        Planet planet1 = new Planet("Earth", "Terrestrial", "4.5 billion years ago", "365.25 days", "Rocky", 
                                    "Nitrogen, Oxygen", "Temperate", "93 million miles", "Milky Way", "1", 
                                    "24 hours", "1 g", "Silicate", "Blue", "15°C", "3rd", "Solar System", 
                                    "Habitable", "5.5 g/cm³", "1 trillion km³", "6371 km", 0, 1, 5973, 4, 150, 
                                    15, 1013, false, true, true, true, true);
        
        Planet planet2 = new Planet("Mars", "Terrestrial", "4.6 billion years ago", "687 Earth days", "Rocky", 
                                    "Carbon Dioxide, Nitrogen", "Cold", "140 million miles", "Milky Way", "2", 
                                    "24.6 hours", "0.38 g", "Silicate", "Red", "-60°C", "4th", "Solar System", 
                                    "Not Habitable", "3.9 g/cm³", "163 billion km³", "3390 km", 225000000, 2, 641, 
                                    4, 230, -60, 610, false, false, true, false, false);
        
        Planet planet3 = new Planet("Venus", "Terrestrial", "4.6 billion years ago", "225 Earth days", "Rocky", 
                                    "Carbon Dioxide, Nitrogen", "Hot", "67 million miles", "Milky Way", "0", 
                                    "243 Earth days", "0.9 g", "Silicate", "Yellow", "465°C", "2nd", "Solar System", 
                                    "Not Habitable", "5.2 g/cm³", "900 billion km³", "6051 km", 42000000, 0, 462, 
                                    4, 120, 460, 930, false, false, false, false, true);

        
        planet1.printDetails();
        System.out.println();  
        planet2.printDetails();
        System.out.println();
        planet3.printDetails();
        System.out.println(); 
    }
}
