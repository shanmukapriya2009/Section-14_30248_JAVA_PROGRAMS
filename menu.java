import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Display a menu
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("4. Multiplication");
        System.out.println("6. Division");

        // 2. Read the user's choice
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // 3. Read two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validChoice = true;

        // 4. Use a switch statement to perform the selected operation
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 4:
                result = num1 * num2;
                break;
            case 6:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validChoice = false;
                }
                break;
            default:
                // 6. Display "Invalid choice" if the user enters an option other than 1, 2, 4, 6
                System.out.println("Invalid choice");
                validChoice = false;
                break;
        }

        // 5. Display the result
        if (validChoice) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
