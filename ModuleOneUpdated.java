import java.util.Scanner; // Import the Scanner class for user input

public class ModuleOneUpdated {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user for their information and store it in variables
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter street address: ");
        String streetAddress = input.nextLine();

        System.out.print("Enter city: ");
        String city = input.nextLine();

        System.out.print("Enter zip code: ");
        String zipCode = input.nextLine();
        
        input.close();

        // Print a header for the formatted output
        System.out.println("\n--- Person's Information ---");

        // Use System.out.printf() for a clean, formatted block of text
        // %s is a placeholder for a string, and %n is a platform-independent newline
        System.out.printf("Full Name: %s %s%n", firstName, lastName);
        System.out.printf("Address:   %s%n", streetAddress);
        System.out.printf("           %s, %s%n", city, zipCode);
    }
}
