package QueueMnagementSystem;

public class Vehicle {
    private String vehicleType;
    private String fuelType;
    private String vehicleNumber;
    private double fuelAmount;

    public Vehicle(String vehicleType, String fuelType, String vehicleNumber, double fuelAmount) {
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.vehicleNumber = vehicleNumber;
        this.fuelAmount = fuelAmount;
    }

    public Vehicle() {
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

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

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}