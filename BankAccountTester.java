public class BankAccountTester{
    public static void main(String[] args){
        BankAccount myBankAccount = new BankAccount("Camden", 10000, 0, .0006);
        System.out.println(myBankAccount);

        myBankAccount.deposit(1000);

        myBankAccount.withdrawal(100);

        System.out.println(myBankAccount);
    }
}