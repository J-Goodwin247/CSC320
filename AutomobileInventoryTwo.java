import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

// Manages an inventory of automobiles and demonstrates the functionality

public class AutomobileInventory {

    // The main entry point for the application.

    public static void main(String[] args) {
        // Master try-catch block to handle any unexpected errors during execution.
        try (Scanner scanner = new Scanner(System.in)) {
            // Create an ArrayList to hold the automobile inventory.
            List<Automobile> inventory = new ArrayList<>();

            System.out.println("--- Initializing Inventory ---");
            // Call the Automobile class with the parameterized constructor to create new objects.
            inventory.add(new Automobile("Honda", "Civic", 2024, "HNCV24", "Blue", 15, 25000.00, true, "1.5L Turbo", "CVT"));
            inventory.add(new Automobile("Ford", "F-150", 2023, "FRDF15023", "Red", 15000, 45000.00, false, "5.0L V8", "10-Speed Automatic"));
            inventory.add(new Automobile("Tesla", "Model 3", 2025, "TSLM325", "White", 5, 40000.00, true, "Electric", "Single-Speed"));
            System.out.println("Success: Initial inventory created with " + inventory.size() + " vehicles.\n");

            // Loop through the array and print the initial list of vehicles to the screen.
            listInventory(inventory);

            // Call a method to remove a vehicle.
            System.out.println("\n--- Removing a Vehicle ---");
            String removeResult = removeVehicle(inventory, "FRDF15023"); // Remove the Ford F-150
            System.out.println(removeResult); // Print the return value.

            // Add a new vehicle.
            System.out.println("\n--- Adding a New Vehicle ---");
            Automobile newCar = new Automobile("Subaru", "Outback", 2025, "SUBOTB25", "Green", 10, 38000.00, true, "2.5L Boxer", "CVT");
            String addResult = addVehicle(inventory, newCar);
            System.out.println(addResult); // Print the return value.

            // Call the list method and print the new vehicle information to the screen.
            listInventory(inventory);

            // Update a vehicle.
            System.out.println("\n--- Updating a Vehicle ---");
            Automobile carToUpdate = findVehicleByVin(inventory, "HNCV24");
            if (carToUpdate != null) {
                System.out.println(carToUpdate.setPrice(25500.00)); // Print return value
                System.out.println(carToUpdate.setColor("Midnight Blue")); // Print return value
                System.out.println(carToUpdate.addFeature("Sunroof")); // Print return value
            } else {
                System.out.println("Failure: Could not find vehicle to update.");
            }

            // Call the listing method and print the updated information to the screen.
            listInventory(inventory);

            // Ask user if they want to print the information to a file.
            System.out.print("\nDo you want to print the final inventory to a file? (Y/N): ");
            String response = scanner.nextLine();

            if ("Y".equalsIgnoreCase(response)) {
                printInventoryToFile(inventory, "C:\\Temp\\Autos.txt");
            } else {
                System.out.println("A file will not be printed.");
            }

        } catch (Exception e) {
            System.err.println("An unexpected error occurred in the application: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // --- Helper Methods ---

    // Lists all vehicles in the inventory to the console.

    public static void listInventory(List<Automobile> inventory) {
        System.out.println("\n--- Current Automobile Inventory ---");
        if (inventory.isEmpty()) {
            System.out.println("The inventory is currently empty.");
        } else {
            for (Automobile car : inventory) {
                System.out.println(car.toString()); // Calls the overridden toString() method
            }
        }
        System.out.println("------------------------------------");
    }

    // Adds an automobile to the inventory list.

    public static String addVehicle(List<Automobile> inventory, Automobile car) {
        if (inventory != null && car != null) {
            inventory.add(car);
            return "Success: Vehicle " + car.getYear() + " " + car.getMake() + " " + car.getModel() + " added.";
        }
        return "Failure: Could not add vehicle to inventory.";
    }

    // Removes an automobile from the inventory list based on its VIN.

    public static String removeVehicle(List<Automobile> inventory, String vin) {
        if (inventory == null || vin == null || vin.isEmpty()) {
            return "Failure: Invalid input provided for removal.";
        }
        // Using an iterator is the safe way to remove items while looping
        Iterator<Automobile> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Automobile car = iterator.next();
            if (vin.equals(car.getVin())) {
                iterator.remove();
                return "Success: Vehicle with VIN " + vin + " has been removed.";
            }
        }
        return "Failure: Vehicle with VIN " + vin + " not found.";
    }
    
    // Finds a vehicle in the inventory by its VIN.

    public static Automobile findVehicleByVin(List<Automobile> inventory, String vin) {
        for (Automobile car : inventory) {
            if (vin.equals(car.getVin())) {
                return car;
            }
        }
        return null;
    }

    // Prints the entire inventory list to a specified text file.

    public static void printInventoryToFile(List<Automobile> inventory, String filePath) {
        // Using a try-with-resources statement ensures the writer is closed automatically.
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            System.out.println("Printing inventory to file: " + filePath);
            writer.println("--- Automobile Inventory Report ---");
            writer.println("Generated on: " + java.time.LocalDateTime.now());
            writer.println("-----------------------------------");
            for (Automobile car : inventory) {
                writer.println(car.toString());
            }
            writer.println("--- End of Report ---");
            System.out.println("Success: File has been written.");
        } catch (Exception e) {
            System.err.println("Failure: Could not write to file at " + filePath);
            System.err.println("Error: " + e.getMessage());
            System.err.println("Please ensure the directory (e.g., C:\\Temp) exists and you have permission to write to it.");
        }
    }
}
