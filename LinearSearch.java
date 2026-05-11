public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 99};
        int target = 30;
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i;
                break;
            }
        }

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}