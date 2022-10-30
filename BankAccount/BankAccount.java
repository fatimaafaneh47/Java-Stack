public class BankAccount{
    public static int numberOfaccounts = 0;
    public static int totalAmount ;
    private double checkingbalance;
    private double savingbalance ;

    public void bankAccount(double checkingbalance, double savingbalance) {
        this.checkingbalance = checkingbalance;
        this.savingbalance = savingbalance;
        numberOfaccounts++;
    }
    public void setCheckingBalance(double newCheckingbalance){
        this.checkingbalance = newCheckingbalance ;
    }
    public double getCheckingBalance(){
        return this.checkingbalance;
    }
    public void setSavingBalance(double newSavingbalance){
        this.savingbalance  = newSavingbalance ;
    }
    public double getSavingBalance(){
        return this.savingbalance;
    }
    public void depositMoneyBalanceaccount(double customerAmount){
        this.checkingbalance=this.checkingbalance + customerAmount; 
        totalAmount+= customerAmount;
    }   
    public void depositMoneySavingaccount(double customerAmount){
        this.savingbalance +=customerAmount;
        totalAmount+= customerAmount;
    }
    public void withdrawMoneyBalanceaccount(double customerAmount){
        if (customerAmount>0){
            this.checkingbalance -=customerAmount;
            totalAmount -=customerAmount;
        }
        else {
            System.out.println("you cant withdraw money");
        }
    }
    
    public void withdrawMoneySavingaccount(double customerAmount){
        if (customerAmount>0){
            this.savingbalance -=customerAmount;
            totalAmount -=customerAmount;
        }
        else {
            System.out.println("you cant withdraw money");
        }
    }
    public double getCustomerAmount(){
        return this.savingbalance + this.checkingbalance ;
    }

    public void display(){
        System.out.println(this.checkingbalance);
        System.out.println(this.savingbalance);
        System.out.println(this.totalAmount);
        System.out.println(this.getCustomerAmount());
    }

}