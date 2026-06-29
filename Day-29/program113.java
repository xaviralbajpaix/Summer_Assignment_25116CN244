import java.util.Scanner;

class program113 {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero!");
        return a / b;
    }

    static double power(double a, double b) {
        return Math.pow(a, b);
    }

    static double squareRoot(double a) {
        if (a < 0)
            throw new ArithmeticException("Negative number!");
        return Math.sqrt(a);
    }

    static long factorial(int n) {
        if (n < 0)
            throw new ArithmeticException("Negative number!");
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("======================================");
        System.out.println("      NERDY MENU-DRIVEN CALCULATOR");
        System.out.println("======================================");

        do {

            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Factorial");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            try {
                double a, b;

                switch (choice) {

                    case 1:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Answer = " + add(a, b));
                        break;

                    case 2:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Answer = " + subtract(a, b));
                        break;

                    case 3:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Answer = " + multiply(a, b));
                        break;

                    case 4:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Answer = " + divide(a, b));
                        break;

                    case 5:
                        System.out.print("Enter base and exponent: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Answer = " + power(a, b));
                        break;

                    case 6:
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Answer = " + squareRoot(a));
                        break;

                    case 7:
                        System.out.print("Enter integer: ");
                        int n = sc.nextInt();
                        System.out.println("Answer = " + factorial(n));
                        break;

                    case 8:
                        System.out.println("Calculator Closed.");
                        break;

                    default:
                        System.out.println("Invalid Choice!");

                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 8);

        sc.close();
    }
}