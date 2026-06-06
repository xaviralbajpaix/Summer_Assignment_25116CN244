import java.util.Scanner;

public class program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            count += (n & 1); // check last bit
            n = n >> 1;       // right shift
        }

        System.out.println("Number of set bits: " + count);

        sc.close();
    }
}