public class Cab {
    
    String brand, model, color, fuelType, transmission, carType, owner, licensePlate, serviceType, location;
    int capacity, year, mileage, price, quantity, rating, enginePower, weight, doors, warranty, seatType;
    boolean isAvailable, hasAirConditioning, hasGPS, hasMusicSystem, isElectric;

    
    public Cab(String brand, String model, String color, String fuelType, String transmission, String carType, 
               String owner, String licensePlate, String serviceType, String location, int capacity, int year, 
               int mileage, int price, int quantity, int rating, int enginePower, int weight, int doors, 
               int warranty, int seatType, boolean isAvailable, boolean hasAirConditioning, boolean hasGPS, 
               boolean hasMusicSystem, boolean isElectric) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.carType = carType;
        this.owner = owner;
        this.licensePlate = licensePlate;
        this.serviceType = serviceType;
        this.location = location;
        this.capacity = capacity;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.quantity = quantity;
        this.rating = rating;
        this.enginePower = enginePower;
        this.weight = weight;
        this.doors = doors;
        this.warranty = warranty;
        this.seatType = seatType;
        this.isAvailable = isAvailable;
        this.hasAirConditioning = hasAirConditioning;
        this.hasGPS = hasGPS;
        this.hasMusicSystem = hasMusicSystem;
        this.isElectric = isElectric;
    }

    // Method to print the details of the Cab object
    public void printDetails() {
        System.out.println("Cab Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Transmission: " + transmission);
        System.out.println("Car Type: " + carType);
        System.out.println("Owner: " + owner);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Service Type: " + serviceType);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Rating: " + rating);
        System.out.println("Engine Power: " + enginePower);
        System.out.println("Weight: " + weight);
        System.out.println("Doors: " + doors);
        System.out.println("Warranty: " + warranty);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Available: " + isAvailable);
        System.out.println("Has Air Conditioning: " + hasAirConditioning);
        System.out.println("Has GPS: " + hasGPS);
        System.out.println("Has Music System: " + hasMusicSystem);
        System.out.println("Is Electric: " + isElectric);
    }
}
