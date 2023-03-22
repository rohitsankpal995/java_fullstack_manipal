package Fahrenheit_to_celcius;

public class Fahrenheit_to_celsius {
    public static float ferToCel(float Fahrenheit){
         float celsius = ((Fahrenheit-32)*5)/9;
         return celsius;
    }

    public static void main(String[] args) {
        int Fahrenheit =90;
        System.out.println(ferToCel(Fahrenheit));
    }


}
