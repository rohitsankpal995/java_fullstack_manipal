import java.util.Scanner;

public class IncrementIntegerArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input as a comma-separated string
        System.out.print("Enter comma-separated integer array: ");
        String input = scanner.nextLine();

        // Split the string into integer array
        String[] numbers = input.split(",");
        int[] digits = new int[numbers.length];

        // Convert each string element into integer and store in digits array
        for (int i = 0; i < numbers.length; i++) {
            digits[i] = Integer.parseInt(numbers[i]);
        }

        // Validate the digits array
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 0 || digits[i] > 9) {
                System.out.println("Bad Array");
                return;
            }
        }

        // Increment the last digit by 1 and check for carry
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        // If there's a carry left after the loop, create a new array with an additional digit
        if (carry > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            digits = newDigits;
        }

        // Print the resulting integer array as comma-separated string
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print(",");
            }
        }
    }
}

