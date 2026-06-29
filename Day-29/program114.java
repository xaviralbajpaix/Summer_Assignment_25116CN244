import java.util.Arrays;
import java.util.Scanner;

class program114 {

    static void display(int arr[], int n) {
        System.out.print("Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void sortArray(int arr[], int n) {
        Arrays.sort(arr, 0, n);
        System.out.println("Array Sorted Successfully.");
    }

    static void search(int arr[], int n, int key) {
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at Index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element Not Found.");
    }

    static void maximum(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];

        System.out.println("Maximum Element = " + max);
    }

    static void minimum(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] < min)
                min = arr[i];

        System.out.println("Minimum Element = " + min);
    }

    static void average(int arr[], int n) {
        int sum = 0;
        for (int x : arr)
            sum += x;

        System.out.println("Average = " + (double) sum / n);
    }

    static void reverse(int arr[], int n) {
        System.out.print("Reversed Array: ");
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      ARRAY OPERATIONS SYSTEM");
        System.out.println("====================================");

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int choice;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Display Array");
            System.out.println("2. Sort Array");
            System.out.println("3. Search Element");
            System.out.println("4. Find Maximum");
            System.out.println("5. Find Minimum");
            System.out.println("6. Find Average");
            System.out.println("7. Reverse Array");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    display(arr, n);
                    break;

                case 2:
                    sortArray(arr, n);
                    display(arr, n);
                    break;

                case 3:
                    System.out.print("Enter Element to Search: ");
                    int key = sc.nextInt();
                    search(arr, n, key);
                    break;

                case 4:
                    maximum(arr, n);
                    break;

                case 5:
                    minimum(arr, n);
                    break;

                case 6:
                    average(arr, n);
                    break;

                case 7:
                    reverse(arr, n);
                    break;

                case 8:
                    System.out.println("System Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 8);

        sc.close();
    }
}