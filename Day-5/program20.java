import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largestPrimeFactor = 0;

        // Remove all factors of 2
        while (num % 2 == 0) {
            largestPrimeFactor = 2;
            num = num / 2;
        }

        // Check odd factors
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestPrimeFactor = i;
                num = num / i;
            }
        }

        // If remaining number is a prime > 2
        if (num > 2) {
            largestPrimeFactor = num;
        }

        System.out.println("Largest Prime Factor is: " + largestPrimeFactor);

        sc.close();
    }
}