public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // 3 is missing
        int n = 6; // Total numbers should be 6
        
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        System.out.println("The missing number is: " + (expectedSum - actualSum));
    }
}