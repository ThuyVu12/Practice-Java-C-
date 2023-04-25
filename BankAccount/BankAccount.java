public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private double depositMoney;
    private double withdrawMoney;

    public static int numberOfAccounts = 0;
    
    static double totalAmount = 0;

    //Getters and Setters
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checking) {
        checkingBalance = checking;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savings) {
        savingsBalance = savings;
    }

    //Total Amount
    public String totalAmount(double checkingBalance, double savingsBalance) {
        totalAmount = checkingBalance + savingsBalance;
        return "The total amount of money is " + totalAmount;
        numberOfAccounts++;
    }

    public static int accountNumbers() {
        return numberOfAccounts;
        System.out.println(numberOfAccounts);
    }

    public double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(double deposit) {
        depositMoney = deposit;
    }

    public void depositMoney(double deposit) {
        System.out.println(checkingBalance + deposit);
        System.out.println(totalAmount + deposit);
    }

    public double getWithdrawalMoney() {
        return withdrawMoney;
    }

    public void setWithdrawalMoney(double withdrawal) {
        withdrawMoney = withdrawal;
    }

    public void withdrawMoney(double withdrawal) {
        if (withdrawal > checkingBalance) {
            System.out.println("Balance is not enough!!");
        } else {
            System.out.println("Checking Balance: $" + (checkingBalance - this.getWithdrawalMoney()));
            System.out.println("Total Balance: $" + (totalAmount - this.getWithdrawalMoney()));
        }
    }
}