package Fahrenheit_to_celcius;

public class Main {

        public static void main(String[] args) {
            TempConverter converter = new TempConverter(90);
            System.out.println("Temp in Fah "+ converter.clesToFah());
        }
}
