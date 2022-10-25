package com.vehicle.CarClient;

import com.vehicle.Car.Car;
import com.vehicle.CarType.CarType;

public class CarClientArgs {

    public static void main(String[] args) {

        if(args.length < 4){

            String brand = "Brand";
            String model = "model";
            String year = "Year";
            String cartype = " com.vehicle.Car.Car Type : SUV, COUPE, SEDAN, CONVERTABLE, TRUCK";

            System.out.println(brand);
            System.out.println(model);
            System.out.println(year);
            System.out.println(cartype);

            return; // exits if less than 4 arguments
        }

        String brand = args[0];
        String model = args[1];
        int year = Integer.parseInt(args[2]);
        CarType carType = Car.convertStringToCarType(args[3]);

        Car honda = new Car(brand, model, year, carType);

        System.out.println(honda);



    }
}
