package Model;

public class DigitalWalletPayment implements PaymentMethod {
    private String walletId;

    public DigitalWalletPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing digital wallet payment of $" + amount + " using wallet ID: " + walletId);
    }
}