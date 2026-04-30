class Bank {
    void deposit(int amount) {
        System.out.println("Deposited: " + amount);
    }

    void deposit(int amount, String accountType) {
        System.out.println("Deposited: " + amount + " in " + accountType + " account");
    }

    void deposit(int amount, String accountType, String holderName) {
        System.out.println("Deposited: " + amount + " in " + accountType + " account of " + holderName);
    }
}

public class BankOverloading {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.deposit(5000);
        b.deposit(10000, "Savings");
        b.deposit(15000, "Current", "Yogesh");
    }
}