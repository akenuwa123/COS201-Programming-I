import java.util.Scanner;

/**
 * Course: COS 201 — Computer Programming I
 * Week: 3
 * Topic: Variables, Data Types, Expressions and Input/Output
 * File: AverageCalculator.java
 *
 * Description:
 * An interactive student average calculator that prompts for a student's name
 * and three course scores, validates that each score falls within the valid
 * academic range (0 to 100), calculates the total and average using floating-point
 * arithmetic, and displays the formatted results.
 */
public class AverageCalculator {

    public static void main(String[] args) {
        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   COS 201: Student Average Calculator  ");
        System.out.println("========================================");

        // Prompt for student name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Prompt and validate score for Course 1
        System.out.print("Enter score for Course 1 (0 - 100): ");
        double score1 = input.nextDouble();
        while (score1 < 0 || score1 > 100) {
            System.out.print("Invalid score! Must be between 0 and 100. Re-enter Course 1: ");
            score1 = input.nextDouble();
        }

        // Prompt and validate score for Course 2
        System.out.print("Enter score for Course 2 (0 - 100): ");
        double score2 = input.nextDouble();
        while (score2 < 0 || score2 > 100) {
            System.out.print("Invalid score! Must be between 0 and 100. Re-enter Course 2: ");
            score2 = input.nextDouble();
        }

        // Prompt and validate score for Course 3
        System.out.print("Enter score for Course 3 (0 - 100): ");
        double score3 = input.nextDouble();
        while (score3 < 0 || score3 > 100) {
            System.out.print("Invalid score! Must be between 0 and 100. Re-enter Course 3: ");
            score3 = input.nextDouble();
        }

        // Calculate total and floating-point average
        double total = score1 + score2 + score3;
        double average = total / 3.0; // Dividing by 3.0 ensures floating-point division

        // Display formatted results
        System.out.println("\n----------------------------------------");
        System.out.println("            STUDENT RESULT              ");
        System.out.println("----------------------------------------");
        System.out.println("Student Name : " + name);
        System.out.printf("Total Score  : %.2f%n", total);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("----------------------------------------");

        // Close Scanner
        input.close();
    }
}
