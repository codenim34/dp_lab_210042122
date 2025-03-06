import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();

		while (true) {
			System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Transaction History\n6. Exit");
			System.out.print("Enter choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter account ID: ");
					int accId = scanner.nextInt();
					System.out.print("Enter initial balance: ");
					double initialBalance = scanner.nextDouble();
					bank.executeCommand(new CreateAccountCommand(bank.getAccounts(), accId, initialBalance));
					break;
				case 2:
					System.out.print("Enter account ID: ");
					accId = scanner.nextInt();
					BankAccount account = bank.getAccount(accId);
					if (account != null) {
						System.out.print("Enter deposit amount: ");
						double amount = scanner.nextDouble();
						bank.executeCommand(new DepositCommand(account, amount));
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 3:
					System.out.print("Enter account ID: ");
					accId = scanner.nextInt();
					account = bank.getAccount(accId);
					if (account != null) {
						System.out.print("Enter withdrawal amount: ");
						double amount = scanner.nextDouble();
						bank.executeCommand(new WithDrawCommand(account, amount));
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 4:
					System.out.print("Enter account ID: ");
					accId = scanner.nextInt();
					account = bank.getAccount(accId);
					if (account != null) {
						System.out.println("Account Balance: " + account.getBalance());
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 5:
					System.out.print("Enter account ID: ");
					accId = scanner.nextInt();
					account = bank.getAccount(accId);
					if (account != null) {
						System.out.println("Transaction History:");
						for (String transaction : account.getTransactionHistory()) {
							System.out.println(transaction);
						}
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 6:
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
	}
}