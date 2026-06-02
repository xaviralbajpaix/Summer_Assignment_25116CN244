import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            sum += num % 10; // Extract last digit and add to sum
            num /= 10;       // Remove last digit
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}