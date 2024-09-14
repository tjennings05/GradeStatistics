import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        // Initialize variables
        double sum = 0;
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;
        
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter grades
        System.out.println("Enter ten floating-point grades:");
        
        // Use a for-loop to read grades and calculate statistics
        for (int i = 0; i < 10; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            
            // Read grade from user input
            double grade = scanner.nextDouble();
            
            // Add grade to sum
            sum += grade;
            
            // Update maximum grade
            if (grade > maximum) {
                maximum = grade;
            }
            
            // Update minimum grade
            if (grade < minimum) {
                minimum = grade;
            }
        }
        
        // Close the scanner
        scanner.close();
        
        // Calculate average grade
        double average = sum / 10;
        
        // Print statistics
        System.out.println("\nStatistics:");
        System.out.println("Average Grade: " + average);
        System.out.println("Maximum Grade: " + maximum);
        System.out.println("Minimum Grade: " + minimum);
    }
}