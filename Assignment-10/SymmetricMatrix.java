public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        boolean isSymmetric = true;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matrix[i][j] != matrix[j][i])
                    isSymmetric = false;

        System.out.println(isSymmetric ? "Matrix is symmetric" : "Matrix is not symmetric");
    }
}
