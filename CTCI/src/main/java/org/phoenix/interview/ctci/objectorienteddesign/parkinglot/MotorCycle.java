package org.phoenix.interview.ctci.objectorienteddesign.parkinglot;

public class MotorCycle extends Vehicle {

    public MotorCycle() {
        this.spotNeeded = 1;
        this.size = VehicleSize.SMALL;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return true;
    }

    @Override
    public void print() {
        System.out.print("Motorcycle ");
    }
}
