package org.phoenix.interview.ctci.objectorienteddesign.parkinglot;

public class Bus extends Vehicle {

    public Bus() {
        this.spotNeeded = 5;
        this.size = VehicleSize.LARGE;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.LARGE;
    }

    @Override
    public void print() {
        System.out.print("BUS ");
    }
}
