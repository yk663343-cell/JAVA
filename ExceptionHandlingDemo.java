import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter two numbers for division: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int result = a / b;
            System.out.println("Result: " + result);
            
            int[] arr = new int[2];
            arr[5] = 100;
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds! " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
            sc.close();
        }
    }
}