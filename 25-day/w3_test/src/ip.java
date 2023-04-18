import java.util.Scanner;

public class ip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter IP Address: ");
        String ipAddress = scanner.nextLine();
        scanner.close();

        if (!isValidIPAddress(ipAddress)) {
            System.out.println("Invalid Address");
            return;
        }

        int a = Integer.parseInt(ipAddress.split("\\.")[0]);
        if (a >= 0 && a <= 126) {
            System.out.println("Class A Address");
        } else if (a >= 128 && a <= 191) {
            System.out.println("Class B Address");
        } else if (a >= 192 && a <= 223) {
            System.out.println("Class C Address");
        } else if (a>= 224 && a <= 239) {
            System.out.println("Class D Address");
        } else if (a >= 240 && a <= 255) {
            System.out.println("Class E Address");
        }
    }

    private static boolean isValidIPAddress(String ipAddress) {
        if (ipAddress == null || ipAddress.isEmpty()) {
            return false;
        }

        String[] octets = ipAddress.split("\\.");
        if (octets.length != 4) {
            return false;
        }

        for (String octet : octets) {
            int value = -1;
            try {
                value = Integer.parseInt(octet);
            } catch (NumberFormatException e) {
                return false;
            }

            if (value < 0 || value > 255) {
                return false;
            }
        }

        return true;
    }
}
