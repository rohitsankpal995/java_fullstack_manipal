package Swap;

public class Swap_Num {
    public static void swap_numbers(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swaping :: a= " + a + " and b = " + b);
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("before swaping :: a= " + a + " and b = " + b);


    }
}
