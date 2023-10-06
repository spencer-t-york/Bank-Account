/* Name: Spencer York
 * CSU ID: 2834131
 * CIS 265: Assignment #3
 * Description: Create bank accounts, which may be checking accounts or savings accounts, store them in an ArrayList, and search the accounts.
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class YorkAssignment3 {
    public static void main(String[] args) {
        boolean checkingAccount = false;
        int accountNum = 0;

        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> account = new ArrayList<>(accountNum);

        do {
            System.out.print("Do you want to create more accounts? (Y or N): ");
            String answer = input.next();
            if (Objects.equals(answer, "Y") || Objects.equals(answer, "y")) {
                accountNum++;
            } else if ((Objects.equals(answer, "N") || Objects.equals(answer, "n"))){
                break;
            } else {
                System.out.println("no");
                break;
            }


            System.out.print("Is account " + accountNum + " a checking account or a savings account? (C or S): ");
            String answer2 = input.next();
            if (Objects.equals(answer2, "C") || Objects.equals(answer2, "c")) {
                // Enter Owner Data
                System.out.print("Enter account " + accountNum + " owner (First and Last name): ");
                String owner = input.next();
                owner += " " + input.next();
                input.nextLine(); // Consume new line

                // Enter Account Number
                boolean duplicate = false;
                int number = 0;
                System.out.print("Enter account " + accountNum + " number: ");
                number = input.nextInt();

                // Enter Account Balance Data
                System.out.print("Enter account " + accountNum + " balance: ");
                int balance = input.nextInt();

                // Enter Check Limit
                System.out.print("Enter account " + accountNum + " check limit: ");
                int checkLimit = input.nextInt();

                account.add(new CheckingAccount(owner, number, balance, checkLimit));

            } else if (Objects.equals(answer2, "S") || Objects.equals(answer2, "s")) {
                // Enter Owner Data
                System.out.print("Enter account " + accountNum + " owner (First and Last name): ");
                String owner = input.next();
                owner += " " + input.next();
                input.nextLine(); // Consume new line

                // Enter Account Number
                boolean duplicate = false;
                int number = 0;
                System.out.print("Enter account " + accountNum + " number: ");
                number = input.nextInt();

                // Enter Account Balance Data
                System.out.print("Enter account " + accountNum + " balance: ");
                int balance = input.nextInt();

                // Enter Account Interest Rate
                System.out.print("Enter account " + accountNum + " interest rate: ");
                double interest = input.nextDouble();

                account.add(new SavingsAccount(owner, number, balance, interest));
            }
        } while (true);


        // ------------------------ SEARCHING ------------------------ //
        if (accountNum == 0) {
            System.out.println("Goodbye!");
        } else {
            do {
                boolean match = false;
                System.out.print("Enter an account number to search (enter -1 to quit): ");
                int userNum = input.nextInt();

                if (userNum == -1) {
                    System.out.println("Goodbye!");
                    break;
                }
                // Loop through accounts array to find a match and display account information
                for (BankAccount element : account) {
                    if (element.getNumber() == userNum) {
                        element.printBankAccount();
                        match = true;
                    }
                }
                if (!match) {
                    System.out.println("Account " + userNum + " not found.");
                }
            } while (true); // repeats until -1 is entered...
        }
    }

}
