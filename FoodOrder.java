import java.util.Scanner;

class FoodOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Pizza - 200");
        System.out.println("2. Burger - 100");
        System.out.println("3. Fries - 80");

        int total = 0;

        System.out.println("Choose Item");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                total = 200;
                break;

            case 2:
                total = 100;
                break;

            case 3:
                total = 80;
                break;

            default:
                System.out.println("Invalid Item");
        }

        if(total > 0) {
            System.out.println("Total Bill = " + total);
        }

        sc.close();
    }
}