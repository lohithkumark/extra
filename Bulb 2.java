public class Bulb {

    // Instance variables
    String type, wattage, color, brand, voltage, shape, lifespan, material, price, application;

    // Default constructor
    public Bulb() {

    }

    // Constructor with one argument
    public Bulb(String type) {
        this.type = type;
    }

    // Constructor with two arguments
    public Bulb(String type, String wattage) {
        this(type);
        this.wattage = wattage;
    }

    // Constructor with three arguments
    public Bulb(String type, String wattage, String color) {
        this(type, wattage);
        this.color = color;
    }

    // Constructor with four arguments
    public Bulb(String type, String wattage, String color, String brand) {
        this(type, wattage, color);
        this.brand = brand;
    }

    // Constructor with five arguments
    public Bulb(String type, String wattage, String color, String brand, String voltage) {
        this(type, wattage, color, brand);
        this.voltage = voltage;
    }

    // Constructor with six arguments
    public Bulb(String type, String wattage, String color, String brand, String voltage, String shape) {
        this(type, wattage, color, brand, voltage);
        this.shape = shape;
    }

    // Constructor with seven arguments
    public Bulb(String type, String wattage, String color, String brand, String voltage, String shape, String lifespan) {
        this(type, wattage, color, brand, voltage, shape);
        this.lifespan = lifespan;
    }

    // Constructor with eight arguments
    public Bulb(String type, String wattage, String color, String brand, String voltage, String shape, String lifespan, String material) {
        this(type, wattage, color, brand, voltage, shape, lifespan);
        this.material = material;
    }

    // Constructor with nine arguments
    public Bulb(String type, String wattage, String color, String brand, String voltage, String shape, String lifespan, String material, String price) {
        this(type, wattage, color, brand, voltage, shape, lifespan, material);
        this.price = price;
    }

    // Constructor with all ten arguments
    public Bulb(String type, String wattage, String color, String brand, String voltage, String shape, String lifespan, String material, String price, String application) {
        this(type, wattage, color, brand, voltage, shape, lifespan, material, price);
        this.application = application;
    }

    // Info method to display details
    public void info() {
        System.out.println("Bulb Information:");
        System.out.println("Type: " + type);
        System.out.println("Wattage: " + wattage);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Voltage: " + voltage);
        System.out.println("Shape: " + shape);
        System.out.println("Lifespan: " + lifespan);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Application: " + application);
    }
}
