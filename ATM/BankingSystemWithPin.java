package ATM;

import java.util.Scanner;

public class BankingSystemWithPin {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("RO29455302311322", 200, "1234");
        BankAccount bankAccount2 = new BankAccount("RO43593530521134", 600, "7530");
        BankAccount[] bankAccounts = {bankAccount1, bankAccount2};
        Scanner scanner = new Scanner(System.in);
        Menu.welcome();
        String pin = scanner.nextLine();
        BankAccount currentBankAccount = BankingSystemWithPin.getBankAccountByPin(bankAccounts, pin);
        ATM.useATM(currentBankAccount);
    }
    public static BankAccount getBankAccountByPin(BankAccount[] bankAccounts, String pin) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.pin.equals(pin)) {
                return bankAccount;
            } else if (!bankAccount.pin.equals(pin) ) {
                System.out.println("Wrong Pin. Try Again.");
            }
        }
        return null;
    }
}
