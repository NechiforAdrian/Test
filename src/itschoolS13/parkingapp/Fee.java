package itschoolS13.parkingapp;

import java.time.LocalDateTime;

public interface Fee {

    void basePayment(LocalDateTime timeIn, LocalDateTime timeOut);
    boolean hasSubscription();

}
