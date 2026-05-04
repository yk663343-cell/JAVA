abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car start");
    }
    void stop() {
        System.out.println("Car stop");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike start");
    }
    void stop() {
        System.out.println("Bike stop");
    }
}

class Bus extends Vehicle {
    void start() {
        System.out.println("Bus start");
    }
    void stop() {
        System.out.println("Bus stop");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bus();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();

        v3.start();
        v3.stop();
    }
}