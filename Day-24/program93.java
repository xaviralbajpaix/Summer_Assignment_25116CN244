import java.util.Scanner;

public class program93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other.");
        }

        sc.close();
    }
}