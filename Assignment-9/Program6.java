class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) arr[i] = sc.nextInt();
        int x = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < 10; i++) {
            if(arr[i] == x) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Element not found");
    }
}