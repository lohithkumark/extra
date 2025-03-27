public class Rocket {
    
    String name, type, manufacturer, fuelType, propulsionSystem, missionType, launchDate, destination, 
           launchSite, color, design, engineType, status, payloadType, weight, material, crewCapacity, 
           launchPlatform, missionDuration, thrust, height;
    int payloadCapacity, range, speed, cost, numberOfStages, maxAltitude, launchCount, recoverySystem;
    boolean reusable, autonomous;

    
    public Rocket(String name, String type, String manufacturer, String fuelType, String propulsionSystem, 
                  String missionType, String launchDate, String destination, String launchSite, String color, 
                  String design, String engineType, String status, String payloadType, String weight, String material, 
                  String crewCapacity, String launchPlatform, String missionDuration, String thrust, String height, 
                  int payloadCapacity, int range, int speed, int cost, int numberOfStages, int maxAltitude, int launchCount, 
                  int recoverySystem, boolean reusable, boolean autonomous) {
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.fuelType = fuelType;
        this.propulsionSystem = propulsionSystem;
        this.missionType = missionType;
        this.launchDate = launchDate;
        this.destination = destination;
        this.launchSite = launchSite;
        this.color = color;
        this.design = design;
        this.engineType = engineType;
        this.status = status;
        this.payloadType = payloadType;
        this.weight = weight;
        this.material = material;
        this.crewCapacity = crewCapacity;
        this.launchPlatform = launchPlatform;
        this.missionDuration = missionDuration;
        this.thrust = thrust;
        this.height = height;
        this.payloadCapacity = payloadCapacity;
        this.range = range;
        this.speed = speed;
        this.cost = cost;
        this.numberOfStages = numberOfStages;
        this.maxAltitude = maxAltitude;
        this.launchCount = launchCount;
        this.recoverySystem = recoverySystem;
        this.reusable = reusable;
        this.autonomous = autonomous;
    }

    
    public void printDetails() {
        System.out.println("Rocket Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Propulsion System: " + propulsionSystem);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Destination: " + destination);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Color: " + color);
        System.out.println("Design: " + design);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Status: " + status);
        System.out.println("Payload Type: " + payloadType);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Crew Capacity: " + crewCapacity);
        System.out.println("Launch Platform: " + launchPlatform);
        System.out.println("Mission Duration: " + missionDuration);
        System.out.println("Thrust: " + thrust);
        System.out.println("Height: " + height);
        System.out.println("Payload Capacity: " + payloadCapacity);
        System.out.println("Range: " + range);
        System.out.println("Speed: " + speed);
        System.out.println("Cost: " + cost);
        System.out.println("Number of Stages: " + numberOfStages);
        System.out.println("Max Altitude: " + maxAltitude);
        System.out.println("Launch Count: " + launchCount);
        System.out.println("Recovery System: " + recoverySystem);
        System.out.println("Reusable: " + reusable);
        System.out.println("Autonomous: " + autonomous);
    }
}
