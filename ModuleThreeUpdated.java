import java.util.Scanner;

public class ModuleThreeUpdated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWeeks = 4;
        double totalTaxWithholding = 0.0;

        // Loop to calculate income for each of the four weeks
        for (int i = 1; i <= numberOfWeeks; i++) {
            // This is the line that should appear in your console
            System.out.print("Enter income for week " + i + ": $");
            
            // The program will pause here, waiting for you to type a number and press Enter
            double weeklyIncome = scanner.nextDouble();
            double taxRate;

            if (weeklyIncome < 500) {
                taxRate = 0.10;
            } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
                taxRate = 0.15;
            } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
                taxRate = 0.20;
            } else {
                taxRate = 0.30;
            }

            double taxWithholding = weeklyIncome * taxRate;
            System.out.printf("---> This week's withholding: $%.2f%n%n", taxWithholding);

            totalTaxWithholding += taxWithholding;
        }

        double averageWeeklyWithholding = totalTaxWithholding / numberOfWeeks;

        System.out.printf("Total tax withheld for %d weeks: $%.2f%n", numberOfWeeks, totalTaxWithholding);
        System.out.printf("Average weekly withholding: $%.2f%n", averageWeeklyWithholding);

        scanner.close();
    }
}
