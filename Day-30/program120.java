import java.util.Scanner;

class program120 {

    static Scanner sc = new Scanner(System.in);

    static int[] roll = new int[100];
    static String[] name = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    static void addStudent() {
        if (count == 100) {
            System.out.println("Database Full!");
            return;
        }

        System.out.print("Enter Roll No: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;
        System.out.println("Student Added Successfully!");
    }

    static void viewStudents() {
        if (count == 0) {
            System.out.println("No Records Found!");
            return;
        }

        System.out.println("\n------ STUDENT RECORDS ------");
        for (int i = 0; i < count; i++) {
            System.out.println("Roll : " + roll[i]);
            System.out.println("Name : " + name[i]);
            System.out.println("Marks: " + marks[i]);

            if (marks[i] >= 40)
                System.out.println("Result: PASS");
            else
                System.out.println("Result: FAIL");

            System.out.println("----------------------------");
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.println("Student Found");
                System.out.println("Name : " + name[i]);
                System.out.println("Marks: " + marks[i]);
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    static void updateMarks() {
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();
                System.out.println("Marks Updated!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    static void deleteStudent() {
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {

                for (int j = i; j < count - 1; j++) {
                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;
                System.out.println("Record Deleted!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    static void topper() {
        if (count == 0) {
            System.out.println("No Records!");
            return;
        }

        int max = marks[0];
        int index = 0;

        for (int i = 1; i < count; i++) {
            if (marks[i] > max) {
                max = marks[i];
                index = i;
            }
        }

        System.out.println("\nTopper Details");
        System.out.println("Roll : " + roll[index]);
        System.out.println("Name : " + name[index]);
        System.out.println("Marks: " + marks[index]);
    }

    static void averageMarks() {
        if (count == 0) {
            System.out.println("No Records!");
            return;
        }

        int sum = 0;

        for (int i = 0; i < count; i++)
            sum += marks[i];

        System.out.println("Average Marks = " + (sum / (double) count));
    }

    static void sortStudents() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {

                if (marks[j] < marks[j + 1]) {

                    int tempMark = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMark;

                    int tempRoll = roll[j];
                    roll[j] = roll[j + 1];
                    roll[j + 1] = tempRoll;

                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;
                }
            }
        }

        System.out.println("Sorted by Marks (Highest First).");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== MINI PROJECT ==========");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Find Topper");
            System.out.println("7. Average Marks");
            System.out.println("8. Sort by Marks");
            System.out.println("9. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    topper();
                    break;

                case 7:
                    averageMarks();
                    break;

                case 8:
                    sortStudents();
                    break;

                case 9:
                    System.out.println("Project Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}