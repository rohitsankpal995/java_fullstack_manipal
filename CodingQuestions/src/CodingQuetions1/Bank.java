package CodingQuetions;
import java.util.Scanner;
class Menu{
    public static void bankMenu(int choice){
        if( choice>=1 && choice<=5) {

            switch(choice) {
                case 1 :

                    System.out.println("your balance is 88888");
                    break;
                case 2 :
                    System.out.println("your money is successfully withrawed");
                    break;
                case 3 :
                    System.out.println("your money is successfully Diposited");
                    break;
                case 4 :
                    System.out.println("your money is successfully transfered");
                    break;
                case 5 :
                    System.out.println("your safely exited");

            }

        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: 1:Balance 2:withdraw 3:Diposit 4:Transfer 5:Exit");
        int choice = sc.nextInt();

        Menu op = new Menu();
        op.bankMenu(choice);



    }
}
