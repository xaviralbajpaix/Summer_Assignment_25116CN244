import java.util.Scanner;

class program118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[100];
        boolean[] issued = new boolean[100];
        int count = 0, choice;

        do {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < books.length) {
                        System.out.print("Enter Book Name: ");
                        books[count] = sc.nextLine();
                        issued[count] = false;
                        count++;
                        System.out.println("Book Added Successfully!");
                    } else {
                        System.out.println("Library is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available!");
                    } else {
                        System.out.println("\nLibrary Books:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + books[i] +
                                    " - " + (issued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Issue: ");
                    String issueBook = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(issueBook)) {
                            found = true;
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book is Already Issued!");
                            }
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found!");
                    break;

                case 4:
                    System.out.print("Enter Book Name to Return: ");
                    String returnBook = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(returnBook)) {
                            found = true;
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book Was Not Issued!");
                            }
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found!");
                    break;

                case 5:
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(search)) {
                            System.out.println("Book Found!");
                            System.out.println("Name: " + books[i]);
                            System.out.println("Status: " + (issued[i] ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found!");
                    break;

                case 6:
                    System.out.println("Thank You for Using Mini Library System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}