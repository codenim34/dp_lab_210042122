import java.util.Map;

public class CreateAccountCommand implements Command{

	private Map<Integer, BankAccount> accounts;
	private int accountId;

	private double initialBalance;

	public CreateAccountCommand(Map<Integer, BankAccount> accounts, int accountId, double initialBalance) {
		this.accounts = accounts;
		this.accountId = accountId;
		this.initialBalance = initialBalance;
	}

	@Override
	public void Execute() {
		if (accounts.containsKey(accountId)) {
			System.out.println("Account " + accountId + " already exists.");
			return;
		}
		accounts.put(accountId, new BankAccount(accountId, initialBalance));
		System.out.println("Created account " + accountId + " with balance " + initialBalance);
	}
}
