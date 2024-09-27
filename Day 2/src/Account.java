class account {
    private int accnum;
    private String accname;
    private float balance;

    public account(int accnum, String accname, float balance) {
        this.accnum = accnum;
        this.accname = accname;
        this.balance = balance;

    }

    void deposit(float bal) {
        balance += bal;
        // System.out.println("Deposit done");
    }

    void withdraw(float bal) {
        if (bal < balance) {
            balance -= bal;
        } else {
            System.out.println("Withdraw done");
        }
    }

    void checkBalance() {
        System.out.println("Checking balance");
    }

    public class Account {
        public static void main(String[] args) {
            account acc = new account(10003, "slavish", 6000);
            acc.checkBalance();
            acc.deposit(2000);
            acc.checkBalance();
            acc.withdraw(7000);
            acc.checkBalance();
        }
    }
}