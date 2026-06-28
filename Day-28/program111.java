import java.util.Scanner;

class program111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] seat = {
                "A1","A2","A3","A4",
                "B1","B2","B3","B4",
                "C1","C2","C3","C4",
                "D1","D2","D3","D4",
                "E1","E2","E3","E4"
        };

        String[] passenger = new String[20];
        boolean[] booked = new boolean[20];

        final int PRICE = 250;
        int choice;

        System.out.println("======================================");
        System.out.println("      SMART TICKET BOOKING SYSTEM");
        System.out.println("======================================");

        do {
            System.out.println("\n1. View Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Booking Report");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nSeat Status");
                    for (int i = 0; i < seat.length; i++) {
                        System.out.print(seat[i] + "(" +
                                (booked[i] ? "Booked" : "Free") + ")  ");
                        if ((i + 1) % 4 == 0)
                            System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Seat Number (A1-E4): ");
                    String s = sc.nextLine().toUpperCase();

                    boolean found = false;

                    for (int i = 0; i < seat.length; i++) {
                        if (seat[i].equals(s)) {
                            found = true;

                            if (!booked[i]) {
                                booked[i] = true;
                                passenger[i] = name;

                                int bookingId = 1000 + i;

                                System.out.println("\n====== TICKET ======");
                                System.out.println("Booking ID : " + bookingId);
                                System.out.println("Passenger  : " + name);
                                System.out.println("Seat       : " + seat[i]);
                                System.out.println("Price      : ₹" + PRICE);
                                System.out.println("Status     : Confirmed");
                            } else {
                                System.out.println("Seat already booked.");
                            }
                        }
                    }

                    if (!found)
                        System.out.println("Invalid Seat Number.");

                    break;

                case 3:
                    System.out.print("Enter Seat Number to Cancel: ");
                    String cancel = sc.nextLine().toUpperCase();

                    boolean ok = false;

                    for (int i = 0; i < seat.length; i++) {
                        if (seat[i].equals(cancel)) {
                            ok = true;

                            if (booked[i]) {
                                booked[i] = false;
                                passenger[i] = null;
                                System.out.println("Ticket Cancelled.");
                            } else {
                                System.out.println("Seat is already free.");
                            }
                        }
                    }

                    if (!ok)
                        System.out.println("Invalid Seat Number.");

                    break;

                case 4:
                    int total = 0;

                    System.out.println("\nBooked Tickets");
                    System.out.println("-------------------------------");

                    for (int i = 0; i < seat.length; i++) {
                        if (booked[i]) {
                            System.out.println(seat[i] + " -> " + passenger[i]);
                            total++;
                        }
                    }

                    System.out.println("-------------------------------");
                    System.out.println("Tickets Sold : " + total);
                    System.out.println("Revenue      : ₹" + (total * PRICE));

                    break;

                case 5:
                    System.out.println("Thank You for Using the System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}