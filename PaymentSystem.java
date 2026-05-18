import java.util.Scanner;

class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payment Method");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. UPI");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Payment Done Using Cash");
                break;

            case 2:
                System.out.println("Enter Card Number");
                long card = sc.nextLong();
                System.out.println("Payment Done Using Card");
                break;

            case 3:
                System.out.println("Enter UPI ID");
                String upi = sc.next();
                System.out.println("Payment Done Using UPI");
                break;

            default:
                System.out.println("Invalid Option");
        }

        sc.close();
    }
}