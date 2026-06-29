import java.util.Scanner;

class program116 {

    static final int MAX = 100;

    static int[] id = new int[MAX];
    static String[] name = new String[MAX];
    static int[] qty = new int[MAX];
    static double[] price = new double[MAX];
    static int count = 0;

    static void addItem(Scanner sc) {
        System.out.print("Enter Product ID: ");
        id[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Quantity: ");
        qty[count] = sc.nextInt();

        System.out.print("Enter Price: ");
        price[count] = sc.nextDouble();

        count++;
        System.out.println("Product Added Successfully.");
    }

    static void displayItems() {
        if (count == 0) {
            System.out.println("Inventory is Empty.");
            return;
        }

        System.out.println("\nID\tName\t\tQty\tPrice\tValue");

        for (int i = 0; i < count; i++) {
            System.out.println(id[i] + "\t" + name[i] + "\t\t" +
                    qty[i] + "\t" + price[i] + "\t" +
                    (qty[i] * price[i]));
        }
    }

    static void searchItem(Scanner sc) {
        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (id[i] == pid) {
                System.out.println("Product Found");
                System.out.println("Name : " + name[i]);
                System.out.println("Quantity : " + qty[i]);
                System.out.println("Price : " + price[i]);
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

    static void updateStock(Scanner sc) {
        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (id[i] == pid) {
                System.out.print("Enter New Quantity: ");
                qty[i] = sc.nextInt();
                System.out.println("Stock Updated.");
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

    static void totalValue() {
        double total = 0;

        for (int i = 0; i < count; i++)
            total += qty[i] * price[i];

        System.out.println("Total Inventory Value = " + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("========================================");
        System.out.println("      INVENTORY MANAGEMENT SYSTEM");
        System.out.println("========================================");

        do {

            System.out.println("\n1. Add Product");
            System.out.println("2. Display Inventory");
            System.out.println("3. Search Product");
            System.out.println("4. Update Stock");
            System.out.println("5. Total Inventory Value");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addItem(sc);
                    break;

                case 2:
                    displayItems();
                    break;

                case 3:
                    searchItem(sc);
                    break;

                case 4:
                    updateStock(sc);
                    break;

                case 5:
                    totalValue();
                    break;

                case 6:
                    System.out.println("System Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 6);

        sc.close();
    }
}