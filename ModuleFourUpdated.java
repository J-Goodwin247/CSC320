import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Calculates grade statistics by reading a dynamic number of grades from a file.

public class ModuleFourUpdated {

    public static void main(String[] args) {
        final String FILENAME = "grades.txt";
        List<Float> grades = readGradesFromFile(FILENAME);

        // Check if grades were successfully read and the list is not empty
        if (grades == null || grades.isEmpty()) {
            System.out.println("Could not calculate statistics. Please check the file or its contents.");
            return; 
        }

        // Calculate statistics using dedicated methods
        float average = calculateAverage(grades);
        float max = Collections.max(grades); 
        float min = Collections.min(grades); 

        // Display the results
        displayResults(grades.size(), average, max, min);
    }

    // Reads numbers from a specified file.

    public static List<Float> readGradesFromFile(String filename) {
        List<Float> grades = new ArrayList<>();
        File file = new File(filename);

        System.out.println("Attempting to read from: " + file.getAbsolutePath());

        // Use a try-with-resources block to automatically close the scanner
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextFloat()) {
                grades.add(scanner.nextFloat());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + filename + "' was not found.");
            return null; // Return null to indicate failure
        }
        return grades;
    }

    // Calculates the average of a list of grades.

    public static float calculateAverage(List<Float> grades) {
        float sum = 0.0f;
        for (float grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Prints the final statistics to the console.

    public static void displayResults(int count, float average, float max, float min) {
        System.out.println("\n--- Grade Statistics ---");
        System.out.println("Grades Processed: " + count);
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Maximum Grade: " + max);
        System.out.println("Minimum Grade: " + min);
        System.out.println("------------------------");
    }
}
