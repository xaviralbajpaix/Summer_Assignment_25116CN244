import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String course;
    double marks;

    Student(int rollNo, String name, int age, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("\n----- Student Record -----");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
    }
}

public class program105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;
        int choice;

        System.out.println("===== Student Record Management System =====");

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students[count] = new Student(roll, name, age, course, marks);
                    count++;

                    System.out.println("Student record added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No student records found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            students[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == searchRoll) {
                            students[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.print("Enter Roll No to Update: ");
                    int updateRoll = sc.nextInt();
                    sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == updateRoll) {

                            System.out.print("Enter New Name: ");
                            students[i].name = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            students[i].age = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter New Course: ");
                            students[i].course = sc.nextLine();

                            System.out.print("Enter New Marks: ");
                            students[i].marks = sc.nextDouble();

                            System.out.println("Student record updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found.");
                    break;

                case 5:
                    System.out.print("Enter Roll No to Delete: ");
                    int deleteRoll = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == deleteRoll) {
                            for (int j = i; j < count - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[count - 1] = null;
                            count--;

                            System.out.println("Student record deleted successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found.");
                    break;

                case 6:
                    System.out.println("Thank you for using Student Record Management System.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}