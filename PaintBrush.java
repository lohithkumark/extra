public class PaintBrush {
    
    String brand, material, color, size, shape, handleMaterial, handleColor, bristleType, useType, typeOfPaint;
    int bristleLength, bristleCount, brushLength, weight, price, width, height, durability, stiffness, 
        hardness, flexibility, quantity, coating, handleLength, thickness, rating, warranty;

    
    public PaintBrush(String brand, String material, String color, String size, String shape, String handleMaterial, 
                      String handleColor, String bristleType, String useType, String typeOfPaint, int bristleLength, 
                      int bristleCount, int brushLength, int weight, int price, int width, int height, int durability, 
                      int stiffness, int hardness, int flexibility, int quantity, int coating, int handleLength, 
                      int thickness, int rating, int warranty) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.size = size;
        this.shape = shape;
        this.handleMaterial = handleMaterial;
        this.handleColor = handleColor;
        this.bristleType = bristleType;
        this.useType = useType;
        this.typeOfPaint = typeOfPaint;
        this.bristleLength = bristleLength;
        this.bristleCount = bristleCount;
        this.brushLength = brushLength;
        this.weight = weight;
        this.price = price;
        this.width = width;
        this.height = height;
        this.durability = durability;
        this.stiffness = stiffness;
        this.hardness = hardness;
        this.flexibility = flexibility;
        this.quantity = quantity;
        this.coating = coating;
        this.handleLength = handleLength;
        this.thickness = thickness;
        this.rating = rating;
        this.warranty = warranty;
    }

    // Method to print the details of the PaintBrush object
    public void printDetails() {
        System.out.println("PaintBrush Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Shape: " + shape);
        System.out.println("Handle Material: " + handleMaterial);
        System.out.println("Handle Color: " + handleColor);
        System.out.println("Bristle Type: " + bristleType);
        System.out.println("Use Type: " + useType);
        System.out.println("Type of Paint: " + typeOfPaint);
        System.out.println("Bristle Length: " + bristleLength);
        System.out.println("Bristle Count: " + bristleCount);
        System.out.println("Brush Length: " + brushLength);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Durability: " + durability);
        System.out.println("Stiffness: " + stiffness);
        System.out.println("Hardness: " + hardness);
        System.out.println("Flexibility: " + flexibility);
        System.out.println("Quantity: " + quantity);
        System.out.println("Coating: " + coating);
        System.out.println("Handle Length: " + handleLength);
        System.out.println("Thickness: " + thickness);
        System.out.println("Rating: " + rating);
        System.out.println("Warranty: " + warranty);
    }
}
