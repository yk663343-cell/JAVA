class Laptop {
    String brand;
    void setBrand(String b) {
        brand = b;
    }
    void show() {
        System.out.println("Brand: " + brand);
    }
}
public class ObjectDemo {
    public static void main(String[] args) {
        Laptop myLap = new Laptop();
        myLap.setBrand("Dell");
        myLap.show();
    }
}