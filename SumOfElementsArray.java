public class SumOfElementsArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,95};
        int sum = sumOfElements(arr);
        System.out.println("The sum of the elements in the array is: " + sum);
    }

    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}