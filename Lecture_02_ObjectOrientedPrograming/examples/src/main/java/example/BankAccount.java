package example;

/**
 * This class represents a bank account with basic functionalities.
 *
 * @author John Doe
 * @version 1.0
 */
public class BankAccount {

    /**
     * The account holder's name.
     */
    private String accountHolder;

    /**
     * The current balance of the account.
     */
    private double balance;

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount The amount to deposit.
     * @throws IllegalArgumentException If the deposit amount is negative.
     */
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amount;
    }
    // ... other methods with Javadoc comments ...
}