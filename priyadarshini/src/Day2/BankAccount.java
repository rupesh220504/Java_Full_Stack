package Day2;
class BankAccount {
    private double balance = 5000;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(2000);
        acc.withdraw(1000);
        System.out.println("Balance: " + acc.getBalance());
    }
}

