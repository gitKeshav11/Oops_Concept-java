import java.util.Scanner;

class Bank {
    private double bal = 10000;
    private int pwd;

    public void Deposit(double money) {
        System.out.print("Enter Your Bank Password: ");
        Scanner obj = new Scanner(System.in);
        pwd = obj.nextInt();

        if (pwd == 202001) {
            bal += money;
            System.out.println("Deposited Money: " + money);
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect Password...");
        }
    }

    public void Withdraw(double money) {
        System.out.print("Enter Your Bank Password: ");
        Scanner obj = new Scanner(System.in);
        pwd = obj.nextInt();

        if (pwd == 202001) {
            if (money <= bal) {
                bal -= money;
                System.out.println("Withdrawn Money: " + money);
                System.out.println("Total Balance: " + bal);
            } else {
                System.out.println("Insufficient Balance.");
            }
        } else {
            System.out.println("Incorrect Password...");
        }
    }

    public void Check_Bal() {
        System.out.print("Enter Your Bank Password: ");
        Scanner obj = new Scanner(System.in);
        pwd = obj.nextInt();

        if (pwd == 202001) {
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect Password...");
        }
    }
}

public class Encapsulation_Bank {
    public static void main(String[] args) {
        Bank B = new Bank();
        int ch;
        double amount;
        Scanner obj2 = new Scanner(System.in);

        System.out.println("==== Bank Menu ====");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Check Balance");
        System.out.print("Enter Your Choice: ");
        ch = obj2.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                amount = obj2.nextDouble();
                B.Deposit(amount);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                amount = obj2.nextDouble();
                B.Withdraw(amount);
                break;
            case 3:
                B.Check_Bal();
                break;
            default:
                System.out.println("Invalid Choice...");
        }
    }
}
