import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;      // Extract last digit
            reverse = reverse * 10 + digit;
            num = num / 10;            // Remove last digit
        }

        System.out.println("Reversed Number = " + reverse);

        sc.close();
    }
}