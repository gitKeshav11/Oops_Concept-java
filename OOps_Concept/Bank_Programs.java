

import java.util.Scanner;

abstract class Bankes {
    public String name = "State Bank Of India";
    public String ifsc = "My Bank 123";

    public void bankDetails() {
        System.out.println("Bank Name: " + name + " | IFSC Code: " + ifsc);
    }

    abstract void deposit();
    abstract void withdraw();
    abstract void checkBalance();
}

class BankService extends Bankes {
    private double balance = 15000;
    private final int correctPassword = 202001;

    private final Scanner sc = new Scanner(System.in); // Reuse the scanner

    @Override
    public void deposit() {
        System.out.print("Enter your bank password: ");
        int pwd = sc.nextInt();

        if (pwd == correctPassword) {
            System.out.print("Enter deposit amount: ");
            double money = sc.nextDouble();
            balance += money;
            System.out.println("Deposited: " + money);
            System.out.println("Total Balance: " + balance);
        } else {
            System.out.println("Incorrect Password...");
        }
    }

    @Override
    public void withdraw() {
        System.out.print("Enter your bank password: ");
        int pwd = sc.nextInt();

        if (pwd == correctPassword) {
            System.out.print("Enter withdraw amount: ");
            double money = sc.nextDouble();
            if (money <= balance) {
                balance -= money;
                System.out.println("Withdrawn: " + money);
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Funds.");
            }
        } else {
            System.out.println("Incorrect Password...");
        }
    }

    @Override
    public void checkBalance() {
        System.out.print("Enter your bank password: ");
        int pwd = sc.nextInt();

        if (pwd == correctPassword) {
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Incorrect Password...");
        }
    }
}

 class Customers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        bank.bankDetails();



        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bank.deposit();
                    break;
                case 2:
                    bank.withdraw();
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our service!");
                    sc.close(); // Clean up the scanner
                    return;
                default:
                    System.out.println("Invalid Choice...");
            }
        }
    }
}
