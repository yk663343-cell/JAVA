public class Frequency {
    
    public static void main(String[] args) {
        String str = "11123234445";
        char target = '1';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Frequency of '" + target + "' in \"" + str + "\" is: " + count);
    }
}