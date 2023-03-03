package ATM;

import java.util.Scanner;

public class PinLockout {

    Scanner scanner = new Scanner(System.in);
    int pin = 1234;
    int tries = 0;
    public PinLockout() {
        System.out.println("ENTER YOUR PIN: ");

        int entry = scanner.nextInt();
        tries++;

        while (entry != pin && tries < 3) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = scanner.nextInt();
            tries++;
        }
        if (entry == pin) {
            System.out.println("\nPIN ACCEPTED. ACCESS GRANTED.");
        } else if (tries >= 3) {
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
        }
    }
}
