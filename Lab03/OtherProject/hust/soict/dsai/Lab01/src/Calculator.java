import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);  // Convert String to double

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);  // Convert String to double

        // Calculate sum, difference, and product
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Check if the divisor (num2) is zero before division
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
