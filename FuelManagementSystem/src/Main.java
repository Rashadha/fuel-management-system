import QueueMnagementSystem.TicketCounter;

import java.util.Scanner;

public class Main {
    private static TicketCounter ticketCounter = new TicketCounter();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Select: ");
            System.out.println("1 --> Issue Ticket:");
            System.out.println("2 --> Enter to the queue:");
            System.out.println("3 --> pump fuel:");
            System.out.println("4 --> check fuel availability to pump fuel:");
            System.out.println("5 --> check repository fuel capacity:");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    issueTicket();
                    break;
                case 2:
                    addToEntry();
                    break;
                case 3:
                    pumpFuel();
                    break;
                case 4:
                    fuelAvailability();
                    break;
                case 5:
                    repositoryCapacity();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (option != 0);
    }

    private static void repositoryCapacity() {
    }

    private static void fuelAvailability() {
    }

    private static void pumpFuel() {

        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Fuel Type:");
            System.out.println("1 --> Petrol");
            System.out.println("2 --> Diesel");

            option = input.nextInt();

            switch (option) {
                case 1:
                    petrol();
                    break;
                case 2:
                    diesel();
                    break;
                case 0:
                   break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (option != 0);
    }

    public static void diesel() {
    }

    public static void petrol() {
    }

    public static void issueTicket() {
        ticketCounter.issueTicket();
    }

    public static void addToEntry() {
        ticketCounter.getVehicleList().get(0)
    }
}