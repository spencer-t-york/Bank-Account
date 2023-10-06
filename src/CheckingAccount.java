public class CheckingAccount extends BankAccount {
    private int checkLimit;

    public CheckingAccount() {
    }

    public CheckingAccount(String owner, int number, double balance, int checkLimit) {
        setOwner(owner);
        setNumber(number);
        setBalance(balance);
        this.checkLimit = checkLimit;

    }

    public void printBankAccount() {
        System.out.println("Owner: " + getOwner());
        System.out.println("Number: " + getNumber());
        System.out.println("Balance: " + currencyFormatter.format(getBalance()));
        System.out.println("Check Limit: " + checkLimit);
    }
}