package Akash;

import java.util.Scanner;

public class Calculator {
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double multi(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Infinite loop to keep the calculator running
        while (true) {
            System.out.println("Select Your operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator...");
                break;
            }

            System.out.println("Enter Your First Number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter your second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Addition result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Subtraction result: " + sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Multiplication result: " + multi(num1, num2));
                    break;
                case 4:

                    System.out.println("Division result: " + div(num1, num2));

                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}