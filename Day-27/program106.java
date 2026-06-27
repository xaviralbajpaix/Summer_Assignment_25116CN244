import java.util.Scanner;

class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("\n----- Employee Record -----");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}

public class program106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];
        int count = 0;
        int choice;

        System.out.println("===== Employee Management System =====");

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    employees[count] = new Employee(id, name, department, salary);
                    count++;

                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].empId == searchId) {
                            employees[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].empId == updateId) {

                            System.out.print("Enter New Name: ");
                            employees[i].name = sc.nextLine();

                            System.out.print("Enter New Department: ");
                            employees[i].department = sc.nextLine();

                            System.out.print("Enter New Salary: ");
                            employees[i].salary = sc.nextDouble();

                            System.out.println("Employee updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].empId == deleteId) {

                            for (int j = i; j < count - 1; j++) {
                                employees[j] = employees[j + 1];
                            }

                            employees[count - 1] = null;
                            count--;

                            System.out.println("Employee deleted successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}