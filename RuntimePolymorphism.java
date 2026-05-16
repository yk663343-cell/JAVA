class Bird {
    void sound() {
        System.out.println("Bird sound");
    }
}

class Sparrow extends Bird {
    void sound() {
        System.out.println("Chirp Chirp");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.sound();
    }
}