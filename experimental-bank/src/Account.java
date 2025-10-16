public class Account {

    //Instance Fields
    private String accountNumber;
    private String accountHolder;
    private double balance;

    //Creates the inital account with a accountNumber, accountHolder, and initialBalance
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    //gets the Account Number
    public String getAccountNumber() {
        return accountNumber;
    }

    //gets the Account Holder
    public String getAccountHolder() {
        return accountHolder;
    }

    //gets the Balance
    public double getBalance() {
        return balance;
    }

    //Depostits into the Account
    public void deposit(double amount) {
        
        if(amount != 0 && amount < 0) {
            balance = balance + amount;
            System.out.println("New Balance " + balance + " --- " + accountNumber);
        }

    }

    public boolean withdraw(double amount) {
        
        //Make's sure that amount is positive
        if (amount > 0) {

            //Then will make sure that you can withdraw that amount
            if(balance >= amount) {
                //Takes away the balance from the amount
                balance -= amount;

                //Prints out message to console
                System.out.println("New Balance " + balance + " --- " + accountNumber);
                
                return true;
            } else {
                //Prints out error message if you cannot draw that amount
                System.out.println("Insuffient Funds -- Current Balance " + balance + " for " + accountNumber);
            }
        }
        return false;
    }

    //Returns the amount with the Account Number and Account Holder.
    public String toString() {
        return "Account " + accountNumber + " -- " + accountHolder + " -- " + balance;
    }
}
