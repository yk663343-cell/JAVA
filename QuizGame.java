import java.util.Scanner;

class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Chennai");

        int ans = sc.nextInt();

        if(ans == 2) {
            score++;
            System.out.println("Correct Answer");
        } else {
            System.out.println("Wrong Answer");
        }

        System.out.println("Your Score = " + score);

        sc.close();
    }
}