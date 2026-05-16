class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void show() {
        System.out.println(roll + " " + name);
    }
}

public class ObjectArray {
    public static void main(String[] args) {
        Student[] s = {
            new Student(101, "Rahul"),
            new Student(102, "Aman"),
            new Student(103, "Neha")
        };

        for (Student x : s) {
            x.show();
        }
    }
}