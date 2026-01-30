/**
 * TestAccount - A testing program for the account class
 */
public class TestAccount {
    public static void main(String[] args) {
        // This creates two separate accounts with different balances
        Account acc1 = new Account("A001", "Patrick Tobin", 5000);
        Account acc2 = new Account("A002", "Wynne-Anne Tobin", 4000);
        
        // This will display both accounts with the getBalance
        System.out.println("Initial Balances:");
        System.out.println("Patrick's balance: $" + acc1.getBalance());
        System.out.println("Wynne-Anne's balance: $" + acc2.getBalance());
        System.out.println();
        
        // This transfer $1000 between the accounts
        System.out.println("Transferring $1000 from Account 1 to Account 2...");
        acc1.transferTo(acc2, 1000);
        System.out.println();
        
        // This shows the balance again with getBalance
        System.out.println("Final Balances:");
        System.out.println("Account 1 balance: $" + acc1.getBalance());
        System.out.println("Account 2 balance: $" + acc2.getBalance());
    }
}
