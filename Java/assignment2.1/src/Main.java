import java.util.Scanner;

public class Main {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static
    int add(String str1, String str2) {
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        return num1 + num2;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first sum
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        int sum1 = add(num1, num2);

        // Get user input for the second sum
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        int sum2 = add(num1, num2, num3);

        // Get user input for the third sum
        System.out.print("Enter the first double: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter the second double: ");
        double double2 = scanner.nextDouble();

        double sum3 = add(double1, double2);

        // Get user input for the fourth sum
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        int sum4 = add(str1, str2);

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
        System.out.println("Sum of two strings (parsed as integers): " + sum4);
    }
}
