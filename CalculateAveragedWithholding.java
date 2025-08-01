import java.util.Scanner;

public class CalculateAverageWitholding {

  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);

    //Ask user for weekly income
    System.out.print("Enter Weekly Income $");
    double weeklyIncome = scanner.nextDouble();
    double taxRate ;

    //Determine the user taxe rate based on their income
    if (weeklyIncome < 500){
      taxRate = 0.10;
    }else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
      taxRate = 0.15;
    }else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
      taxRate = 0.20;
    }else {
      taxRate = 0.30;
    }

    //calculation of tax withholding
    double taxWithholding = weeklyIncome * taxRate;

    System.out.printf("Weekly Tax Withholding : $%.2f%n", taxWithholding);

    scanner.close();
  }
}
