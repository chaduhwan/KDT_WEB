import java.util.HashMap;

public class Rectangle {

    private int width;
    private int height;
    private static int cout = 0;

    public Rectangle(int width) {
        this.width = width;
        cout ++;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static int getCout() {
        return cout;
    }

    public static void setCout(int cout) {
        Rectangle.cout = cout;
    }

    public void area() {
        System.out.println("가로 길이는 " + width);
        System.out.println("세로 길이는 " + height);
        System.out.println("넓이는 " + width * getHeight());
        System.out.println("---------------------------------------");
    }
}
