public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;

        if (balance <= 0) {
            throw new InvalidAmountException(balance);
        }
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException(amount);
        }
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException(amount);
        }

        if (amount > balance) {
            try {
                throw new InsufficientFundsException(balance, amount);
            } catch (InsufficientFundsException e) {
                throw new RuntimeException(e);
            }
        }
        return balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
