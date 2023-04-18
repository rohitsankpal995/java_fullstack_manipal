import java.util.Arrays;
import java.util.Scanner;
public class IncrementIntegerArrayStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] digits = Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (digits.length > 10 || Arrays.stream(digits).anyMatch(digit -> digit < 0 || digit > 9)) {
            System.out.println("Bad Array");
            return;
        }
        int carry = 1;
        for (int i = digits.length - 1; i >= 0 && carry > 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            digits = newDigits;
        }
        System.out.println(Arrays.toString(digits).replaceAll("\\[|\\]|\\s", ""));
    }
}

