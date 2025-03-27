public class Wine {

    // Instance variables
    String type, color, origin, brand, grapeVariety, vintage, alcoholContent, bottleSize, packaging, price;

    // Default constructor
    public Wine() {

    }

    // Constructor with one argument
    public Wine(String type) {
        this.type = type;
    }

    // Constructor with two arguments
    public Wine(String type, String color) {
        this(type);
        this.color = color;
    }

    // Constructor with three arguments
    public Wine(String type, String color, String origin) {
        this(type, color);
        this.origin = origin;
    }

    // Constructor with four arguments
    public Wine(String type, String color, String origin, String brand) {
        this(type, color, origin);
        this.brand = brand;
    }

    // Constructor with five arguments
    public Wine(String type, String color, String origin, String brand, String grapeVariety) {
        this(type, color, origin, brand);
        this.grapeVariety = grapeVariety;
    }

    // Constructor with six arguments
    public Wine(String type, String color, String origin, String brand, String grapeVariety, String vintage) {
        this(type, color, origin, brand, grapeVariety);
        this.vintage = vintage;
    }

    // Constructor with seven arguments
    public Wine(String type, String color, String origin, String brand, String grapeVariety, String vintage, String alcoholContent) {
        this(type, color, origin, brand, grapeVariety, vintage);
        this.alcoholContent = alcoholContent;
    }

    // Constructor with eight arguments
    public Wine(String type, String color, String origin, String brand, String grapeVariety, String vintage, String alcoholContent, String bottleSize) {
        this(type, color, origin, brand, grapeVariety, vintage, alcoholContent);
        this.bottleSize = bottleSize;
    }

    // Constructor with nine arguments
    public Wine(String type, String color, String origin, String brand, String grapeVariety, String vintage, String alcoholContent, String bottleSize, String packaging) {
        this(type, color, origin, brand, grapeVariety, vintage, alcoholContent, bottleSize);
        this.packaging = packaging;
    }

    // Constructor with all ten arguments
    public Wine(String type, String color, String origin, String brand, String grapeVariety, String vintage, String alcoholContent, String bottleSize, String packaging, String price) {
        this(type, color, origin, brand, grapeVariety, vintage, alcoholContent, bottleSize, packaging);
        this.price = price;
    }

    // Info method to display details
    public void info() {
        System.out.println("Wine Information:");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Origin: " + origin);
        System.out.println("Brand: " + brand);
        System.out.println("Grape Variety: " + grapeVariety);
        System.out.println("Vintage: " + vintage);
        System.out.println("Alcohol Content: " + alcoholContent);
        System.out.println("Bottle Size: " + bottleSize);
        System.out.println("Packaging: " + packaging);
        System.out.println("Price: " + price);
    }

}
