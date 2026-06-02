import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num != 0) {
            int digit = num % 10;   // Extract last digit
            product = product * digit;
            num = num / 10;         // Remove last digit
        }

        System.out.println("Product of digits = " + product);

        sc.close();
    }
}