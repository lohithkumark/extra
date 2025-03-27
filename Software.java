public class Software {

    static String softwareName = "MySoftware";
    static String version = "1.0.0";
    static String developer = "John Doe";
    static int releaseYear = 2025;

    public static void displaySoftwareInfo() {
        System.out.println("Software Name: " + softwareName);
        System.out.println("Version: " + version);
        System.out.println("Developer: " + developer);
        System.out.println("Release Year: " + releaseYear);
    }

    public static void main(String[] args) {
    
        displaySoftwareInfo();
    }
}