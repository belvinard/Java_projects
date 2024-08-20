public class BankAcount {
    private double balance;

    // Constructor to initialize balance
    public BankAcount(double initialBalance){
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful. New balance : " + balance);
        }else {
            System.out.println("Invalid deposit amount.");
        }

    }

    // Method to withdraw money
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw successful. New balance : " + balance);
        } else if (amount > 0) {
            System.out.println("Insufficient balance");
        }else {
            System.out.println("Ivalid withdraw amount");
        }
    }

    // Method to check balance
    public void checkBalance(){
        System.out.println("Current balance : " + balance);
    }
}
