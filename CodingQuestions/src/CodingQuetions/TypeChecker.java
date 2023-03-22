package com.ani.CodingQuetions;
class Car{

}
class Animal{

}
public class TypeChecker {

        public  void checkInstance(Object obj) {
            try {
                if (obj instanceof String) {
                    System.out.println("It is a String type");
                } else if (obj instanceof Integer) {
                    System.out.println("It is a int type");

                } else if (obj instanceof Boolean) {
                    System.out.println("It is a Boolean type");
                } else if (obj instanceof Car) {
                    System.out.println("It is a car type");
                } else if (obj instanceof Animal) {
                    System.out.println("It is a Animal type");
                }
                else if(obj == null){
                   throw new NullPointerException();
                }

                else{
                    System.out.println("Instance is of an unknown type");
                }
            } catch(NullPointerException e) {
                System.out.println("Error: Object is null");
            }
        }


}
