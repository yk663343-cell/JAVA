class Person {
    int age;

    Person(int age) {
        this.age = age;
    }

    void checkVote() {
        if (age >= 18)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}

public class VotingEligibility {
    public static void main(String[] args) {
        Person p = new Person(19);
        p.checkVote();
    }
}