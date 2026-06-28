import java.util.Scanner;

class program109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
            "Java Programming",
            "Data Structures",
            "Operating System",
            "Computer Networks",
            "Database Management"
        };

        boolean[] issued = new boolean[books.length];

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < books.length; i++) {
                        if (issued[i])
                            System.out.println((i + 1) + ". " + books[i] + " - Issued");
                        else
                            System.out.println((i + 1) + ". " + books[i] + " - Available");
                    }
                    break;

                case 2:
                    System.out.print("Enter book number to issue: ");
                    int issue = sc.nextInt();

                    if (issue >= 1 && issue <= books.length) {
                        if (!issued[issue - 1]) {
                            issued[issue - 1] = true;
                            System.out.println("Book issued successfully.");
                        } else {
                            System.out.println("Book is already issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book number to return: ");
                    int ret = sc.nextInt();

                    if (ret >= 1 && ret <= books.length) {
                        if (issued[ret - 1]) {
                            issued[ret - 1] = false;
                            System.out.println("Book returned successfully.");
                        } else {
                            System.out.println("This book was not issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}