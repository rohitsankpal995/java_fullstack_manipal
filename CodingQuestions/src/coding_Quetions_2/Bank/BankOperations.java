package coding_Quetions_2.Bank;


import java.util.Scanner;

class BMenu {

    private Scanner scanner;

    public BMenu() {
        scanner = new Scanner(System.in);
    }

    private void displayMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("🔥 Bank Menu 🔥")
                .append("\n")
                .append("-------------------")
                .append("\n")
                .append("Select Your Choice")
                .append("\n")
                .append("-------------------")
                .append("\n")
                .append("1. Balance")
                .append("\n")
                .append("2. Withdraw")
                .append("\n")
                .append("3. Deposit")
                .append("\n")
                .append("4. Transfer")
                .append("\n")
                .append("5. Exit")
                .append("\n")
                .append("\n")
                .append("👉 Enter your Choice : ");

        System.out.println(builder.toString());
    }

    public void performAction() {

        while(true) {
            displayMenu();
            int ch = scanner.nextInt();

            if(ch >= 5 ) {
                System.out.println("\n 🙏 Thanks for using our services");
                break;
            } else {
                if(ch == 1) {
                    System.out.println("\n 👏 You selected Balance \n");
                } else if(ch == 2) {
                    System.out.println(" \n 👏 You selected Withdraw \n ");
                } else if( ch == 3) {
                    System.out.println("\n 👏 You selected Deposit \n");
                } else {
                    System.out.println("\n 👏 You selected Transfer \n");
                }
            }
        }
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
public class BankOperations {
    public static void main(String[] args) {


    }
}
