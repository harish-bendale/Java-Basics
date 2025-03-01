package Object_Oriented_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 1) BufferedReader always take String input.
// 2) Multiple methods are available to take input of particular data type.

public class inputs {
    public static void main(String[] a) throws IOException {
        // Method 1 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine(); // Read a line of text

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine()); // Read a line and parse it to an integer

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Method 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine(); // Read a line of text

        System.out.print("Enter your age: ");
        int age1 = scanner.nextInt(); // Read an integer

        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);

        // Close the scanner to free resources
        scanner.close();
    }
}
