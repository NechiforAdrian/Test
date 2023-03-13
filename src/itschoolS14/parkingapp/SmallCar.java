package itschoolS14.parkingapp;

import itschoolS14.abstractpractice.Car;

import java.time.LocalDateTime;

public class SmallCar extends CarUtils implements Fee {

    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut){
        double noOfHours = 10;
        double smallCarFee = FeeUtils.SMALL_CAR_FEE;
        System.out.println("Small car pay minimum fee.");
    }

    public boolean hasSubscription(){
        return false;
    }
}
