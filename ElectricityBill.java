import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Units");
        int units = sc.nextInt();

        int bill = units * 8;

        if(units > 100) {
            bill += 200;
        }

        System.out.println("Electricity Bill = " + bill);

        sc.close();
    }
}