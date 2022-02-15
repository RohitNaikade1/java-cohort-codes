class Account {
    int balance;
    String AccountHolder;

    Account(int balance, String AccountHolder) {
        this.balance = balance;
        this.AccountHolder = AccountHolder;
    }
    protected void debit(int amount){
        if(balance-amount<0){
            System.out.println("Debit amount exceeded account balance!");
            return;
        }else{
            balance -= amount;
        }
    }
    protected void credit(int amount){
        
            balance += amount;
        
    }
    void print(){
        System.out.println("Account Holder: "+AccountHolder);
        System.out.println("Account Balance: "+balance);
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        Account a1=new Account(10000,"Rohit Naikade");
        a1.print();
        a1.debit(2000);
        a1.print();
    }
}