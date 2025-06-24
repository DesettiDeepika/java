public class MainDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Main diagonal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }
}
