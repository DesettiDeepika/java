public class SecondaryDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Secondary diagonal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][2 - i] + " ");
        }
    }
}
