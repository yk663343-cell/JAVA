abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    int r = 5;

    void area() {
        System.out.println(3.14 * r * r);
    }
}

class Rectangle extends Shape {
    int l = 10, b = 4;

    void area() {
        System.out.println(l * b);
    }
}

public class AbstractShapeArea {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}