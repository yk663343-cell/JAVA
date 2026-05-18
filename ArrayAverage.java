

class ArrayAverage {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int i : arr) {
            sum += i;
        }

        double avg = sum / arr.length;

        System.out.println("Average = " + avg);
    }
}