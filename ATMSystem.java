import java.util.*;
class Account
{
    private double balance;
    public Account(double initialBalance)
    {
        balance=initialBalance;
    }
    public void depositMoney(double amount)
    {
        balance+=amount;
        System.out.println("amount deposited:" + amount);
    }
    public void withdrawMoney(double amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
            System.out.println("not enough balance!");

        }
    }
    public void showbalance()
    {
        System.out.println("current balance:" + balance);
    }
}
public class ATMSystem {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        Account userAccount= new Account(2000);
        int option;
        do {

            System.out.println("\n=== ATM MENU===");
            System.out.println("1.deposit");
            System.out.println("2.withdraw");
            System.out.println("3.balance");
            System.out.println("4.Exit");
            System.out.println("choose option");
            option=input.nextInt();
            switch(option)
            {
                case 1:
                {
                    System.out.println("enter amount");
                    userAccount.depositMoney(input.nextDouble());
                    break;

                }
                case 2:
                {
                    System.out.println("enter amount");
                    userAccount.withdrawMoney(input.nextDouble());
                    break;
                }
                case 3:
                {
                    userAccount.showbalance();
                    break;
                }
                case 4:
                {
                    System.out.println("Thank you for using ATM!");
                    break;
                }
                default:
                {
                    System.out.println("invalid choice");
                }

            }



        }
        while(option!=4);
    }
}
