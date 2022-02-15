import java.util.Scanner;

class BankAccount {
    int accNo;
    String accHolder;
    double accBalance;

    BankAccount() {
        accNo = 0;
        accHolder = "";
        accBalance = 0.0;
    }

    BankAccount(int accNo, String accHolder, double accBalance) {
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.accBalance = accBalance;
    }

    public String toString(){
        return "Account Number: "+accNo + " Account Holder Name: "+accHolder + " Account Balance: "+accBalance;
    }

    public void extras(){

    }

    public BankAccount copy(){
        return new BankAccount(this.accNo, this.accHolder, this.accBalance);
    }
    
}

class savingsAccount extends BankAccount {
    double rateOfInterest;

    savingsAccount() {
        super();
        rateOfInterest = 0.0;
    }

    savingsAccount(int accNo, String accHolder, double accBalance, double rateOfInterest) {
        super(accNo, accHolder, accBalance);
        this.rateOfInterest = rateOfInterest;
    }

    public String toString(){
        return super.toString()+  " Rate of Interest: "+rateOfInterest;
    }    

    public void getYearlyInterest() {
        System.out.println("Yearly Interest: " + getComputedInterest(1));
    }
    public double getComputedInterest(int years) {

        return (accBalance*rateOfInterest*years);
    }
}

class currentAccount extends BankAccount {
    double avgDailyTransactions;

    currentAccount() {
        avgDailyTransactions = 0.0;
    }

    currentAccount(int accNo, String accHolder, double accBalance,double avgDailyTransactions) {
        super(accNo,accHolder,accBalance);
        this.avgDailyTransactions = avgDailyTransactions;
    }

    public void getYearlyTransaction(){
        System.out.println("Yearly Transaction: "+ getTotalTransactionAmount(365));
    }
    public double getTotalTransactionAmount(int days){
        return (days*avgDailyTransactions);
    }
    public String toString(){
        return super.toString() + "Avg. Daily Transactions: "+avgDailyTransactions;
    }
}


public class Account {

    public static BankAccount generator(int accNo,String name,double balance){
        return new BankAccount(accNo,name,balance){
            double salary=120000.00;
            double pfAmount=2000.00;
            static double incomeTax=12;
    
            public double yearlyTax(){
                return this.salary*12*incomeTax/100;
            }
    
            public double inHand(){
                return (salary * 12) - yearlyTax() - (pfAmount * 12);
            }
            public void extras(){
                System.out.println("Yearly tax: "+yearlyTax());
                System.out.println("inHand salary: "+inHand());
            }
            public String toString() {
                return super.toString() + " Salary: "+salary+" pfAmount: "+pfAmount+" incomeTax: "+incomeTax;
            }
        };
    }
    public static void main(String[] args) {

       Scanner s1 = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=s1.nextInt();

        BankAccount[] accArray=new BankAccount[n];
        savingsAccount[] savingsArray=new savingsAccount[n];
        currentAccount[] currAray=new currentAccount[n];
        BankAccount[] salary=new BankAccount[n];

        for(int i=0;i<n;i++){
            accArray[i]=new BankAccount(i,"bank"+i,10000);
            savingsArray[i]=new savingsAccount(i,"savings"+i,10000,9.2);
            currAray[i]=new currentAccount(i,"current"+i,10000,100);
            salary[i]=generator(i,"salary"+i,10000);
        }

        for(int i=0;i<n;i++){
            System.out.println(accArray[i]);
            System.out.println(savingsArray[i]);
            System.out.println(currAray[i]);
            System.out.println(salary[i]);
        }

        BankAccount b1=new BankAccount(123,"Rohit",12000);
        System.out.println(b1);
        BankAccount b2=b1.copy();
        System.out.println(b2);
    }
}
