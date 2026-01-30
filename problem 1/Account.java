/**
 * Account class that represents a bank account with an id, a name, and a balance.
 * Provides methods for credit, debit, and transfers.
 */
public class Account {
    private String id;
    private String name;
    private int balance = 0;
    
    /**
     * Constructor with id and name parameters, balance defaults to 0
     * @param id The account ID
     * @param name The account holder's name
     */
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    /**
     * The constructor with the id, and the name, and the balance parameters
     * @param id The account ID
     * @param name The account holder's name
     * @param balance The initial balance
     */
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    /**
     * This will gather the accounts ID
     * @return The account ID
     */
    public String getID() {
        return id;
    }
    
    /**
     * This gathers the account holder's name
     * @return The account holder's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * This will gather the current balance
     * @return The current balance
     */
    public int getBalance() {
        return balance;
    }
    
    /**
     * This will add an amount to the balance and returns the new balance
     * @param amount The amount to credit
     * @return The updated balance
     */
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    
    /**
     * This will subtract the amount from the balance if there is any sufficient funds that exist
     * If amount exceeds balance, prints error message
     * @param amount The amount to debit
     * @return The updated balance
     */
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    
    /**
     * Transfers amount to another account if sufficient funds exist
     * If amount exceeds balance, prints error message
     * @param another The destination account
     * @param amount The amount to transfer
     * @return The updated balance of this account
     */
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    
    /**
     * Returns a string representation of the account
     * @return String in format "Account[id=?,name=?,balance=?]"
     */
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
