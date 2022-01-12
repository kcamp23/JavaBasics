package com.careerdevs.cars;

public class Main {

    public static void main (String[] args)
    {

        car car1 = new car("Camero 2SS",  "Chevy" , 10000, .10f);
        car car2 = new car("Mustang GT ", "Ford" , 30000, .50f);
        car car3 = new car("Hellcat", "Dodge" , 100, .9000f);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);



    }
}

