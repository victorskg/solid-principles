package main.java.com.github.victorskg.interface_segregation_principle.good;

import main.java.com.github.victorskg.interface_segregation_principle.Car;

public interface PaidParkingLot extends ParkingLot {

    double calculateFee(Car car);

    void doPayment(Car car) throws Exception;

}
