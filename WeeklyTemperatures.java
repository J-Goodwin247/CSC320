import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lists to store days and temperatures
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // List of days
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Prompt the user to input temperature for each day
        for (String day : weekDays) {
            System.out.print("Enter the temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            days.add(day);
            temperatures.add(temp);
        }

        // Clear the newline character left by nextDouble()
        scanner.nextLine();

        // Ask user if they want to see the week's data
        System.out.print("Type 'week' to display the full week's temperatures and average: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("week")) {
            double total = 0;
            System.out.println("\nWeekly Temperatures:");
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i) + "°");
                total += temperatures.get(i);
            }
            double average = total / temperatures.size();
            System.out.printf("\nWeekly Average Temperature: %.2f°\n", average);
        } else {
            System.out.println("Program ended without displaying weekly data.");
        }

        scanner.close();
    }
}
