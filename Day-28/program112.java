import java.util.Scanner;

class program112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[20];
        String[] phone = new String[20];
        int count = 0, choice;

        System.out.println("==================================");
        System.out.println("   CONTACT MANAGEMENT SYSTEM");
        System.out.println("==================================");

        do {
            System.out.println("\n1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 20) {
                        System.out.print("Enter Name : ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Phone: ");
                        phone[count] = sc.nextLine();

                        count++;
                        System.out.println("Contact Added Successfully.");
                    } else {
                        System.out.println("Contact List Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Contacts Found.");
                    } else {
                        System.out.println("\n------ CONTACT LIST ------");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + name[i] + " - " + phone[i]);
                        }
                        System.out.println("--------------------------");
                        System.out.println("Total Contacts: " + count);
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i].equalsIgnoreCase(search)) {
                            System.out.println("Name : " + name[i]);
                            System.out.println("Phone: " + phone[i]);
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Contact Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Name to Delete: ");
                    String del = sc.nextLine();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i].equalsIgnoreCase(del)) {

                            for (int j = i; j < count - 1; j++) {
                                name[j] = name[j + 1];
                                phone[j] = phone[j + 1];
                            }

                            count--;
                            deleted = true;
                            System.out.println("Contact Deleted.");
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Contact Not Found.");
                    break;

                case 5:
                    System.out.println("Thank You for Using Contact Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}