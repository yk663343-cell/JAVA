abstract class Person {
    abstract void work();
}

class Teacher extends Person {
    void work() {
        System.out.println("Teaching");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.work();
    }
}