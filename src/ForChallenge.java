import java.awt.event.WindowStateListener;

public class ForChallenge {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest  = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("**************************************************************");

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest  = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("**************************************************************");

        int primeCount = 0;
        for (int i = 0; i < 10; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is Prime");
                primeCount++;
            }
            if (primeCount == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
