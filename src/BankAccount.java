import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
    // For currency formatting
    Locale locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    // VARIABLES
    private String owner;
    private int number;
    private double balance;

    // SETTERS
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // GETTERS
    public String getOwner() {
        return owner;
    }
    public int getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }

    // Constructors
    public BankAccount() {
    }

    public BankAccount(String owner, int number, double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    // Display Bank Account Info
    public void printBankAccount() {
        System.out.println("Owner: " + owner);
        System.out.println("Number: " + number);
        System.out.println("Balance: " + currencyFormatter.format(balance));
    }


}