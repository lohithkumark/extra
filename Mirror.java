public class Mirror {
    String material;
     String shape;
      String color;
       String size;
       String type;
       String frameMaterial;
String frameColor;
                   String brand; String surfaceType; String quality;int width; int height; 
                  int weight;int quantity;int price; int durability; int thickness;int rating; int warranty;
                  int mirrorType; int design;
    
    public Mirror(String material, String shape, String color, String size, String type, String frameMaterial, 
                  String frameColor, String brand, String surfaceType, String quality, int width, int height, 
                  int weight, int quantity, int price, int durability, int thickness, int rating, int warranty,
                  int mirrorType, int design) {
        this.material = material;
        this.shape = shape;
        this.color = color;
        this.size = size;
        this.type = type;
        this.frameMaterial = frameMaterial;
        this.frameColor = frameColor;
        this.brand = brand;
        this.surfaceType = surfaceType;
        this.quality = quality;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.quantity = quantity;
        this.price = price;
        this.durability = durability;
        this.thickness = thickness;
        this.rating = rating;
        this.warranty = warranty;
        this.mirrorType = mirrorType;
        this.design = design;
    }

    public void printDetails() {
        System.out.println("Mirror Details:");
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Frame Material: " + frameMaterial);
        System.out.println("Frame Color: " + frameColor);
        System.out.println("Brand: " + brand);
        System.out.println("Surface Type: " + surfaceType);
        System.out.println("Quality: " + quality);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Durability: " + durability);
        System.out.println("Thickness: " + thickness);
        System.out.println("Rating: " + rating);
        System.out.println("Warranty: " + warranty);
        System.out.println("Mirror Type: " + mirrorType);
        System.out.println("Design: " + design);
    }
}
