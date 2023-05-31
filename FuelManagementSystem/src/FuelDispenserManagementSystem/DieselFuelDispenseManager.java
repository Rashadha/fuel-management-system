package FuelDispenserManagementSystem;

import QueueMnagementSystem.DateTime;

import java.util.ArrayList;

public class DieselFuelDispenseManager extends DieselCentralRepository implements FuelDispenseManager {

    static double priceOfDieselPerLiter = 430;
    private double dispenseFuelCapacity;
    private String vehicleType;
    private DateTime date;
    private double fuelAmountPerVehicle;
    private int dispenserNumber;
    private ArrayList<String> fuelRecordEachDispenser = new ArrayList<>();

    public DieselFuelDispenseManager(double dispenseFuelCapacity, String vehicleType, DateTime date, double fuelAmountPerVehicle, int dispenserNumber) {
        super();
        this.dispenseFuelCapacity = dispenseFuelCapacity;
        this.vehicleType = vehicleType;
        this.date = date;
        this.fuelAmountPerVehicle = fuelAmountPerVehicle;
        this.dispenserNumber = dispenserNumber;
    }

    public static double getPriceOfDieselPerLiter() {
        return priceOfDieselPerLiter;
    }

    public static void setPriceOfDieselPerLiter(double priceOfDieselPerLiter) {
        FuelDispenserManagementSystem.DieselFuelDispenseManager.priceOfDieselPerLiter = priceOfDieselPerLiter;
    }

    public double getDispenseFuelCapacity() {
        return dispenseFuelCapacity;
    }

    public void setDispenseFuelCapacity(double dispenseFuelCapacity) {
        this.dispenseFuelCapacity = dispenseFuelCapacity;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public double getFuelAmountPerVehicle() {
        return fuelAmountPerVehicle;
    }

    public void setFuelAmountPerVehicle(double fuelAmountPerVehicle) {
        this.fuelAmountPerVehicle = fuelAmountPerVehicle;
    }

    public int getDispenserNumber() {
        return dispenserNumber;
    }

    public void setDispenserNumber(int dispenserNumber) {
        this.dispenserNumber = dispenserNumber;
    }

    public ArrayList<String> getFuelRecordEachDispenser() {
        return fuelRecordEachDispenser;
    }

    public void setFuelRecordEachDispenser(ArrayList<String> fuelRecordEachDispenser) {
        this.fuelRecordEachDispenser = fuelRecordEachDispenser;
    }

    @Override
    public void pumpFuel() {
        //Check for the fuel capacity and if it is enough continue the fuel pump.
        //If it is not enough close the dispenser
    }

    @Override
    public void addNewDispensers() {
        //If new dispensers are wanted to be added this method will add
    }

    @Override
    public void printStatistics() {
        //print the total diesel fuel dispensed per vehicle type
        //print the vehicle that received the largest amount of diesel for the day
        //print all other necessary records
    }

    public boolean checkFuelCapacity() {
        setDispenseFuelCapacity(fuelCapacity/3);
        if (fuelCapacity < 500) {
            System.out.println("Fuel out of Stock. Please close the dispenser. RESTOCK!!!");
            closeDispenser();
            return false;
        } else {
            System.out.println("Fuel in Stock");
            System.out.println("For one dispenser " + getDispenseFuelCapacity());
            System.out.println("Central Repository " + fuelCapacity);
            return true;
        }
    }

    public void closeDispenser() {
        System.out.println("This Dispenser is closed");
        // send a notification for restock
    }
}

