package com.ani.CodingQuetions;
import java.util.Scanner;
public class AccessArrayPos {
    private final Scanner sc = new Scanner(System.in);
    public  void accessArrayPos() {

            int[] arr = {10, 20, 30, 40, 50};
            System.out.println("Enter the position you want to access the element");
            int position=0;
            try {
                 position = sc.nextInt();
                int data = arr[position];
                System.out.println("Data at position " + position + " is " + data);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid position specified: " + position);
            }

    }
}
