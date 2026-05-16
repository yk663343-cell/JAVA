class Book {
    int id;

    Book(int id) {
        this.id = id;
    }

    Book(Book b) {
        id = b.id;
    }

    void display() {
        System.out.println(id);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Book b1 = new Book(101);
        Book b2 = new Book(b1);
        b2.display();
    }
}