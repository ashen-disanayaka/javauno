package com.company;

public class Car {
    public String model;
    public String brand;
    public int moy;
    public double ecc;

    public Car(String model, String brand, int moy, int ecc) {
        this.model = model;
        this.brand = brand;
        this.moy = moy;
        this.ecc = ecc;
    }


    public double car_condition() {
        return this.moy/this.ecc;

    }
}
