import java.util.ArrayList;  
import java.util.Scanner;    

public class Food {
    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<>();   
        ArrayList<String> foodNames = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);       

        while (true) {  
            System.out.println("\nMenu:");
            System.out.println("1. Save Login Email");
            System.out.println("2. Show All Emails");
            System.out.println("3. Search Email");
            System.out.println("4. Save Food Name");
            System.out.println("5. Show All Food Names");
            System.out.println("6. Search Food Name");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt(); 
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    // Save Login Email
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    if (!emails.contains(email)) {  // Check for duplicates
                        emails.add(email);
                        System.out.println("Email saved successfully.");
                    } else {
                        System.out.println("Email already exists!");
                    }
                    break;

                case 2:
                    // Show all emails
                    if (emails.isEmpty()) {
                        System.out.println("No emails saved yet.");
                    } else {
                        System.out.println("Saved Emails: " + emails);
                    }
                    break;

                case 3:
                    // Search for an email
                    System.out.print("Enter email to search: ");
                    String searchEmail = scanner.nextLine();
                    if (emails.contains(searchEmail)) {
                        System.out.println("Email found: " + searchEmail);
                    } else {
                        System.out.println("Email not found!");
                    }
                    break;

                case 4:
                    // Save Food Name
                    System.out.print("Enter food name: ");
                    String food = scanner.nextLine();
                    if (!foodNames.contains(food)) {  // Check for duplicates
                        foodNames.add(food);
                        System.out.println("Food name saved successfully.");
                    } else {
                        System.out.println("Food name already exists!");
                    }
                    break;

                case 5:
                    // Show all food names
                    if (foodNames.isEmpty()) {
                        System.out.println("No food names saved yet.");
                    } else {
                        System.out.println("Saved Food Names: " + foodNames);
                    }
                    break;

                case 6:
                    // Search for a food name
                    System.out.print("Enter food name to search: ");
                    String searchFood = scanner.nextLine();
                    if (foodNames.contains(searchFood)) {
                        System.out.println("Food name found: " + searchFood);
                    } else {
                        System.out.println("Food name not found!");
                    }
                    break;

                case 7:
                    // Exit
                    System.out.println("Goodbye!");
                    scanner.close();  // Close scanner
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}