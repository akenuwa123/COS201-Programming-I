import java.util.Scanner;

/**
 * Course: COS 201 — Computer Programming I
 * Week: 2
 * File: StudentProfile.java
 *
 * Description:
 * A console-based student profile program that prompts the user to enter
 * their academic details interactively and displays a formatted summary profile.
 */
public class StudentProfile {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   COS 201: Student Profile Generator   ");
        System.out.println("========================================");

        // Prompt the user for their information
        System.out.print("Enter your full name: ");
        String studentName = input.nextLine();

        System.out.print("Enter your programme of study (e.g., CYB, CSC, INS, SEN, ICH): ");
        String programme = input.nextLine();

        System.out.print("Enter your course code (e.g., COS 201): ");
        String courseCode = input.nextLine();

        // Display the collected information in a neat, professional profile format
        System.out.println("\n----------------------------------------");
        System.out.println("            STUDENT PROFILE             ");
        System.out.println("----------------------------------------");
        System.out.println("Student Name : " + studentName);
        System.out.println("Programme    : " + programme);
        System.out.println("Course Code  : " + courseCode);
        System.out.println("----------------------------------------");
        System.out.println("Profile generated successfully.");

        // Close the scanner resource to avoid resource leaks
        input.close();
    }
}
