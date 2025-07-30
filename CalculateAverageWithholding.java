import java.util.Scanner;

public class CalculateAverageWithholding {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        //Define total weeks and total withholding
        int numberOfWeeks = 4;
        double totalTaxWithholding = 0.0;

        // Loop to calculate income for each of hte four weeks
        for (int i = 1; i <= numberOfWeeks; i++)    
            //Ask user for weekly income
            System.out.print("Enter income for week " + i + ": $");
            double weeklyIncome = scanner.nextDouble();
            double taxRate;

            //Determine the user tax rate based on their income
            if (weeklyIncome < 500){
                taxRate = 0.10;
            }else if (weeklyIncome >=500 && weeklyIncome < 1500){
                taxRate = 0.15;
            }else if (weeklyIncome >= 1500 && weeklyIncome < 2500){
                taxRate = 0.20;
            }else {
                taxRate = 0.30;
            }

            //calculation of tax withholding
            double taxWithholding = weeklyIncome * taxRate;
            System.out.printf("---> This week's withholding: $%.2f%n%n", weeklyTaxWithholding);

            // Calculate week withholding to the running total
            totalTaxWithholding += weeklyTaxWithholding;
        } 

        // Calculate the average weekly withholding after all weeks
        System.out.printf("Total tax withheld for %d weeks: $%.2f%n%n, numberOfWeeks, totaTaxWithholding);
        System.out.printf("Average weekly withholding: $%.2f%m", averageWeeklyWithholding);   
      
        scanner.close();
    }  
}
