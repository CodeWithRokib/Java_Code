package Akash;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    public void displayDimensions() {
        System.out.println("Rectangle dimensions - Width: " + width + ", Height: " + height);
    }
}

public class TalhaInterface {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Initial Dimensions:");
        rectangle.displayDimensions();

        rectangle.resizeWidth(15);
        rectangle.resizeHeight(7);

        System.out.println("\nResized Dimensions:");
        rectangle.displayDimensions();
    }
}
