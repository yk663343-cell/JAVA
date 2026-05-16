class Vehicle {
    String color = "Black";
}

class Car extends Vehicle {
    String color = "White";

    void printColor() {
        System.out.println(super.color);
        System.out.println(color);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.printColor();
    }
}