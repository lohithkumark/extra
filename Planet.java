public class Planet {
    
    String name, type, discoveryDate, orbitalPeriod, surfaceComposition, atmosphere, climate, distanceFromSun, 
           galaxy, moons, rotationPeriod, surfaceGravity, composition, color, temperature, position, 
           origin, habitability, density, volume, radius;
    int distanceFromEarth, numberOfMoons, mass, yearOfDiscovery, orbitRadius, temperatureRange, surfacePressure;
    boolean hasRings, isHabitable, hasWater, hasLife, hasMagneticField;

    
    public Planet(String name, String type, String discoveryDate, String orbitalPeriod, String surfaceComposition, 
                  String atmosphere, String climate, String distanceFromSun, String galaxy, String moons, 
                  String rotationPeriod, String surfaceGravity, String composition, String color, String temperature, 
                  String position, String origin, String habitability, String density, String volume, String radius, 
                  int distanceFromEarth, int numberOfMoons, int mass, int yearOfDiscovery, int orbitRadius, 
                  int temperatureRange, int surfacePressure, boolean hasRings, boolean isHabitable, boolean hasWater, 
                  boolean hasLife, boolean hasMagneticField) {
        this.name = name;
        this.type = type;
        this.discoveryDate = discoveryDate;
        this.orbitalPeriod = orbitalPeriod;
        this.surfaceComposition = surfaceComposition;
        this.atmosphere = atmosphere;
        this.climate = climate;
        this.distanceFromSun = distanceFromSun;
        this.galaxy = galaxy;
        this.moons = moons;
        this.rotationPeriod = rotationPeriod;
        this.surfaceGravity = surfaceGravity;
        this.composition = composition;
        this.color = color;
        this.temperature = temperature;
        this.position = position;
        this.origin = origin;
        this.habitability = habitability;
        this.density = density;
        this.volume = volume;
        this.radius = radius;
        this.distanceFromEarth = distanceFromEarth;
        this.numberOfMoons = numberOfMoons;
        this.mass = mass;
        this.yearOfDiscovery = yearOfDiscovery;
        this.orbitRadius = orbitRadius;
        this.temperatureRange = temperatureRange;
        this.surfacePressure = surfacePressure;
        this.hasRings = hasRings;
        this.isHabitable = isHabitable;
        this.hasWater = hasWater;
        this.hasLife = hasLife;
        this.hasMagneticField = hasMagneticField;
    }

    // Method to print the details of the Planet object
    public void printDetails() {
        System.out.println("Planet Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Discovery Date: " + discoveryDate);
        System.out.println("Orbital Period: " + orbitalPeriod);
        System.out.println("Surface Composition: " + surfaceComposition);
        System.out.println("Atmosphere: " + atmosphere);
        System.out.println("Climate: " + climate);
        System.out.println("Distance from Sun: " + distanceFromSun);
        System.out.println("Galaxy: " + galaxy);
        System.out.println("Moons: " + moons);
        System.out.println("Rotation Period: " + rotationPeriod);
        System.out.println("Surface Gravity: " + surfaceGravity);
        System.out.println("Composition: " + composition);
        System.out.println("Color: " + color);
        System.out.println("Temperature: " + temperature);
        System.out.println("Position: " + position);
        System.out.println("Origin: " + origin);
        System.out.println("Habitability: " + habitability);
        System.out.println("Density: " + density);
        System.out.println("Volume: " + volume);
        System.out.println("Radius: " + radius);
        System.out.println("Distance from Earth: " + distanceFromEarth);
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Mass: " + mass);
        System.out.println("Year of Discovery: " + yearOfDiscovery);
        System.out.println("Orbit Radius: " + orbitRadius);
        System.out.println("Temperature Range: " + temperatureRange);
        System.out.println("Surface Pressure: " + surfacePressure);
        System.out.println("Has Rings: " + hasRings);
        System.out.println("Is Habitable: " + isHabitable);
        System.out.println("Has Water: " + hasWater);
        System.out.println("Has Life: " + hasLife);
        System.out.println("Has Magnetic Field: " + hasMagneticField);
    }
}
