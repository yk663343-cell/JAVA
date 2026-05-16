class Rectangle {
    int l = 10, b = 5;

    void area() {
        System.out.println(l * b);
    }
}

public class AreaRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}