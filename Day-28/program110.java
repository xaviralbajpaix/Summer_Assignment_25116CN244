import java.util.Scanner;

class program110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountHolder;
        int accountNumber;
        double balance = 0;
        int choice;

        System.out.println("===== BANK ACCOUNT SYSTEM =====");
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance && withdraw > 0) {
                        balance -= withdraw;
                        System.out.println("Amount withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("\n----- ACCOUNT DETAILS -----");
                    System.out.println("Account Holder : " + accountHolder);
                    System.out.println("Account Number : " + accountNumber);
                    System.out.println("Balance        : ₹" + balance);
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank Account System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}