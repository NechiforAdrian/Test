package itschoolS13.parkingapp;

import java.time.LocalDateTime;

public class MediumCar extends CarUtils implements Fee {

    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut){
        double noOfHours = 10;
        double mediumCarFee = FeeUtils.MEDIUM_CAR_FEE;
        System.out.println("Medium car pay medium fee");
    }

    public boolean hasSubscription(){
        return false;
    }
}
