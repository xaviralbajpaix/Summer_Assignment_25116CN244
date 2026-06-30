import java.util.Scanner;

class program117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        int[] marks = new int[100];
        int count = 0, choice;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < names.length) {
                        System.out.print("Enter Student Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextInt();

                        count++;
                        System.out.println("Student Added Successfully!");
                    } else {
                        System.out.println("Record is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found!");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". Name: " + names[i] + " | Marks: " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Record Found:");
                            System.out.println("Name: " + names[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
                    break;

                case 4:
                    System.out.print("Enter Student Name to Update: ");
                    String update = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextInt();
                            System.out.println("Marks Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
                    break;

                case 5:
                    System.out.print("Enter Student Name to Delete: ");
                    String del = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(del)) {
                            for (int j = i; j < count - 1; j++) {
                                names[j] = names[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            count--;
                            System.out.println("Record Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
                    break;

                case 6:
                    System.out.println("Exiting Student Record System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}