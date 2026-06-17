import java.util.HashSet;
import java.util.Scanner;

public class program66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Find union
        HashSet<Integer> union = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            union.add(arr1[i]);
        }

        for (int i = 0; i < n2; i++) {
            union.add(arr2[i]);
        }

        // Display union
        System.out.println("Union of arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}