class ShapeDrawer {

    // draw with no parameters
    void draw() {
        System.out.println("Drawing shape");
    }

    // draw with shape name
    void draw(String shapeName) {
        System.out.println("Drawing a " + shapeName);
    }

    // draw with shape name and size
    void draw(String shapeName, int size) {
        System.out.println("Drawing a " + shapeName + " of size " + size);
    }

    // draw with shape name, width, and height
    void draw(String shapeName, int width, int height) {
        System.out.println("Drawing a " + shapeName + " of width " + width + " and height " + height);
    }
}

public class Main2 {
    public static void main(String[] args) {
        ShapeDrawer sd = new ShapeDrawer();

        sd.draw();
        sd.draw("Circle");
        sd.draw("Square", 10);
        sd.draw("Rectangle", 20, 10);
    }
}
