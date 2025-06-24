public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] transpose = new int[3][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpose of matrix:");
        for (int[] row : transpose) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
