import java.util.Scanner;
public class EmailPasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            System.out.println("error Invalid Creds");
            return;
        }
        String password = scanner.nextLine();
        if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{5,}$")) {
            System.out.println("error Invalid Creds");
            return;
        }
        System.out.println("Let's Go!");
    }
}
