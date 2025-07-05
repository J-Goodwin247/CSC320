import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;

        System.out.println("Enter 10 grades:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            while (!scanner.hasNextFloat()) {
                System.out.println("Please enter a valid floating-point number.");
                scanner.next(); // clear the invalid input
            }
            float grade = scanner.nextFloat();
            sum += grade;
            max = Math.max(max, grade);
            min = Math.min(min, grade);
        }

        float average = sum / 10;

        System.out.println("Average Grade: " + average);
        System.out.println("Maximum Grade: " + max);
        System.out.println("Minimum Grade: " + min);

        scanner.close();
    }
}
