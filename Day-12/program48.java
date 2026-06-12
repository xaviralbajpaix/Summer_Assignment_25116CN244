import java.util.Scanner;

public class program48 {

    static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfect(num))
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");

        sc.close();
    }
}