import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Matthew", 50.00);
        Account account2 = new Account("Olivia" , -7.53);

        System.out.printf("%s balance: $%.2f%n" , account1.getName() , account1.getBalance());

        System.out.printf("%s balance: $%.2f%n" , account2.getName() , account2.getBalance());

        Scanner input = new Scanner(System.in);

        // Add to account 1
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount); // add to account1's balance
        account1.deposit(depositAmount); // add to account1 balance

        //Display Balances
        System.out.printf("%s balance $%.2f%n", account1.getName() , account1.getBalance());

        System.out.printf("%s balance $%.2f%n", account2.getName() , account2.getBalance());

        // Add to Account 2
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount); // add to account2's balance
        account2.deposit(depositAmount); // add to account2 balance

        //Withdraw for account1
        System.out.print("Enter amount to withdraw from account 1: ");
        double withdrawAmount = input.nextDouble();
        account1.debit(withdrawAmount);
        System.out.printf("%s balance $%.2f%n", account1.getName() , account1.getBalance()); //Displays Balance

        //Withdraw for account2
        System.out.print("Enter amount to withdraw from account 2: ");
        withdrawAmount = input.nextDouble();
        account2.debit(withdrawAmount);
        System.out.printf("%s balance $%.2f%n", account1.getName() , account2.getBalance()); //Displays Balance


    }
}
