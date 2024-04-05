import java.util.Scanner;

// Write a program that performs matrix addition
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.println("Enter the number of rows and columns for the matrices:");
        System.out.print("Rows: ");
        int rows = scanner.nextInt();
        System.out.print("Columns: ");
        int columns = scanner.nextInt();

        // Declare two matrices of the same dimensions
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        // Input values into the first matrix
        System.out.println("Enter values for matrix 1:");
        inputMatrixValues(scanner, matrix1);

        // Input values into the second matrix
        System.out.println("Enter values for matrix 2:");
        inputMatrixValues(scanner, matrix2);

        // Perform addition of matrices
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Display the result matrix
        System.out.println("Resultant matrix after addition:");
        displayMatrix(sumMatrix);

        scanner.close();
    }

    // Method to input values into a matrix
    private static void inputMatrixValues(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter value at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
This program performs the following steps:

Takes input for the number of rows and columns for the matrices.
Allows the user to input values for two matrices.
Adds the corresponding elements of the two matrices.
Displays the resultant matrix after addition.
Compile and run this program, and you can input values for two matrices to see their addition result.
*/