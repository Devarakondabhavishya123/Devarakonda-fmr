import java.util.Scanner;

class Account{
   private int id;
   private String accountType;
   private double balance;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;

    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(){
    this.id=0;
    this.accountType="default";
    this.balance=0.0;


}
public Account(int id, String accountType, double balance){
    this.id = id;
    this.accountType = accountType;
    this.balance = balance;
}
public boolean withdraw(double amount){
    if(balance >= amount){
        balance -= amount;
        return true;
    }

        return false;

}
public String getdetails(){
    return ("Account id: "+id+"  Account type:  "+accountType+  "  Balance:  "+balance);

}

}



public class AccountDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account id:");
       int  id=sc.nextInt();
       System.out.println("Enter the account type:");
       String accountType=sc.next();
       System.out.println("Enter the account balance:");
       double balance=sc.nextDouble();

        Account a = new Account(id,accountType,balance);
        System.out.println(a.getdetails());
        System.out.println("Enter the amount to be withdrwan:" );
        double amount=sc.nextDouble();
       // System.out.println(a.getdetails());
        if(a.withdraw(amount)){
            System.out.println("new balnce:"+ a.getBalance());}
            else{
                System.out.println("insuufcient");

            }
        }

    }

