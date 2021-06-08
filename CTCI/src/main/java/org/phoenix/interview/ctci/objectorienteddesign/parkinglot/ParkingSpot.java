package org.phoenix.interview.ctci.objectorienteddesign.parkinglot;

public class ParkingSpot {

    private final VehicleSize spotSize;
    private final int row;
    private final Level level;
    private Vehicle vehicle;

    public ParkingSpot(VehicleSize spotSize, int row, Level level) {
        this.spotSize = spotSize;
        this.row = row;
        this.level = level;
    }

    /**
     * @return true, if parking spot is available
     */
    public boolean isAvailable() {
        return vehicle == null;
    }

    /**
     * @return true, if vehicle can fit in the spot
     */
    public boolean canFitVehicle(Vehicle vehicle) {
        return isAvailable() && vehicle.canFitInSpot(this);
    }

    public boolean park(Vehicle v) {
        if (!canFitVehicle(v)) {
            return false;
        }
        this.vehicle = v;
        vehicle.parkInSpots(this);
        return true;
    }

    /**
     * Remove vehicle from the spot
     */
    public void removeVehicle() {
        level.spotFreed();
        vehicle = null;
    }

    public int getRow() {
        return row;
    }

    public VehicleSize getSize() {
        return spotSize;
    }

    public void print() {
        if (vehicle == null) {
            if (spotSize == VehicleSize.SMALL) {
                System.out.print("SMALL ");
            } else if (spotSize == VehicleSize.MEDIUM) {
                System.out.print("MEDIUM ");
            } else if (spotSize == VehicleSize.LARGE) {
                System.out.print("LARGE ");
            }
        } else {
            vehicle.print();
        }
    }
}
