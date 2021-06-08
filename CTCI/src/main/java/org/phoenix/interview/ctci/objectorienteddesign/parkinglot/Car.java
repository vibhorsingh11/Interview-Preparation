package org.phoenix.interview.ctci.objectorienteddesign.parkinglot;

public class Car extends Vehicle {

    public Car() {
        this.spotNeeded = 1;
        this.size = VehicleSize.MEDIUM;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.LARGE || spot.getSize() == VehicleSize.MEDIUM;
    }

    @Override
    public void print() {
        System.out.print("Car ");
    }
}
