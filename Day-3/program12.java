import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int num1 = a, num2 = b;

        // Find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        // Find LCM
        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}