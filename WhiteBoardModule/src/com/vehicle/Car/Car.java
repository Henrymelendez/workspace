package com.vehicle.Car;

import com.vehicle.CarType.CarType;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Car {

    private String brand;
    private String model;
    private int year;
    private static final int MIN_YEAR = 1930;
    private static final int MAX_YEAR = LocalDate.now().getYear();
    private CarType carType = null;
    private LocalDateTime turnOnDate = LocalDateTime.MIN;
    private boolean turnedOn;

    public Car() {
        setCarType(carType);
    }

    public Car (String brand) {
        setBrand(brand);
        setCarType(this.carType);
    }

    public Car(String brand, String model) {
        setBrand(brand);
        setModel(model);
        setCarType(this.carType);
    }

    public Car(String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setCarType(carType);

    }

    public Car(String brand, String model, int year, CarType carType) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setCarType(carType);
    }

    public void turnOn() {

        System.out.println("The " + brand + " " + model + " is turning on");
        setTurnedOn(true);
        setTurnOnDate(LocalDateTime.now());
    }

    public void turnOff() {

        System.out.println("Turning off the " + brand + " " + model);
        setTurnedOn(false);
    }


    public void drive() {

        System.out.println("Driving the " + brand + " " + model);

    }

    public static CarType convertStringToCarType(String s) {

        s = s.toLowerCase();

        switch (s) {

            case "suv":
                return CarType.SUV;
            case "sedan":
                return CarType.SEDAN;
            case "coupe":
                return CarType.COUPE;
            case "convertable":
                return CarType.CONVERTABLE;
            case "minivan":
                return CarType.MINIVAN;
            case "truck":
                return CarType.TRUCK;
            default:
                return CarType.SEDAN;
        }

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        try {
            if(brand instanceof String){
                this.brand = brand;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("brand must be a string");

        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        try {
            if (year >= MIN_YEAR && year <= MAX_YEAR) {
                this.year = year;

            }
        } catch (IllegalArgumentException e) {
            this.year = MAX_YEAR;
        }

    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {

        if (carType == null) {
            this.carType = CarType.SEDAN;
        } else {
            this.carType = carType;
        }
    }

    public LocalDateTime getTurnOnDate() {

        if (this.turnOnDate == LocalDateTime.MIN) {
            System.out.println("Never Turned On Brand new com.vehicle.Car.Car");
        }

        return turnOnDate;
    }

    public void setTurnOnDate(LocalDateTime turnOnDate) {
        this.turnOnDate = turnOnDate;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }


    @Override
    public String toString() {
        return "com.vehicle.Car.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", carType=" + carType +
                '}';
    }
}
