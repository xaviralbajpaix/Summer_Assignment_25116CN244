import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, term = 0;

        if (n == 1) {
            term = 0;
        } else if (n == 2) {
            term = 1;
        } else {
            for (int i = 3; i <= n; i++) {
                term = a + b;
                a = b;
                b = term;
            }
        }

        System.out.println("Nth Fibonacci term: " + term);

        sc.close();
    }
}