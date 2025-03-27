public class MirrorRunner {
    public static void main(String[] args) {
        
        Mirror mirror1 = new Mirror("Glass", "Round", "Silver", "Medium", "Wall", "Wood", "Black", "BrandX", "Polished", 
                                    "High", 50, 100, 10, 5, 300, 15, 2, 4, 1, 1,32);
        Mirror mirror2 = new Mirror("Acrylic", "Rectangular", "Gold", "Large", "Free-Standing", "Aluminum", "Gold", 
                                    "BrandY", "Matte", "Medium", 70, 120, 8, 8, 500, 20, 3, 5, 2, 2,43);
        Mirror mirror3 = new Mirror("Plastic", "Square", "Black", "Small", "Table", "Steel", "Chrome", "BrandZ", 
                                    "Glossy", "Low", 40, 80, 5, 10, 150, 10, 1, 3, 1, 3,34);

        mirror1.printDetails();
        System.err.println();

        mirror1.printDetails();
        System.err.println();

        mirror1.printDetails();
        System.err.println();
    }
}
