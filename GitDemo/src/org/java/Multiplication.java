package org.java;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Calculate the product
        double product = num1 * num2; //test12345
        
        // Display the product
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        
        // Close the scanner
        scanner.close();
    }
}
