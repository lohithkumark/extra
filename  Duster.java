public class Duster {
    
    String brand, model, color, fuelType, transmission, engineType, owner, licensePlate, serviceType, location;
    int year, mileage, price, quantity, enginePower, weight, doors, rating, warranty, seatingCapacity, maxSpeed;
    boolean isAvailable, hasAirConditioning, hasBluetooth, hasNavigationSystem, isElectric;

   
    public Duster(String brand, String model, String color, String fuelType, String transmission, String engineType, 
                  String owner, String licensePlate, String serviceType, String location, int year, int mileage, 
                  int price, int quantity, int enginePower, int weight, int doors, int rating, int warranty, 
                  int seatingCapacity, int maxSpeed, boolean isAvailable, boolean hasAirConditioning, 
                  boolean hasBluetooth, boolean hasNavigationSystem, boolean isElectric) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.engineType = engineType;
        this.owner = owner;
        this.licensePlate = licensePlate;
        this.serviceType = serviceType;
        this.location = location;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.quantity = quantity;
        this.enginePower = enginePower;
        this.weight = weight;
        this.doors = doors;
        this.rating = rating;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity;
        this.maxSpeed = maxSpeed;
        this.isAvailable = isAvailable;
        this.hasAirConditioning = hasAirConditioning;
        this.hasBluetooth = hasBluetooth;
        this.hasNavigationSystem = hasNavigationSystem;
        this.isElectric = isElectric;
    }

    // Method to print the details of the Duster object
    public void printDetails() {
        System.out.println("Duster Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Transmission: " + transmission);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Owner: " + owner);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Service Type: " + serviceType);
        System.out.println("Location: " + location);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Engine Power: " + enginePower);
        System.out.println("Weight: " + weight);
        System.out.println("Doors: " + doors);
        System.out.println("Rating: " + rating);
        System.out.println("Warranty: " + warranty);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Available: " + isAvailable);
        System.out.println("Has Air Conditioning: " + hasAirConditioning);
        System.out.println("Has Bluetooth: " + hasBluetooth);
        System.out.println("Has Navigation System: " + hasNavigationSystem);
        System.out.println("Is Electric: " + isElectric);
    }
}
