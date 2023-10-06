public class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount() {
    }

    public SavingsAccount(String owner, int number, double balance, double interest) {
        setOwner(owner);
        setNumber(number);
        setBalance(balance);
        this.interest = interest;

    }

    public void printBankAccount() {
        System.out.println("Owner: " + getOwner());
        System.out.println("Number: " + getNumber());
        System.out.println("Balance: " + currencyFormatter.format(getBalance()));
        System.out.println("Interest Rate: " + interest + "%");
    }
}
