public class DustbinRunner {
    public static void main(String[] args) {
        
        Dustbin dustbin1 = new Dustbin("Plastic", "Green", "Large", "Outdoor", "Round", "Flip", "BrandA", 
                                       "50L", "Waste", "Outdoor", 90, 45, 5, 200, 10, 2, 10, 40, 3, 4, 5,true, true, 
                                       true, true, false);
        Dustbin dustbin2 = new Dustbin("Metal", "Black", "Medium", "Indoor", "Square", "Swing", "BrandB", 
                                       "30L", "Trash", "Indoor", 60, 40, 7, 300, 5, 1, 12, 30, 5,3, 3, false, false, 
                                       true, true, true);
        Dustbin dustbin3 = new Dustbin("Stainless Steel", "Silver", "Small", "Portable", "Oval", "Push", "BrandC", 
                                       "20L", "Recyclable", "Portable", 50, 30, 4, 150, 15, 3, 7,8, 20, 2, 5, 
                                       true, false, false, false, true);

        
        dustbin1.printDetails();
        System.out.println();  
        dustbin2.printDetails();
        System.out.println();
        dustbin3.printDetails();
    }
}
