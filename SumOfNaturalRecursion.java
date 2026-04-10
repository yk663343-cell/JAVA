public class SumOfNaturalRecursion {
    public static void main(String[] args) {
        int n = 5; 
        int sum = sumOfNatural(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }

    public static int sumOfNatural(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + sumOfNatural(n - 1);
    }
}