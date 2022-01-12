package com.careerdevs.cars;


            public class car
            {
                private String make;
                private String model;
                private int mileage;
                private float gasPercentage;

                public car(String make, String model, int mileage, float gasPercentage) {
                    this.make = make;
                    this.model = model;
                    this.mileage = mileage;
                    this.gasPercentage = gasPercentage;
                }

                public String setCarMake(String make) {
                    this.make = make;
                    return make;
                }

                public String getCarMake() {
                    return make;
                }

                public String setCarModel(String model) {
                    this.model = model;
                    return model;
                }

                public String getCarModel() {
                    return model;
                }

                public int setCarMileage(int mileage) {
                    this.mileage = mileage;
                    return mileage;
                }

                public int getCarmileage() {
                    return mileage;
                }

                public float setgasPercentage(float gasPercentage) {
                    this.gasPercentage = gasPercentage;
                    return gasPercentage;
                }

                public float getgasPercentage() {
                    return gasPercentage;
                }

                public String toString() {
                    return "Car make: " + make + " " + " Car model: " + model + " Car Mileage:" + mileage + "  Gas Percentage:" + gasPercentage;
                }
            }





