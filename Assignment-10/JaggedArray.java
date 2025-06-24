public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        System.out.println("Jagged array:");
        for (int[] row : jagged) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
