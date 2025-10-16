
public class Main {

    public static void main(String[] args) {
        
        Account jaydenAccount = new Account("759231", "Jayden Viene", 5000);
        Account ashishAccount = new Account("856712", "Ashish Kurse", 10000);
        Account vieneAccount = new Account("123190", "Viene", 1200890);
        Account kurseAccount = new Account("421518", "Kurse", 175901);

        Account[] allAccounts = {jaydenAccount, ashishAccount, vieneAccount, kurseAccount};

        //Deposits into Account
        allAccounts[0].deposit(750);
        allAccounts[1].deposit(1500);
        allAccounts[2].deposit(2250);
        allAccounts[3].deposit(3000);
        
        //Withdraws from account
        allAccounts[0].withdraw(10000);
        allAccounts[1].withdraw(10000);
        allAccounts[2].withdraw(10000);
        allAccounts[3].withdraw(10000);


        //Prints out final sums
        System.out.println(allAccounts[0].toString());
        System.out.println(allAccounts[1].toString());
        System.out.println(allAccounts[2].toString());
        System.out.println(allAccounts[3].toString());
    }
}
