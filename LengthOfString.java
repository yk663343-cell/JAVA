public class LengthOfString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = lengthOfString(str);
        System.out.println("The length of the string \"" + str + "\" is: " + length);
    }

    public static int lengthOfString(String str) {
        if (str.equals("")) {
            return 0; 
        }
        return 1 + lengthOfString(str.substring(1));
    }
    
}
