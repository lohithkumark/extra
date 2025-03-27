public class Army {

    // Instance variables
    String branch, country, division, size, leader, weapons, equipment, trainingType, budget, mission;

    // Default constructor
    public Army() {

    }

    // Constructor with one argument
    public Army(String branch) {
        this.branch = branch;
    }

    // Constructor with two arguments
    public Army(String branch, String country) {
        this(branch);
        this.country = country;
    }

    // Constructor with three arguments
    public Army(String branch, String country, String division) {
        this(branch, country);
        this.division = division;
    }

    // Constructor with four arguments
    public Army(String branch, String country, String division, String size) {
        this(branch, country, division);
        this.size = size;
    }

    // Constructor with five arguments
    public Army(String branch, String country, String division, String size, String leader) {
        this(branch, country, division, size);
        this.leader = leader;
    }

    // Constructor with six arguments
    public Army(String branch, String country, String division, String size, String leader, String weapons) {
        this(branch, country, division, size, leader);
        this.weapons = weapons;
    }

    // Constructor with seven arguments
    public Army(String branch, String country, String division, String size, String leader, String weapons, String equipment) {
        this(branch, country, division, size, leader, weapons);
        this.equipment = equipment;
    }

    // Constructor with eight arguments
    public Army(String branch, String country, String division, String size, String leader, String weapons, String equipment, String trainingType) {
        this(branch, country, division, size, leader, weapons, equipment);
        this.trainingType = trainingType;
    }

    // Constructor with nine arguments
    public Army(String branch, String country, String division, String size, String leader, String weapons, String equipment, String trainingType, String budget) {
        this(branch, country, division, size, leader, weapons, equipment, trainingType);
        this.budget = budget;
    }

    // Constructor with all ten arguments
    public Army(String branch, String country, String division, String size, String leader, String weapons, String equipment, String trainingType, String budget, String mission) {
        this(branch, country, division, size, leader, weapons, equipment, trainingType, budget);
        this.mission = mission;
    }

    // Info method to display details
    public void info() {
        System.out.println("Army Information:");
        System.out.println("Branch: " + branch);
        System.out.println("Country: " + country);
        System.out.println("Division: " + division);
        System.out.println("Size: " + size);
        System.out.println("Leader: " + leader);
        System.out.println("Weapons: " + weapons);
        System.out.println("Equipment: " + equipment);
        System.out.println("Training Type: " + trainingType);
        System.out.println("Budget: " + budget);
        System.out.println("Mission: " + mission);
    }
}

    