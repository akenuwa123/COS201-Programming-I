import java.util.Scanner;

/**
 * Course: COS 201 — Computer Programming I
 * Week: 3
 * Topic: Variables, Data Types, Expressions and Input/Output
 * File: ItemCost.java
 *
 * Description:
 * A simple item-cost calculator representing a basic inventory/information system.
 * It prompts for the item name, quantity (integer), and unit price (double),
 * validates that quantity is positive and price is non-negative, calculates the
 * total cost, and displays formatted monetary values.
 */
public class ItemCost {

    public static void main(String[] args) {
        // Create Scanner object for reading input
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("      COS 201: Item Cost Calculator     ");
        System.out.println("========================================");

        // Prompt for item name
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        // Prompt and validate quantity (must be a positive integer)
        System.out.print("Enter quantity (greater than 0): ");
        int quantity = input.nextInt();
        while (quantity <= 0) {
            System.out.print("Invalid quantity! Quantity must be at least 1. Re-enter quantity: ");
            quantity = input.nextInt();
        }

        // Prompt and validate unit price (must not be negative)
        System.out.print("Enter unit price (in Naira or local currency): ");
        double unitPrice = input.nextDouble();
        while (unitPrice < 0.0) {
            System.out.print("Invalid price! Price cannot be negative. Re-enter unit price: ");
            unitPrice = input.nextDouble();
        }

        // Calculate total cost
        double totalCost = quantity * unitPrice;

        // Display formatted summary
        System.out.println("\n----------------------------------------");
        System.out.println("            PURCHASE SUMMARY            ");
        System.out.println("----------------------------------------");
        System.out.println("Item Name  : " + itemName);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Unit Price : %.2f%n", unitPrice);
        System.out.printf("Total Cost : %.2f%n", totalCost);
        System.out.println("----------------------------------------");

        // Close Scanner
        input.close();
    }
}
