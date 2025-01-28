public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {7, 3, 9},
                {4, 71, 19},
                {5, 39, 41}
        };
        // Print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}