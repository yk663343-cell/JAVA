class Student {
    int id = 101;

    public String toString() {
        return "Student ID: " + id;
    }
}

public class ToStringMethod {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
    }
}