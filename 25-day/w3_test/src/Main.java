import java.util.Scanner;
class BankAccount {
    private int balance;
    private String accountNumber;
    private String ownerName;

    public BankAccount(int bal, String ac, String name) {
        this.balance = bal;
        this.accountNumber = ac;
        this.ownerName = name;

    }

    public void getBal() {
        System.out.println("Balance is " + this.balance);
    }

    public void getac() {
        System.out.println("Account " + this.accountNumber);
    }

    public void getname() {
        System.out.println("Owner " + this.ownerName);
    }
}
public class Main {
    public static void helper_function() {
        //make modifications in the code below to accept input
        //Don't forget to enter values in custom input box
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        String z = sc.nextLine();
        int i = 0;
        String[] a = x.split("= ");
        int bal = Integer.parseInt(a[0]);
        a = y.split("= ");
        String b = a[0];
        a = z.split("= ");
        String c = a[0];
        BankAccount ba = new BankAccount(bal, b, c);
        ba.getBal();
        ba.getac();
        ba.getname();

    }

    public static void main(String[] args) {
        helper_function();
    }


}