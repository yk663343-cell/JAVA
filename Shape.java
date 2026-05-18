class Shape {
    void area() {
        System.out.println("Area");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}

class Circle extends Shape {
    void area() {
        System.out.println(3.14 * 5 * 5);
    }
}