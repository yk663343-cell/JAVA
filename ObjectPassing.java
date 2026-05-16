class Test {
    void display(Test t) {
        System.out.println("Object passed as argument");
    }
}

public class ObjectPassing {
    public static void main(String[] args) {
        Test t = new Test();
        t.display(t);
    }
}