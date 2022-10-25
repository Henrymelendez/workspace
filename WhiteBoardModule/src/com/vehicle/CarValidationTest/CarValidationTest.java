package com.vehicle.CarValidationTest;

import com.vehicle.Car.Car;
import com.vehicle.CarType.CarType;

public class CarValidationTest {

    public static void main(String[] args) {



        Car honda = new Car();
        honda.setBrand("Honda");
        honda.setModel("Civic");
        honda.setYear(1998);
        honda.setCarType(CarType.COUPE);

        System.out.println(honda.getBrand());
        System.out.println(honda.getModel());
        System.out.println(honda.getYear());
        System.out.println(honda.getCarType());

        Car volk = new Car();
        volk.setBrand("Volkswagon");
        volk.setModel("Jetta");
        volk.setYear(2008);

        System.out.println(honda);
        System.out.println(volk);
        System.out.println();

        // Validate that it keeps track of last time vehicle turned on
        System.out.println(volk.getTurnOnDate());
        volk.turnOn();
        System.out.println(volk.isTurnedOn());
        volk.turnOff();
        // validate drive method
        volk.drive();

        System.out.println(volk.getTurnOnDate());



    }
}
