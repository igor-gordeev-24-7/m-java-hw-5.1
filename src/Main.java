import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("111", "Lexa", 3);
        bankAccount1.deposit(4);
        bankAccount1.withdraw(22);
        System.out.println(bankAccount1.toString());
    }
}