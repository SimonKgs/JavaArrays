public class DiagonalSum {
    public static void main(String[] args) {

        int [][] matrix = {
                {7, 2, 12},
                {3, 8, 3},
                {9, 1, 5}
        };

        int total = 0;

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if (i == j) {
                    total += matrix[i][j];
                }
            }
        }

        System.out.printf("The total of the sum is %d ", total);
    }
}
