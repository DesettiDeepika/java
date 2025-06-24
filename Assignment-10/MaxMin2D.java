public class MaxMin2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {12, 45, 7},
            {89, 23, 56},
            {32, 10, 78}
        };
        int max = matrix[0][0];
        int min = matrix[0][0];

        for (int[] row : matrix) {
            for (int val : row) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
