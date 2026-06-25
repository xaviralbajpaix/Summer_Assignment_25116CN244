import java.util.Scanner;

public class program97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter sorted elements of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        System.out.println("Enter sorted elements of second array:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        while (i < n) {
            merged[k++] = a[i++];
        }

        while (j < m) {
            merged[k++] = b[j++];
        }

        System.out.println("Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}