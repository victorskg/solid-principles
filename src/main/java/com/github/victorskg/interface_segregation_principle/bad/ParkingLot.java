package main.java.com.github.victorskg.interface_segregation_principle.bad;

import main.java.com.github.victorskg.interface_segregation_principle.Car;

public interface ParkingLot {

    void parkCar();

    void unparkCar();

    void getCapacity();

    double calculateFee(Car car);

    void doPayment(Car car) throws Exception;

}
