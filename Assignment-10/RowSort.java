import java.util.Arrays;

public class RowSort {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 5, 1},
            {8, 3, 7},
            {6, 4, 2}
        };

        for (int[] row : matrix) {
            Arrays.sort(row);
        }

        System.out.println("Sorted matrix row-wise:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
