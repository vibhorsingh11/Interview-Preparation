package org.phoenix.interview.ctci.objectorienteddesign.parkinglot;

public class Level {

    private final ParkingSpot[] parkingSpots;
    private int availableSpots = 0;

    public Level(int rows, int spotsPerRow) {
        int numberOfSpots = 0;
        parkingSpots = new ParkingSpot[rows * spotsPerRow];

        for (int row = 0; row < rows; row++) {
            for (int spot = 0; spot < spotsPerRow / 4; spot++) {
                VehicleSize size = VehicleSize.SMALL;
                parkingSpots[numberOfSpots] = new ParkingSpot(size, row, this);
                numberOfSpots++;
            }
            for (int spot = spotsPerRow / 4; spot < 3 * spotsPerRow / 4; spot++) {
                VehicleSize size = VehicleSize.MEDIUM;
                parkingSpots[numberOfSpots] = new ParkingSpot(size, row, this);
                numberOfSpots++;
            }
            for (int spot = 3 * spotsPerRow / 4; spot < spotsPerRow; spot++) {
                VehicleSize size = VehicleSize.LARGE;
                parkingSpots[numberOfSpots] = new ParkingSpot(size, row, this);
                numberOfSpots++;
            }
            this.availableSpots = numberOfSpots;
        }
    }

    public boolean parkVehicle(Vehicle v) {
        if (availableSpots < v.getSpotNeeded()) {
            return false;
        }
        int spotNumber = findAvailableSpots(v);
        if (spotNumber < 0) {
            return false;
        }
        return parkStartingAtSpot(spotNumber, v);
    }

    private boolean parkStartingAtSpot(int spotNumber, Vehicle vehicle) {
        vehicle.clearSpots();
        boolean success = true;
        for (int i = spotNumber; i < spotNumber + vehicle.spotNeeded; i++) {
            success &= parkingSpots[i].park(vehicle);
        }
        availableSpots -= vehicle.spotNeeded;
        return success;
    }

    private int findAvailableSpots(Vehicle vehicle) {
        int spotsNeeded = vehicle.getSpotNeeded();
        int lastRow = -1;
        int spotsFound = 0;
        for (int i = 0; i < parkingSpots.length; i++) {
            ParkingSpot spot = parkingSpots[i];
            if (lastRow != spot.getRow()) {
                spotsFound = 0;
                lastRow = spot.getRow();
            }
            if (spot.canFitVehicle(vehicle)) {
                spotsFound++;
            } else {
                spotsFound = 0;
            }
            if (spotsFound == spotsNeeded) {
                return i - (spotsNeeded - 1);
            }
        }
        return -1;
    }

    public void spotFreed() {
        availableSpots++;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void print() {
        int lastRow = -1;
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getRow() != lastRow) {
                System.out.print(" ");
                lastRow = spot.getRow();
            }
            spot.print();
        }
    }
}
