import java.util.Scanner;

public class program62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxFreq = 0;
        int maxElement = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element = " + maxElement);
        System.out.println("Frequency = " + maxFreq);

        sc.close();
    }
}