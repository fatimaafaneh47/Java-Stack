public class BankTest{

    public static void main(String[] args) {
        BankAccount account =new BankAccount(); 
        account.depositMoneyBalanceaccount(4);
        account.depositMoneySavingaccount(5);
        account.depositMoneyBalanceaccount(4);
        account.depositMoneySavingaccount(5);
        account.withdrawMoneySavingaccount(2);
        account.display();            
}
}