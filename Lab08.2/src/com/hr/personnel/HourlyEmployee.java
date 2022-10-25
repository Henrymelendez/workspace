package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private double rate;
    private double hourly;




    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hourly) {
        super(name, hireDate);
        this.rate = rate;
        this.hourly = hourly;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHourly() {
        return hourly;
    }

    public void setHourly(double hourly) {
        this.hourly = hourly;
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "rate=" + rate +
                ", hourly=" + hourly +
                ", Date="+ getHireDate() +
                ", name="+ getName() +
                '}';
    }
}
