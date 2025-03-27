public class Cement {

    
    String brand, type, weight, material, packaging, grade, price, color, usage, shelfLife;

    
    public Cement() {

    }

    
    public Cement(String brand) {
        this.brand = brand;
    }

    
    public Cement(String brand, String type) {
        this(brand);
        this.type = type;
    }

    
    public Cement(String brand, String type, String weight) {
        this(brand, type);
        this.weight = weight;
    }

    
    public Cement(String brand, String type, String weight, String material) {
        this(brand, type, weight);
        this.material = material;
    }

    
    public Cement(String brand, String type, String weight, String material, String packaging) {
        this(brand, type, weight, material);
        this.packaging = packaging;
    }

    
    public Cement(String brand, String type, String weight, String material, String packaging, String grade) {
        this(brand, type, weight, material, packaging);
        this.grade = grade;
    }

    
    public Cement(String brand, String type, String weight, String material, String packaging, String grade, String price) {
        this(brand, type, weight, material, packaging, grade);
        this.price = price;
    }

    
    public Cement(String brand, String type, String weight, String material, String packaging, String grade, String price, String color) {
        this(brand, type, weight, material, packaging, grade, price);
        this.color = color;
    }

    
    public Cement(String brand, String type, String weight, String material, String packaging, String grade, String price, String color, String usage) {
        this(brand, type, weight, material, packaging, grade, price, color);
        this.usage = usage;
    }

    
    public Cement(String brand, String type, String weight, String material, String packaging, String grade, String price, String color, String usage, String shelfLife) {
        this(brand, type, weight, material, packaging, grade, price, color, usage);
        this.shelfLife = shelfLife;
    }

    public void info() {
        System.out.println("Cement Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Packaging: " + packaging);
        System.out.println("Grade: " + grade);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Usage: " + usage);
        System.out.println("Shelf Life: " + shelfLife);
    }

    
}
