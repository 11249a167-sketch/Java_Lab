// Program to demonstrate String operations in Java

public class StringDemo {

    public static void main(String[] args) {

        // Declare and initialize a string
        String str = "Java Programming";

        // Display the original string
        System.out.println("Original String: " + str);

        // Display the length of the string
        System.out.println("Length: " + str.length());

        // Convert the string to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert the string to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Extract a substring
        System.out.println("Substring: " + str.substring(5, 16));

        // Check if the string contains "Java"
        System.out.println("Contains 'Java': " + str.contains("Java"));
    }
}