import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        // Declare the matrix
        int[][] matrix = new int[2][2];

        // filling the matrix
        matrix[0][0] = 100;
        matrix[0][1] = 200;
        // matrix[0][2] = 200; out of bounds
        matrix[1][0] = 300;
        matrix[1][1] = 400;

        // two ways to iterate through the matrix values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // New line after each row
        }


        // filling the matrix from the beggining
        int [][] matrix2 = {
                {1, 2, 3},
                {10, 15, 20, 12},
                {2, 3}
        };

        // Using a for-each loop to handle irregular matrix sizes
        // This approach is more flexible and avoids index errors
        for (int[] row : matrix2) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // New line after each row
        }

        // the other way
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // dynamic matrix
        int rows, columns;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many rows?");
        rows = Integer.parseInt(scan.nextLine());
        System.out.println("How many columns?");
        columns = Integer.parseInt(scan.nextLine());

        int[][] dynamicMatrix = new int[rows][columns];

        System.out.printf("Insert %d values, press enter after each one\n", columns);
        for (int row = 0; row < rows; row++) {
            System.out.printf("row %d\n", row);
            for (int column = 0; column < columns; column++) {
                int newValue = Integer.parseInt(scan.nextLine());
                dynamicMatrix[row][column] = newValue;
            }
        }


        // Print
        System.out.printf("The final result is an array of %d x %d\n", rows, columns);
        for (int[] rowElement: dynamicMatrix){
            for (int element: rowElement) {
                System.out.printf("Value: %d ", element);
            }
            System.out.println();
        }
    }
}
