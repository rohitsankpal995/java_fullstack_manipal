package com.ani.CodingQuetions;

public class TypeCheckerMain {
    public static void main(String[] args) {
        TypeChecker ob = new TypeChecker();
        Object obj1 = "Hello";
        Object obj2 = 123;
        Object obj3 = true;
        Object obj4 = null;


        ob.checkInstance(null);
        ob.checkInstance(obj2);
        ob.checkInstance( obj3);
        ob.checkInstance( new Car());
        ob.checkInstance( obj4);
    }
}
