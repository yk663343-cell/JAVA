public class MinElement {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int min = numbers[0];
            for (int num : numbers) {
                if (num < min) {
                    min = num;
                }
            }
            System.out.println("Minimum element in the array: " + min);
        }
    
}
