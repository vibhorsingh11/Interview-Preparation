package org.phoenix.interview.ctci.objectorienteddesign.parkinglot;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private final List<ParkingSpot> parkingSpots = new ArrayList<>();
    protected int spotNeeded;
    protected VehicleSize size;

    public int getSpotNeeded() {
        return this.spotNeeded;
    }

    public VehicleSize getSize() {
        return this.size;
    }

    public void clearSpots() {
        for (ParkingSpot spot : parkingSpots) {
            spot.removeVehicle();
        }
        parkingSpots.clear();
    }

    /**
     * @param parkingSpot - spot to be used for parking
     */
    public void parkInSpots(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    public abstract boolean canFitInSpot(ParkingSpot parkingSpot);

    public abstract void print();
}
