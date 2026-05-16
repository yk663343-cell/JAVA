class Chain {
    Chain show() {
        System.out.println("Method Chaining");
        return this;
    }
}

public class MethodChaining {
    public static void main(String[] args) {
        new Chain().show().show();
    }
}