
import java.util.Random;
import java.util.Scanner;

public class Bank{
    static float CurrentBal = 500;

    public static void main(String[] args) {
        System.out.println("Please type 1 for Deposit , type 2 for Withdrawal, type 3 for CheckBal");
        input(args);
    }

    public static void input(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TransactionType = sc.nextInt();
        int money = sc.nextInt();

        if (TransactionType == 1) {
            Deposit_money(money);
        } else if (TransactionType == 2) {
            Withdrawal_money(money);
        } else if (TransactionType == 3) {
            System.out.println("Your current balance is :" + CurrentBal);
        } else {
            System.exit(0);
        }
    }

    static void Withdrawal_money(int money) {
        float a = CurrentBal - money;
        System.out.printf("You have successfully withdrawn money. Your current balance is: %.2f%n", a);
    }

    static void Deposit_money(int money) {
        float b = CurrentBal + money;
        System.out.printf("You have successfully deposited money. Your current balance is: %.2f%n", b);
    }
}
