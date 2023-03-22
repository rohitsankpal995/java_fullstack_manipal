package CodingQuetions;

class StaticDemo {
    public static int x; // static variable
    private static int q =20;
    public static int count = 0;

    public static class InnerClass {
        public void printQ() {
            System.out.println(q); // access the private member of the outer class
        }
    }

    static { // static block
        x = 10;
    }
    static void m1() //static method
    {
        System.out.println("from m1");
        count=5;
        System.out.println(count);
    }

}
public class Static {
    public static void main(String[] args) {
        System.out.println(StaticDemo.x);
        StaticDemo.m1();



    }
}
