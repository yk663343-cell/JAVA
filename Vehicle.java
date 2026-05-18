
class Vehicle {
    void run() {
        System.out.println("Vehicle Running");
    }
}

class Car extends Vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
    }
}