package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private double rate;
    private double hourly;




    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hourly) {
        super(name, hireDate);
        this.rate = rate;
        this.hourly = hourly;
    }
    @Override
    public void pay(){
        System.out.println( getName() + " is paid hourly " + (getRate() * getHourly()));
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

    @Override
    public void payTaxes() {
        double taxes = (getHourly() * getRate()) * TaxPayer.HOURLY_TAX_RATE;

        System.out.println(getName() +" paid taxes of " + taxes);
    }
}
