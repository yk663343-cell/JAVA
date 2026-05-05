import java.util.Scanner;

public class VariablesUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int n = sc.nextInt();

        System.out.print("Enter float: ");
        float f = sc.nextFloat();

        System.out.print("Enter double: ");
        double d = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter character: ");
        char ch = sc.nextLine().charAt(0);

        System.out.print("Enter boolean: ");
        boolean b = sc.nextBoolean();

        System.out.println("\nOUTPUT:");
        System.out.println("Integer: " + n);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("String: " + str);
        System.out.println("Character: " + ch);
        System.out.println("Boolean: " + b);

        sc.close();
    }
}