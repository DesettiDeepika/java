class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i = 0; i < 7; i++) arr[i] = sc.nextInt();
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr) System.out.println(i);
    }
}