import java.util.Scanner;

class program119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[100];
        String[] name = new String[100];
        double[] salary = new double[100];
        int count = 0, choice;

        do {
            System.out.println("\n===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < id.length) {
                        System.out.print("Enter Employee ID: ");
                        id[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[count] = sc.nextDouble();

                        count++;
                        System.out.println("Employee Added Successfully!");
                    } else {
                        System.out.println("Employee List is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records Found!");
                    } else {
                        System.out.println("\nEmployee Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("--------------------------------");
                            System.out.println("ID     : " + id[i]);
                            System.out.println("Name   : " + name[i]);
                            System.out.println("Salary : ₹" + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            System.out.println("Employee Found!");
                            System.out.println("ID     : " + id[i]);
                            System.out.println("Name   : " + name[i]);
                            System.out.println("Salary : ₹" + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found!");
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int updateId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == updateId) {
                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();
                            System.out.println("Salary Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found!");
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == deleteId) {
                            for (int j = i; j < count - 1; j++) {
                                id[j] = id[j + 1];
                                name[j] = name[j + 1];
                                salary[j] = salary[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Employee Deleted Successfully!");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found!");
                    break;

                case 6:
                    System.out.println("Exiting Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}