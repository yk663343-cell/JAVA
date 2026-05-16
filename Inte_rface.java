interface Printable {
    void print();
}

class Report implements Printable {
    public void print() {
        System.out.println("Printing Report");
    }
}

public class Inte_rface {
    public static void main(String[] args) {
        Report r = new Report();
        r.print();
    }
}