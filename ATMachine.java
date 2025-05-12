import java.util.Scanner;

public class ATMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        System.out.println("Welcome to Madadgar Bank!!");
        System.out.println("Set your PIN:");
        int pin = sc.nextInt();

        System.out.println("if you want to continue");
        System.out.println("Press 1");
        int con = sc.nextInt();
        System.out.println("if you not want to continue");
        System.out.println("Press 2");

        if (con == 1) {
            System.out.println("Enter PIN:");
            int x = sc.nextInt();
            if (pin == x) {
                menu(balance);
            } else {
                System.out.println("Invalid PIN. TRY again!!");
            }
        } else {
            System.out.println("Thanks for Visiting!!!");
        }
    }

    public static void menu(int balance) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please Select:");
            System.out.println("Press 1 to Check A/C Balance");
            System.out.println("Press 2 to Deposit Money");
            System.out.println("Press 3 to Withdraw Money");
            System.out.println("Press 4 to Exit");

            System.out.println("PRESS:");
            int press = sc.nextInt();

            if (press == 1) {
                account(balance);
            } else if (press == 2) {
                balance = deposit(balance);
            } else if (press == 3) {
                balance = withdraw(balance);
            } else if (press == 4) {
                System.out.println("Thanks for using Madadgar Bank. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void account(int balance) {
        System.out.println("Account Balance: " + balance);
    }

    public static int deposit(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of money to be deposited:");
        int deposit = sc.nextInt();
        balance += deposit;
        System.out.println("Total Balance: " + balance);
        return balance;
    }

    public static int withdraw(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of money to be withdrawn:");
        int withdraw = sc.nextInt();

        if (withdraw > balance) {
            System.out.println("Insufficient balance. Transaction failed.");
        } else {
            balance -= withdraw;
            System.out.println("Transaction successful. Total Balance: " + balance);
        }
        return balance;
    }
}
