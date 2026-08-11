// Program to demonstrate Arrays, Control Statements, and Operators in Java

public class ArrayDemo {

    public static void main(String[] args) {

        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Variable to store the sum
        int sum = 0;

        // Using a for loop to calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // Display the array elements
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Display the sum
        System.out.println("\nSum = " + sum);

        // Using if-else control statement
        if (sum > 100) {
            System.out.println("Sum is greater than 100");
        } else {
            System.out.println("Sum is less than or equal to 100");
        }
    }
}