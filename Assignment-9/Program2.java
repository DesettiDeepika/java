class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int sum = 0;
        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = sum / 8.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}