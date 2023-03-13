package itschoolS14.parkingapp;

import java.time.LocalDateTime;

public class LargeCar extends CarUtils implements Fee {

    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut) {
        double noOfHours = 10;
        double largeCarFee = FeeUtils.LARGE_CAR_FEE;
        System.out.println("Large car pay maximum fee");
    }

    public boolean hasSubscription(){
        return false;
    }
}
