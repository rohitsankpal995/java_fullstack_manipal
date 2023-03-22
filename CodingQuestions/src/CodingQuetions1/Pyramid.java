package CodingQuetions1;


public class Pyramid {

    public static void printPyramid_1(int n) {
       for(int i=1;i<=n;i++)
        {
            for(int j=(n-1);j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
    public static void printPyramid_2(int rows) {
        for (int i = 1; i <= rows; i++) { //o(n)
            int spaces = rows - i; // o(1)
            int stars = 2 * i - 1; // o(1)
            for (int j = 1; j <= spaces; j++) { //o(1)
                System.out.print(" "); // o(1)
            }
            for (int k = 1; k <= stars; k++) { // o(1)
                System.out.print("*"); // o(1)
            }
            System.out.println(); // o(1)
        }
    }
    public static void leftPyrramid(int rows) {
        for (int i = 1; i <= rows; i++) { //o(n)
            int spaces = rows - i; // o(1)
            int stars = 1; // o(1)

            for (int k = 1; k <= i; k++) { // o(1)
                System.out.print("*"); // o(1)
            }
            System.out.println(); // o(1)
        }

    }
    public static void rightPyrramid(int rows) {
        for (int i = 1; i <= rows; i++) { //o(n)
            int spaces = rows - i; // o(1)
            int stars = 2 * i - 1; // o(1)
            for (int j = spaces; j >=i ; j--) { //o(1)
             System.out.print(" "); // o(1)
            }
            for (int k = 1; k <= stars; k++) { // o(1)
                System.out.print("*"); // o(1)
            }
            System.out.println(); // o(1)
        }
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n =5;
        leftPyrramid(5);


    }






}
