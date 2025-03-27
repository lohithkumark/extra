public class Diamond {

    
    String type, color, size, weight, origin, clarity, cut, carat, price, certificate;

    
    public Diamond() {

    }

   
    public Diamond(String type) {
        this.type = type;
    }

    
    public Diamond(String type, String color) {
        this(type);
        this.color = color;
    }

   
    public Diamond(String type, String color, String size) {
        this(type, color);
        this.size = size;
    }

    
    public Diamond(String type, String color, String size, String weight) {
        this(type, color, size);
        this.weight = weight;
    }

    
    public Diamond(String type, String color, String size, String weight, String origin) {
        this(type, color, size, weight);
        this.origin = origin;
    }

    
    public Diamond(String type, String color, String size, String weight, String origin, String clarity) {
        this(type, color, size, weight, origin);
        this.clarity = clarity;
    }

    
    public Diamond(String type, String color, String size, String weight, String origin, String clarity, String cut) {
        this(type, color, size, weight, origin, clarity);
        this.cut = cut;
    }

    
    public Diamond(String type, String color, String size, String weight, String origin, String clarity, String cut, String carat) {
        this(type, color, size, weight, origin, clarity, cut);
        this.carat = carat;
    }

    
    public Diamond(String type, String color, String size, String weight, String origin, String clarity, String cut, String carat, String price) {
        this(type, color, size, weight, origin, clarity, cut, carat);
        this.price = price;
    }

    
    public Diamond(String type, String color, String size, String weight, String origin, String clarity, String cut, String carat, String price, String certificate) {
        this(type, color, size, weight, origin, clarity, cut, carat, price);
        this.certificate = certificate;
    }

    
    public void info() {
        System.out.println("Diamond Information:");
        System.out.println("Type of Diamond is : " + type);
        System.out.println("Color is : " + color);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Origin from : " + origin);
        System.out.println("Clarity: " + clarity);
        System.out.println("Cut: " + cut);
        System.out.println("Carat: " + carat);
        System.out.println("Price: " + price);
        System.out.println("Certificate: " + certificate);
    }
}