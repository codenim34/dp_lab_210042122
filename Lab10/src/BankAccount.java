import java.util.ArrayList;
import java.util.List;

class BankAccount {
	private int accountId;
	private double balance;
	private List<String> transactions;

	public BankAccount(int accountId, double initialBalance) {
		this.accountId = accountId;
		this.balance = initialBalance;
		this.transactions = new ArrayList<>();
	}


	public void Deposit(double amount){
		balance+=amount;
		transactions.add("Deposited " + amount);
		System.out.println("Deposited " + amount + " to account " + accountId + ". New balance: " + balance);
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds in account " + accountId);
			return;
		}
		balance -= amount;
		transactions.add("Withdrew " + amount);
		System.out.println("Withdrew " + amount + " from account " + accountId + ". New balance: " + balance);
	}

	public double getBalance(){
		return  balance;
	}

	public List<String> getTransactionHistory() {
		return transactions;
	}
}