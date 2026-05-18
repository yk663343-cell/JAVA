class Student {
    String name;

    Student(String n) {
        name = n;
    }

    void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s = new Student("Aman");
        s.show();
    }
}