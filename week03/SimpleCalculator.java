import java.util.Scanner;

/**
 * Course: COS 201 — Computer Programming I
 * Week: 3
 * Topic: Variables, Data Types, Expressions and Input/Output
 * File: SimpleCalculator.java
 *
 * Description:
 * An interactive console calculator that reads two floating-point numbers,
 * calculates their sum, difference, product, and quotient, and formats the
 * results to two decimal places. It safely checks for division by zero before
 * calculating the quotient.
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     COS 201: Simple Calculator         ");
        System.out.println("========================================");

        // Prompt user for two numbers
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Perform basic arithmetic calculations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Display results formatted to 2 decimal places
        System.out.println("\n--- CALCULATION RESULTS ---");
        System.out.printf("Sum        : %.2f%n", sum);
        System.out.printf("Difference : %.2f%n", difference);
        System.out.printf("Product    : %.2f%n", product);

        // Defensive check: prevent division by zero
        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient   : %.2f%n", quotient);
        } else {
            System.out.println("Quotient   : Division is undefined for a zero divisor.");
        }

        System.out.println("========================================");

        // Close the scanner resource
        input.close();
    }
}
