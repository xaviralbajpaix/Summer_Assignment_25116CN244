import java.util.Scanner;

class program115 {

    static void reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);

        System.out.println("Reversed String: " + rev);
    }

    static void palindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);

        if (s.equalsIgnoreCase(rev))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome");
    }

    static void vowels(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u')
                count++;
        }

        System.out.println("Total Vowels = " + count);
    }

    static void frequency(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0)
                System.out.println((char) i + " : " + freq[i]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     STRING OPERATIONS SYSTEM");
        System.out.println("====================================");

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int choice;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Display String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Check Palindrome");
            System.out.println("6. Count Vowels");
            System.out.println("7. String Length");
            System.out.println("8. Character Frequency");
            System.out.println("9. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("String = " + str);
                    break;

                case 2:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 3:
                    System.out.println("Lowercase = " + str.toLowerCase());
                    break;

                case 4:
                    reverse(str);
                    break;

                case 5:
                    palindrome(str);
                    break;

                case 6:
                    vowels(str);
                    break;

                case 7:
                    System.out.println("Length = " + str.length());
                    break;

                case 8:
                    frequency(str);
                    break;

                case 9:
                    System.out.println("System Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 9);

        sc.close();
    }
}