public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount();
        BankAccount customer2 = new BankAccount();
        
        customer1.setCheckingBalance(1500);
        customer1.setSavingsBalance(10000);
        double customer1Savings = customer1.getSavingsBalance();
        double customer1Checking = customer1.getCheckingBalance();
        double customer1Total = customer1.totalAmount();
        customer1.setDepositMoney(500);
        double customer1Deposit = customer1.depositMoney();

        customer2.setCheckingBalance(1800);
        customer2.setSavingsBalance(20000);
        double customer2Savings = customer2.getSavingsBalance();
        double customer2Checking = customer2.getCheckingBalance();
        double customer2Total = customer2.totalAmount();
        customer2.setWithdrawalMoney(2000);
        double customer2Withdrawal = customer2.withdrawMoney();

        System.out.println(customer1Checking);
        System.out.println(customer1Savings);
        System.out.println(customer1Total);
        System.out.println(customer1Deposit);

        System.out.println(customer2Checking);
        System.out.println(customer2Savings);
        System.out.println(customer2Total);
        System.out.println(customer2Withdrawal);

        System.out.println(accountNumbers);
    }
}