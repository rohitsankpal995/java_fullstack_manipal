package com.CustomAnno;

public class App {
    public static void demo2() {
        Account ac = new Account();
        GetSetProcessor.generateAccessors(ac);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 Annotations 🔥");

        demo2();
    }
}
