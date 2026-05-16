class Box {
    Box() {
        System.out.println("Default Constructor");
    }

    Box(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        new Box();
        new Box(10);
    }
}