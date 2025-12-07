
public class InvalidAmountException extends RuntimeException {
    private final double invalidAmount;

    public InvalidAmountException(String message, double invalidAmount) {
        super(message);
        this.invalidAmount = invalidAmount;
    }

    public InvalidAmountException(double amount) {
        super("Некорректная сумма операции: " + amount +
                ". Сумма должна быть больше 0.");
        this.invalidAmount = amount;
    }
}