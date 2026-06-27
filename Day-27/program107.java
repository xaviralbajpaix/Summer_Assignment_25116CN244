import java.util.Scanner;

class Salary {
    int empId;
    String name;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    Salary(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.hra = basicSalary * 0.20;
        this.da = basicSalary * 0.10;
        this.grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("\n----- Salary Record -----");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class program107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Salary[] employees = new Salary[100];
        int count = 0;
        int choice;

        System.out.println("===== Salary Management System =====");

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add Salary Record");
            System.out.println("2. View All Records");
            System.out.println("3. Search Record");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basic = sc.nextDouble();

                    employees[count] = new Salary(id, name, basic);
                    count++;

                    System.out.println("Salary record added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
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
                        System.out.println("Record not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].empId == updateId) {

                            System.out.print("Enter New Basic Salary: ");
                            employees[i].basicSalary = sc.nextDouble();

                            employees[i].hra = employees[i].basicSalary * 0.20;
                            employees[i].da = employees[i].basicSalary * 0.10;
                            employees[i].grossSalary = employees[i].basicSalary + employees[i].hra + employees[i].da;

                            System.out.println("Salary updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Record not found.");
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

                            System.out.println("Record deleted successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Record not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Salary Management System.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}