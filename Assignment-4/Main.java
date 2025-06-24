class Test {
    int num;  // Instance variable

    // Constructor to initialize num
    Test(int num) {
        this.num = num;
    }

    // Method to reverse the number
    int getReverse() {
        int reversed = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;        // Get last digit
            reversed = reversed * 10 + digit;  // Add digit to reversed number
            temp = temp / 10;             // Remove last digit
        }

        return reversed;
    }
}

public class Main {
    public static void main(String[] args) {
        Test obj = new Test(12345);  // Create object and pass number to constructor
        System.out.println("Original number: " + obj.num);
        System.out.println("Reversed number: " + obj.getReverse());
    }
}
