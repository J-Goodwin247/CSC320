import java.util.Scanner;

public class GradeStatistics {
    //declare variables for float
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        //defining how the user enters grades within a for loop.
        System.out.println("Enter 10 grades:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            while (!scanner.hasNextFloat()) {
                System.out.println("Please enter a valid floating-point number.");
                scanner.next(); // clear the invalid input
            }
            //defining of max, min and average 
            float grade = scanner.nextFloat();
            sum += grade;
            max = Math.max(max, grade);
            min = Math.min(min, grade);
        }

        float average = sum / 10;
        //printing results and closing to program
        System.out.println("Average Grade: " + average);
        System.out.println("Maximum Grade: " + max);
        System.out.println("Minimum Grade: " + min);

        scanner.close();
    }
}
