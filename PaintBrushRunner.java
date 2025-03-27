public class PaintBrushRunner {
    public static void main(String[] args) {
        
        PaintBrush brush1 = new PaintBrush("BristleMaster", "Synthetic", "Red", "Medium", "Flat", "Wood", "Brown", 
                                           "Nylon", "Oil-Based", "Acrylic", 1, 100,8, 50, 15, 1, 5, 10, 7, 6, 8, 
                                           12, 100, 12, 30, 2, 100);

        PaintBrush brush2 = new PaintBrush("ColorSplash", "Natural", "Blue", "Large", "Round", "Plastic", "Black", 
                                           "Bristle", "Water-Based", "Watercolor", 1, 150, 10, 40, 18, 2, 6, 12, 9, 
                                           7, 9, 7, 10, 100, 5, 8, 4);

        PaintBrush brush3 = new PaintBrush("ProBrush", "Synthetic", "Green", "Small", "Angle", "Metal", "Silver", 
                                           "Polyester", "Gouache", "Oil", 1, 80, 7, 60,45,5,6,7,67,76,76,67,45,45,45,3, 5);

        
        brush1.printDetails();
        System.out.println();  
        brush2.printDetails();
        System.out.println();
        brush3.printDetails();
    }
}
