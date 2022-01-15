package com.careerdevs.carfactory;

public class BuildACar {

    public String owner;
    public String make;
    public String model;
    public int  mileage;


    public  BuildACar (String owner, String make, String model,  int mileage){

        this.owner = owner;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }


    @Override
    public String toString() {
        return "BuildACar{" +
                "owner='" + owner + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
