public class Account {
    private int  accnum;
    private String accname;
    private float balance;

public Account(int accnum, String accname, float balance) {
    this.accnum = accnum;
    this.accname = accname;
    this.balance = balance;

}
    void deposit(float bal){
       balance += bal;
       // System.out.println("Deposit done");
    }
    void withdraw(float bal){
    if(bal < balance){
        balance -= bal;
    }
        System.out.println("Withdraw done");
    }
    void checkBalance(){
        System.out.println("Checking balance");
    }

public static void main(String[]args) {
        Account account = new Account();
        account.deposit();
        account.withdraw();
        account.checkBalance();
}
}