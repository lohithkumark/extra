public class Satellite {
    // 20 instance variables for the Satellite class
    String name, type, countryOfOrigin, purpose, launchDate, manufacturer, communicationFrequency, orbitType, 
           powerSource, status, payload, launchSite, launchVehicle, design, propulsionSystem, 
           material, weight, length, width, height,lifetime;
    int cost, speed, altitude, transmissionRange, powerConsumption, numberOfSolarPanels, numberOfAntennas,
        numberOfEngines, yearOfManufacture;

    // Constructor to initialize all instance variables
    public Satellite(String name, String type, String countryOfOrigin, String purpose, String launchDate, 
                     String manufacturer, String communicationFrequency, String orbitType, String powerSource, 
                     String status, String payload, String launchSite, String launchVehicle, String design, 
                     String propulsionSystem, String material, int weight, int length, int width, int height, 
                     int lifetime, int cost, int speed, int altitude, int transmissionRange, int powerConsumption,
                     int numberOfSolarPanels, int numberOfAntennas, int numberOfEngines, int yearOfManufacture) {
        this.name = name;
        this.type = type;
        this.countryOfOrigin = countryOfOrigin;
        this.purpose = purpose;
        this.launchDate = launchDate;
        this.manufacturer = manufacturer;
        this.communicationFrequency = communicationFrequency;
        this.orbitType = orbitType;
        this.powerSource = powerSource;
        this.status = status;
        this.payload = payload;
        this.launchSite = launchSite;
        this.launchVehicle = launchVehicle;
        this.design = design;
        this.propulsionSystem = propulsionSystem;
        this.material = material;
        this.cost = cost;
        this.speed = speed;
        this.altitude = altitude;
        this.transmissionRange = transmissionRange;
        this.powerConsumption = powerConsumption;
        this.numberOfSolarPanels = numberOfSolarPanels;
        this.numberOfAntennas = numberOfAntennas;
        this.numberOfEngines = numberOfEngines;
        this.yearOfManufacture = yearOfManufacture;
    }

    // Method to print the details of the Satellite object
    public void printDetails() {
        System.out.println("Satellite Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Purpose: " + purpose);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Communication Frequency: " + communicationFrequency);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Status: " + status);
        System.out.println("Payload: " + payload);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Design: " + design);
        System.out.println("Propulsion System: " + propulsionSystem);
        System.out.println("Material: " + material);
        System.out.println("Cost: " + cost);
        System.out.println("Speed: " + speed);
        System.out.println("Altitude: " + altitude);
        System.out.println("Transmission Range: " + transmissionRange);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Number of Solar Panels: " + numberOfSolarPanels);
        System.out.println("Number of Antennas: " + numberOfAntennas);
        System.out.println("Number of Engines: " + numberOfEngines);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
    }
}
