import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal equivalent: " + decimal);
        
        // Manual logic for logic building:
        /*
        int dec = 0, n = 0;
        int b = Integer.parseInt(binary);
        while(b > 0) {
            int temp = b % 10;
            dec += temp * Math.pow(2, n);
            b = b / 10;
            n++;
        }
        */
    }
}