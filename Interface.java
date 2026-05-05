interface Printer {
    void printing();
}

interface Scanner {
    void scanning();
}

interface Fax {
    void faxing();
}

class PrinterClass implements Printer {
    public void printing() {
        System.out.println("Printing document...");
    }
}

class ScannerClass implements Scanner {
    public void scanning() {
        System.out.println("Scanning document...");
    }
}

class FaxClass implements Fax {
    public void faxing() {
        System.out.println("Sending fax...");
    }
}

public class Interface {
    public static void main(String[] args) {

        PrinterClass p = new PrinterClass();
        ScannerClass s = new ScannerClass();
        FaxClass f = new FaxClass();

        p.printing();
        s.scanning();
        f.faxing();
    }
}