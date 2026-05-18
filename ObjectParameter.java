class Printer {
    void printMessage(String msg) {
        System.out.println("Output: " + msg);
    }
}

class Document {
    void sendToPrinter(Printer p) {
        p.printMessage("Document Content");
    }
}

public class ObjectParameter {
    public static void main(String[] args) {
        Printer prn = new Printer();
        Document doc = new Document();
        doc.sendToPrinter(prn);
    }
}