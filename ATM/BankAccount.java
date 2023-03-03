package ATM;

public class BankAccount {
    String IBAN;
    int balance;
    String pin;

    public BankAccount(String IBAN, int balance, String pin) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.pin = pin;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            System.out.println("You withdrew " + amount);
        } else {
            System.out.println("Not enough money. ");
        }
    }
}
