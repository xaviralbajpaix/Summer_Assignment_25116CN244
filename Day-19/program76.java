import java.util.Scanner;

public class program76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find principal diagonal sum
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);

        sc.close();
    }
}