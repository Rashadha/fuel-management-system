package QueueMnagementSystem;

public class Node {

    private int ticketNumber;
    private int fuelAmount;
    private String vehicleType;
    Node next;

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Node(int ticketNumber, int fuelAmount, String vehicleType) {
        this.ticketNumber = ticketNumber;
        this.fuelAmount = fuelAmount;
        this.vehicleType = vehicleType;
        this.next = null;
    }
}
