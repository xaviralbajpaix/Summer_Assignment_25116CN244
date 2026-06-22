import java.util.Scanner;

public class program88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.replace(" ", "");

        System.out.println("String after removing spaces: " + result);

        sc.close();
    }
}