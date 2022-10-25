package com.vehicle.CarClient;

import com.vehicle.Car.Car;
import com.vehicle.CarType.CarType;

public class CarClient {

    public static void main(String[] args) {


        Car honda = new Car("Honda", "Civic", 2012, CarType.SEDAN);
        Car bmw = new Car("BMW", "M3", 2013, CarType.COUPE);
        Car acura = new Car("Acura", "RSX", 2005, CarType.COUPE);

        System.out.println(bmw);
        System.out.println(honda);
        System.out.println(acura);



    }
}
