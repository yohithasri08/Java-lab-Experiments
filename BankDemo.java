// Abstract class demonstrating Abstraction
abstract class BankAccount {

    // Encapsulated private members
    private int accountNumber;
    private double balance;

    // Static member
    static String bankName = "ABC Bank";

    // Non-static member
    String accountHolder;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access private balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify private balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        }
    }

    // Abstract method
    abstract void displayAccountType();

    // Public method
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Child class
class SavingsAccount extends BankAccount {

    // Constructor
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Implementing abstract method
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

// Main class
public class BankDemo {

    public static void main(String[] args) {

        // Creating object
        SavingsAccount account =
            new SavingsAccount(1001, "Anu", 5000);

        // Calling non-static methods
        account.displayDetails();
        account.displayAccountType();

        System.out.println();

        // Calling method to deposit money
        account.deposit(2000);

        System.out.println("Updated Balance: " + account.getBalance());

        // Accessing static member
        System.out.println("Bank Name using static member: "
                           + BankAccount.bankName);
    }
}