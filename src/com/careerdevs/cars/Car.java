package com.careerdevs.cars;


            public class Car
    {
                public String make;
                public String model;
                public int mileage;
                public double gasPercentage;
         public Car(String make,String model,int mileage, double gasPercentage)
                {
                        this.make = make;
                        this.model= model;
                        this.mileage = mileage;
                        this.gasPercentage = gasPercentage;
                    }

                public String setCarMake(String make)
                {
                        this.make = make;
                        return make;
                    }

                public String getCarMake()
                {
                        return make;
                    }

                public String setCarModel(String model)
                {
                        this.model = model;
                        return model;
                    }

                public String getCarModel()
                {
                        return model;
                    }

                public int setCarMileage(int mileage)

        {
                        this.mileage = mileage;
                        return mileage;
                    }

                public int getCarmileage()
                {
                        return mileage;
                    }
                    public double setgasPercentage(double gasPercentage)
                    {
                        this.gasPercentage = gasPercentage;
                        return gasPercentage;
                    }
                public double getgasPercentage()
                {
                    return gasPercentage;
                }

                public String toString()
                {
                        return "Car make: " + make + " " +" Car model: " + model + " Car Mileage:" + mileage + "  Gas Percentage:" + gasPercentage;
                    }

                public static void main (String[] args)
                {
                        Car car1 = new Car("Camero 2SS",  "Chevy" , 10000, .10);
                        Car car2 = new Car("Mustang GT ", "Ford" , 30000, .50);
                        Car car3 = new Car("Hellcat", "Dodge" , 100, .9000);


                        System.out.println(car1);
                        System.out.println(car2);
                        System.out.println(car3);



                    }
            }



