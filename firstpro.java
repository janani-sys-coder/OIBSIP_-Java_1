import java.util.Scanner;
import java.util.Random;

class OnlineReservationSystem {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static int pnr;

    public static void main(String[] args) {

        // Login
        System.out.println("----- Online Reservation System -----");
        System.out.print("Enter Username: ");
        String user = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        System.out.println("\nLogin Successful!\n");

        while (true) {
            System.out.println("1. Reserve Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    reserve();
                    break;
                case 2:
                    cancel();
                    break;
                case 3:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void reserve() {
        sc.nextLine(); // clear buffer
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Train Number: ");
        int train = sc.nextInt();
        sc.nextLine();
        System.out.print("From: ");
        String from = sc.nextLine();
        System.out.print("To: ");
        String to = sc.nextLine();

        pnr = rand.nextInt(900000) + 100000;

        System.out.println("\nTicket Booked Successfully!");
        System.out.println("Passenger Name: " + name);
        System.out.println("PNR Number: " + pnr + "\n");
    }

    static void cancel() {
        System.out.print("Enter PNR Number: ");
        int cpnr = sc.nextInt();

        if (cpnr == pnr) {
            System.out.println("Ticket Cancelled Successfully!\n");
        } else {
            System.out.println("Invalid PNR Number!\n");
        }
    }
}