import java.io.FileWriter; 
import java.io.PrintWriter;

public class CarInventory {

	public static void main(String[] args) {

		try {

			//Step 1. Call automobile class
			System.out.println("---Creating a new vehicle---");
			Automobile myCar = new Automobile("Honda", "Civic", "White", 2014, 7500);

			//Step 2. Call method and print listed values
			System.out.println("\n---Listing Vehicle Information---");
			printVehicleInfo(myCar);

			//Step 3. Call remove vehicle mother
			System.out.println("\n---Removing vehicle---");
			String removeResult = myCar.removeVehicle();
			//print result
			System.out.println(removeResult);

			//Step 4. Add vehicle 
			System.out.println("\n---Adding New Vehicle---");
			printVehicleInfo(myCar)

			//Step 5. Call list method for new vehicle information
			System.out.println("\n---Listing New Vehicle Information---");
			printVehicleInfo(myCar);

			//Step 6. Change Vehicle Information
			System.out.println("\n---Updating Vehicle Information---");
			String updateResult = myCar.updateVehicleInformation ("Gold", 10000);
			System.out.println(updateResult)

			//Step 7. Call the listing method and print information
			System.out.println("\n---Listing New Vehicle Information---");
			printVehicleInfo(myCar);
	
			//Step 8. Print Final Information to a File
			System.out.println("\n---Printing to File---");
			printInfoToFile(myCar);

		} catch (Exception e) {
			System.out.println("An Error Has Occurred:" + e.getMessage());
		}
	}

	public static void printVehicleInfo(Automobile car) {
		String[] info = car.listVehicleInformation();
		for (String detail : info) {
			System.out.println(detail);
		}
	}
	
	    private static void printInfoToFile(Automobile car) {
       
        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Temp\\Autos.txt"))) {
            System.out.println("Printing to file C:\\Temp\\Autos.txt...");
            String[] info = car.listVehicleInformation();
            for (String detail : info) {
                writer.println(detail);
            }
            System.out.println("Successfully wrote to file.");
        } catch (Exception e) {
            System.out.println("FAILURE: Could not write to file. Error: " + e.getMessage());
            System.out.println("Please ensure the directory C:\\Temp exists and you have permission to write to it.");
        }
    }
}	
