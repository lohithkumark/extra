public class Drone {
    
    String model, brand, type, color, propulsionType, cameraResolution, batteryType, controllerType, 
           flightTime, weight, size, material, GPSSystem, maximumSpeed, range, flightMode, chargingTime, 
           remoteControlRange, altitude, durability;
    int batteryLife, maxAltitude, price, payloadCapacity, motorPower, numberOfMotors, flightTimeInMinutes, 
        yearOfManufacture, cameraFieldOfView, maxWindResistance;
    boolean autonomous, foldable;

    
    public Drone(String model, String brand, String type, String color, String propulsionType, String cameraResolution, 
                 String batteryType, String controllerType, String flightTime, String weight, String size, String material, 
                 String GPSSystem, String maximumSpeed, String range, String flightMode, String chargingTime, 
                 String remoteControlRange, String altitude, String durability, int batteryLife, int maxAltitude, 
                 int price, int payloadCapacity, int motorPower, int numberOfMotors, int flightTimeInMinutes, 
                 int yearOfManufacture, int cameraFieldOfView, int maxWindResistance, boolean autonomous, boolean foldable) {
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.propulsionType = propulsionType;
        this.cameraResolution = cameraResolution;
        this.batteryType = batteryType;
        this.controllerType = controllerType;
        this.flightTime = flightTime;
        this.weight = weight;
        this.size = size;
        this.material = material;
        this.GPSSystem = GPSSystem;
        this.maximumSpeed = maximumSpeed;
        this.range = range;
        this.flightMode = flightMode;
        this.chargingTime = chargingTime;
        this.remoteControlRange = remoteControlRange;
        this.altitude = altitude;
        this.durability = durability;
        this.batteryLife = batteryLife;
        this.maxAltitude = maxAltitude;
        this.price = price;
        this.payloadCapacity = payloadCapacity;
        this.motorPower = motorPower;
        this.numberOfMotors = numberOfMotors;
        this.flightTimeInMinutes = flightTimeInMinutes;
        this.yearOfManufacture = yearOfManufacture;
        this.cameraFieldOfView = cameraFieldOfView;
        this.maxWindResistance = maxWindResistance;
        this.autonomous = autonomous;
        this.foldable = foldable;
    }

    
    public void printDetails() {
        System.out.println("Drone Details:");
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Propulsion Type: " + propulsionType);
        System.out.println("Camera Resolution: " + cameraResolution);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Controller Type: " + controllerType);
        System.out.println("Flight Time: " + flightTime);
        System.out.println("Weight: " + weight);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("GPS System: " + GPSSystem);
        System.out.println("Maximum Speed: " + maximumSpeed);
        System.out.println("Range: " + range);
        System.out.println("Flight Mode: " + flightMode);
        System.out.println("Charging Time: " + chargingTime);
        System.out.println("Remote Control Range: " + remoteControlRange);
        System.out.println("Altitude: " + altitude);
        System.out.println("Durability: " + durability);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Max Altitude: " + maxAltitude);
        System.out.println("Price: " + price);
        System.out.println("Payload Capacity: " + payloadCapacity);
        System.out.println("Motor Power: " + motorPower);
        System.out.println("Number of Motors: " + numberOfMotors);
        System.out.println("Flight Time in Minutes: " + flightTimeInMinutes);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        System.out.println("Camera Field of View: " + cameraFieldOfView);
        System.out.println("Max Wind Resistance: " + maxWindResistance);
        System.out.println("Autonomous: " + autonomous);
        System.out.println("Foldable: " + foldable);
    }
}
