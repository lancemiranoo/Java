import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the array from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create the multidimensional array
        int[][] array = new int[rows][cols];

        // Read elements from the user and store them in the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
            // Calculate the sum of diagonal elements
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += array[i][i];
            }
            // Print the diagonal sum
            System.out.println("Sum of diagonal elements: " + sum);
    }
}


