class Bank{
    //int amount;
    String accname;
   // String  accnumber;
    private double balance;

    public Bank(String accname){
       // this.amount = amount;
        this.balance = 0;
        //this.accnumber = accnumber;
        this.accname = accname;
    }
    //////public double getBalance(){
      //  return balance;
    //}

    //desposit
   static void PerformTransanction(int amount){
       double balance = 0;
       balance = balance + amount;
       System.out.println("Deposited amount:" + balance);

   }
   public void PerformTranscantion(int amount, boolean isWithdrawal) {
        //this.amount = amount;
//double balance = 0;
        if (isWithdrawal) {
            withdrawal(amount);
            System.out.println("withdrawn:"+amount);
        }


   }
      public  void withdrawal ( int amount){
            if (amount <= balance) {
                balance = balance - amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }


public void PerformTranscantion(String fromAccount, String toAccount , int amount) {
       //withdrawal(amount);
    System.out.println("from account:" + fromAccount + " to account:" + toAccount + " amount:" + amount);
   }

   void showdetails(){
       System.out.println(accname);
      // System.out.println(accnumber);
       System.out.println(balance);
   }
}



public class Bankingapplication {
    public static void main(String[] args) {
        Bank bank = new Bank("bhav");
        bank.PerformTransanction(2679);
        bank.PerformTranscantion(250, true);
        bank.PerformTranscantion("628691","76348165",300);

       // bank.showdetails();

    }
}
