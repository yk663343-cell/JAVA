class Book{
    private String name;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setName("Your Book");
        System.out.println(b.getName());
    }
}