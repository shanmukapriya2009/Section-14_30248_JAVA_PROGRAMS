import java.util.Scanner;
public class FactorialIterative {
    // Method to calculate factorial using a loop
    public static long getFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int number = 24;
        System.out.println("Factorial of " + number + " is: " + getFactorial(number));
    }
}