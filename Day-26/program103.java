import java.util.Scanner;

public class program103 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int enteredPin;
        double balance = 10000.0;
        String[] history = new String[100];
        int count = 0;

        // Welcome Screen
        System.out.println("======================================");
        System.out.println("         WELCOME TO ATM SYSTEM");
        System.out.println("======================================");
        System.out.println("Default ATM PIN : 1234");
        System.out.println("Initial Balance : ₹10000.00");
        System.out.println("This is a simulation program.");
        System.out.println("Please enter the above PIN to continue.");
        System.out.println("======================================");

        // PIN Authentication
        System.out.print("Enter ATM PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN! Access Denied.");
            sc.close();
            return;
        }

        System.out.println("\nLogin Successful!");

        int choice;

        do {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Change PIN");
            System.out.println("6. Mini Statement");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nCurrent Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        history[count++] = "Deposited ₹" + deposit;
                        System.out.println("Amount Deposited Successfully.");
                        System.out.println("Updated Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid Amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        history[count++] = "Withdrawn ₹" + withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance or Invalid Amount.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Receiver Account Number: ");
                    long account = sc.nextLong();

                    System.out.print("Enter Amount to Transfer: ₹");
                    double transfer = sc.nextDouble();

                    if (transfer > 0 && transfer <= balance) {
                        balance -= transfer;
                        history[count++] = "Transferred ₹" + transfer + " to Account " + account;
                        System.out.println("Money Transferred Successfully.");
                        System.out.println("Remaining Balance: ₹" + balance);
                    } else {
                        System.out.println("Transfer Failed.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Current PIN: ");
                    int currentPin = sc.nextInt();

                    if (currentPin == pin) {
                        System.out.print("Enter New PIN: ");
                        pin = sc.nextInt();
                        history[count++] = "PIN Changed";
                        System.out.println("PIN Changed Successfully.");
                    } else {
                        System.out.println("Incorrect Current PIN.");
                    }
                    break;

                case 6:
                    System.out.println("\n========== MINI STATEMENT ==========");

                    if (count == 0) {
                        System.out.println("No Transactions Found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + history[i]);
                        }
                    }

                    System.out.println("------------------------------------");
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 7:
                    System.out.println("\n======================================");
                    System.out.println(" Thank You For Using Our ATM System!");
                    System.out.println(" Visit Again.");
                    System.out.println("======================================");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 7);

        sc.close();
    }
}