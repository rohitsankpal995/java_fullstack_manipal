import java.util.Scanner;

public class Main {
    public static void helperFunction(){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        try{
            System.out.println("Division is "+ a/b);
        }catch (ArithmeticException e){
            System.out.println("Exception caught: " +e);
        }
    }
    public static void main(String[] args) {
        helperFunction();
    }
}