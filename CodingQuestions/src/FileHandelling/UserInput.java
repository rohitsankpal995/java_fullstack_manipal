package FileHandelling;
import java.io.*;
public class UserInput {
    public  void bufferReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
           // String name = reader.readLine();
            String name =reader.readLine();
            System.out.println("Hello, " + name + "!");

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("You are " + age + " years old.");

            System.out.print("Enter your favorite color: ");
            String color = reader.readLine();
            System.out.println("Your favorite color is " + color + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





