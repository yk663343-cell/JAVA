class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (2 ints): " + calc.add(5, 10));
        System.out.println("Sum (3 ints): " + calc.add(5, 10, 15));
        System.out.println("Sum (2 doubles): " + calc.add(5.5, 10.5));
        
        Vehicle v = new Bike();
        v.run();
    }
}