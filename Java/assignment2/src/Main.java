import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        checkEvenOdd(number);

        // Closing curly brace for the main method
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            int square = square(number);
            System.out.println(number + " is even. Its square is: " + square);
        } else {
            int cube = cube(number);
            System.out.println(number + " is odd. Its cube is: " + cube);
        }

        int factorial = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int square(int number) {
        return number * number;
    }

    public static int cube(int number) {
        return number * number * number;
    }

    public static int factorial(int number)
    {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}