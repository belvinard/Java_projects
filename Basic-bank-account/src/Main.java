import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the bank account with the starting balance
        BankAcount account = new BankAcount(2000.00);

        while(true){
            System.out.println("\nBank Account Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter amount to deposit : ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw : ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid option. Please choose again");
            }
        }



    }
}