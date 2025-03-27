public class Tab {
    
    String brand, model, color, screenSize, operatingSystem, processor, batteryLife, storage, cameraType, material;
    int weight, price, ram, storageCapacity, screenResolution, rating, releaseYear, quantity, batteryCapacity, warrantyPeriod, screenType;
    
    
    public Tab(String brand, String model, String color, String screenSize, String operatingSystem, String processor, 
               String batteryLife, String storage, String cameraType, String material, int weight, int price, 
               int ram, int storageCapacity, int screenResolution, int rating, int releaseYear, int quantity, 
               int batteryCapacity, int warrantyPeriod, int screenType) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.cameraType = cameraType;
        this.material = material;
        this.weight = weight;
        this.price = price;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.screenResolution = screenResolution;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.quantity = quantity;
        this.batteryCapacity = batteryCapacity;
        this.warrantyPeriod = warrantyPeriod;
        this.screenType = screenType;
    }

    // Method to print the details of the Tab object
    public void printDetails() {
        System.out.println("Tab Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Processor: " + processor);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Storage: " + storage);
        System.out.println("Camera Type: " + cameraType);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("RAM: " + ram);
        System.out.println("Storage Capacity: " + storageCapacity);
        System.out.println("Screen Resolution: " + screenResolution);
        System.out.println("Rating: " + rating);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Quantity: " + quantity);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Warranty Period: " + warrantyPeriod);
        System.out.println("Screen Type: " + screenType);
    }
}
