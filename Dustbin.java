public class Dustbin {
    
    String material, color, size, type, shape, lidType, brand, capacity, usage, location;
    int height, diameter, weight, price, quantity, warranty, durability, loadCapacity, lidWeight, handleType, rating;
    boolean isEcoFriendly, hasFootPedal, isLeakProof, isOdorFree, isPortable;

    
    public Dustbin(String material, String color, String size, String type, String shape, String lidType, 
                   String brand, String capacity, String usage, String location, int height, int diameter, 
                   int weight, int price, int quantity, int warranty, int durability, int loadCapacity, int lidWeight, 
                   int handleType, int rating, boolean isEcoFriendly, boolean hasFootPedal, boolean isLeakProof, 
                   boolean isOdorFree, boolean isPortable) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.type = type;
        this.shape = shape;
        this.lidType = lidType;
        this.brand = brand;
        this.capacity = capacity;
        this.usage = usage;
        this.location = location;
        this.height = height;
        this.diameter = diameter;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
        this.warranty = warranty;
        this.durability = durability;
        this.loadCapacity = loadCapacity;
        this.lidWeight = lidWeight;
        this.handleType = handleType;
        this.rating = rating;
        this.isEcoFriendly = isEcoFriendly;
        this.hasFootPedal = hasFootPedal;
        this.isLeakProof = isLeakProof;
        this.isOdorFree = isOdorFree;
        this.isPortable = isPortable;
    }

   
    public void printDetails() {
        System.out.println("Dustbin Details:");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Shape: " + shape);
        System.out.println("Lid Type: " + lidType);
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("Usage: " + usage);
        System.out.println("Location: " + location);
        System.out.println("Height: " + height);
        System.out.println("Diameter: " + diameter);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Warranty: " + warranty);
        System.out.println("Durability: " + durability);
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Lid Weight: " + lidWeight);
        System.out.println("Handle Type: " + handleType);
        System.out.println("Rating: " + rating);
        System.out.println("Eco-Friendly: " + isEcoFriendly);
        System.out.println("Has Foot Pedal: " + hasFootPedal);
        System.out.println("Is Leak Proof: " + isLeakProof);
        System.out.println("Is Odor-Free: " + isOdorFree);
        System.out.println("Is Portable: " + isPortable);
    }
}
