import java.util.InputMismatchException;
import java.util.Scanner;

// User-defined exception
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Main class
public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            // User-defined exception
            if (amount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient balance for withdrawal."
                );
            }

            // Built-in exception demonstration
            if (amount == 0) {
                throw new ArithmeticException(
                    "Withdrawal amount cannot be zero."
                );
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + balance);

        }

        // Handling user-defined exception
        catch (InsufficientBalanceException e) {
            System.out.println("User-defined Exception: "
                               + e.getMessage());
        }

        // Handling built-in exception
        catch (ArithmeticException e) {
            System.out.println("Built-in Exception: "
                               + e.getMessage());
        }

        // Handling invalid input
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }

        // Always executed
        finally {
            System.out.println("Transaction process completed.");
            sc.close();
        }
    }
}