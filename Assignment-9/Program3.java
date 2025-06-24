class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++) arr[i] = sc.nextInt();
        int max = arr[0], min = arr[0];
        for(int i = 1; i < 6; i++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}