class InfoDisplay {

    // Method to display an integer
    void show(int num) {
        System.out.println("Integer: " + num);
    }

    // Method to display a string
    void show(String text) {
        System.out.println("String: " + text);
    }

    // Method to display a string and an integer
    void show(String text, int num) {
        System.out.println("String: " + text + ", Integer: " + num);
    }
}

public class Information {
    public static void main(String[] args) {
        InfoDisplay info = new InfoDisplay();

        info.show(42);
        info.show("Anvitha");
        info.show("Roll No", 101);
    }
}
