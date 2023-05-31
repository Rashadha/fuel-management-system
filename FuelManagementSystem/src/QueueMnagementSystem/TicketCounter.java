package QueueMnagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketCounter {
    private String fuelType;
    private String vehicleNumber;
    private String vehicleType;
    private String dispenserNumber;
    private String ticketNumber;
    private DateTime date;

    private ArrayList<Object> vehicleList = new ArrayList<>();

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDispenserNumber() {
        return dispenserNumber;
    }

    public void setDispenserNumber(String dispenserNumber) {
        this.dispenserNumber = dispenserNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public ArrayList<Object> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Object> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public TicketCounter() {
    }

    public void issueTicket() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the vehicle number: ");
        setVehicleNumber(input.nextLine());

        System.out.println("Fuel type:");
        System.out.println("1 --> 92 Octane");
        System.out.println("2 --> Diesel");

        int fuelTypeNumber = input.nextInt();

        switch (fuelTypeNumber) {
            case 1:
                setFuelType("92 Octane");
                allocateDispenser("92 Octane");
                break;
            case 2:
                setFuelType("Diesel");
                allocateDispenser("Diesel");
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    private void allocateDispenser(String fuelType) {

        Scanner input = new Scanner(System.in);
        if (fuelType.equals("92 Octane")) {
            System.out.println("Vehicle Type: ");
            System.out.println("1 --> Car");
            System.out.println("2 --> Van");
            System.out.println("3 --> Three wheeler");
            System.out.println("4 --> Motor bike");
            System.out.println("5 --> Other vehicle");

            int vehicleTypeNumber = input.nextInt();

            switch (vehicleTypeNumber) {
                case 1:
                    setVehicleType("Car");
                    setDispenserNumber("P1 and P2");
                    break;
                case 2:
                    setVehicleType("Van");
                    setDispenserNumber("P1 and P2");
                    break;
                case 3:
                    setVehicleType("Three wheeler");
                    setDispenserNumber("P3");
                    break;
                case 4:
                    setVehicleType("Motor bike");
                    setDispenserNumber("P4");
                    break;
                case 5:
                    setVehicleType("Other vehicle");
                    setDispenserNumber("P2");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } else if (fuelType.equals("Diesel")) {
            System.out.println("Vehicle Type: ");
            System.out.println("1 -->  Public transport vehicles");
            System.out.println("2 --> Other vehicles");

            int vehicleTypeNumber = input.nextInt();

            switch (vehicleTypeNumber) {
                case 1:
                    setVehicleType("Public transport vehicles");
                    setDispenserNumber("D1");
                    break;
                case 2:
                    setVehicleType("Other vehicles");
                    setDispenserNumber("D2 and D3");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
        ticket();
        Vehicle v1 = new Vehicle();
        v1.setVehicleNumber(getVehicleNumber());
        v1.setVehicleType(getVehicleType());
        v1.setFuelType(getFuelType());
        vehicleList.add(v1);
        System.out.println(vehicleList);

    }

    public void ticket() {
        for (int i = 0; i < 1; i++) {
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("*   -------------------               --------------    *");
            System.out.println("*         " + getVehicleNumber() + "                            " + getDate() + "          *");
            System.out.println("*   -------------------               --------------    *");
            System.out.println("*              --------------------------               *");
            System.out.println("*            " + getFuelType() + " Dispenser " + getDispenserNumber() + "     *");
            System.out.println("*                  Ticket Number: " + getTicketNumber() + "                  *");
            System.out.println("*              --------------------------               *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        }
    }
}
