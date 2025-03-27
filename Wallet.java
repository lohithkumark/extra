public class Wallet {

    // Instance variables
    String material, color, size, brand, style, compartmentType, closureType, weight, price, liningMaterial;

    // Default constructor
    public Wallet() {

    }

    // Constructor with one argument
    public Wallet(String material) {
        this.material = material;
    }

    // Constructor with two arguments
    public Wallet(String material, String color) {
        this(material);
        this.color = color;
    }

    // Constructor with three arguments
    public Wallet(String material, String color, String size) {
        this(material, color);
        this.size = size;
    }

    // Constructor with four arguments
    public Wallet(String material, String color, String size, String brand) {
        this(material, color, size);
        this.brand = brand;
    }

    // Constructor with five arguments
    public Wallet(String material, String color, String size, String brand, String style) {
        this(material, color, size, brand);
        this.style = style;
    }

    // Constructor with six arguments
    public Wallet(String material, String color, String size, String brand, String style, String compartmentType) {
        this(material, color, size, brand, style);
        this.compartmentType = compartmentType;
    }

    // Constructor with seven arguments
    public Wallet(String material, String color, String size, String brand, String style, String compartmentType, String closureType) {
        this(material, color, size, brand, style, compartmentType);
        this.closureType = closureType;
    }

    // Constructor with eight arguments
    public Wallet(String material, String color, String size, String brand, String style, String compartmentType, String closureType, String weight) {
        this(material, color, size, brand, style, compartmentType, closureType);
        this.weight = weight;
    }

    // Constructor with nine arguments
    public Wallet(String material, String color, String size, String brand, String style, String compartmentType, String closureType, String weight, String price) {
        this(material, color, size, brand, style, compartmentType, closureType, weight);
        this.price = price;
    }

    // Constructor with all ten arguments
    public Wallet(String material, String color, String size, String brand, String style, String compartmentType, String closureType, String weight, String price, String liningMaterial) {
        this(material, color, size, brand, style, compartmentType, closureType, weight, price);
        this.liningMaterial = liningMaterial;
    }

    // Info method to display details
    public void info() {
        System.out.println("Wallet Information:");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);
        System.out.println("Style: " + style);
        System.out.println("Compartment Type: " + compartmentType);
        System.out.println("Closure Type: " + closureType);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Lining Material: " + liningMaterial);
    }

}