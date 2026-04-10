public class MaxElement {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Maximum element in the array: " + max);
        }
    
}
