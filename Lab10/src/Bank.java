import java.util.HashMap;
import java.util.Map;

class Bank {
	private Map<Integer, BankAccount> accounts = new HashMap<>();

	public void executeCommand(Command command) {
		command.Execute();
	}

	public BankAccount getAccount(int accountId) {
		return accounts.get(accountId);
	}

	public Map<Integer, BankAccount> getAccounts() {
		return accounts;
	}
}
