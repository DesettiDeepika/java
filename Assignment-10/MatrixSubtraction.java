public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] a = {
            {5, 6, 7},
            {8, 9, 10},
            {11, 12, 13}
        };
        int[][] b = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                result[i][j] = a[i][j] - b[i][j];

        System.out.println("Result of matrix subtraction:");
        for (int[] row : result) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
