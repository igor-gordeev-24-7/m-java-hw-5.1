public class InsufficientFundsException extends BankException {
    private final double balance;
    private final double monetaryTransaction;

    public InsufficientFundsException(String message, double balance, double monetaryTransaction) {
        super(message);
        this.balance = balance;
        this.monetaryTransaction = monetaryTransaction;
    }

    public InsufficientFundsException(double balance, double monetaryTransaction) {
        super("Недостаточно средств. Запрошено: " + monetaryTransaction + ", доступно " + balance);
        this.balance = balance;
        this.monetaryTransaction = monetaryTransaction;
    }
}
