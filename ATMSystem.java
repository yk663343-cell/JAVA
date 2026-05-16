class ATM {
    int balance = 5000;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (amount <= balance)
            balance -= amount;
    }

    void showBalance() {
        System.out.println(balance);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.deposit(2000);
        a.withdraw(1000);
        a.showBalance();
    }
}