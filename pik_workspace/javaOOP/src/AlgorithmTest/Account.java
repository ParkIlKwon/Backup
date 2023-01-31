package AlgorithmTest;

/**
 * This class represents a bank account whose current balance is a nonnegative
 * amount in US dollars.
 */
public class Account {
	private int balance;
	private Account acc;
	
    /** Initialize an account with the given balance. */
    public Account(int balance) {
        this.balance = balance;
    }
    
    public Account(int balance,Account account) {
    	this.balance = balance;
    	acc = account;
    }
    
    /** Returns the balance for the current account. */
    public int getBalance() {
        return balance;
    }

    /** Deposits amount into the current account. */
    public void deposit(int amount) {
        // TODO

    }

    /**
     * Subtract amount from the account if possible. If subtracting amount
     * would leave a negative balance, print an error message and leave the
     * balance unchanged.
     */
    public boolean withdraw(int amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		} else {
			if (acc != null) {
				acc.balance = balance + acc.balance - amount;  
				balance = 0;
				return true;
			}
			return false;
		}
    	
    }

    /**
     * Merge account other into this account by removing all money from other
     * and depositing it into this account.
     */
    public void merge(Account other) {
    	balance += other.balance;
    	other.balance = 0;
    	
    	
    }
	
}




