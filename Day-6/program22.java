import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int base = 1; // 2^0

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal = decimal + lastDigit * base;
            base = base * 2;
            binary = binary / 10;
        }

        System.out.println("Decimal number: " + decimal);

        sc.close();
    }
}