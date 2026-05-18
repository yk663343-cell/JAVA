import java.util.Scanner;

class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.println("Enter Username");
        String u = sc.next();

        System.out.println("Enter Password");
        String p = sc.next();

        if(u.equals(username) && p.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }

        sc.close();
    }
}