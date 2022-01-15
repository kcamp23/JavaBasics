package com.careerdevs.carfactory;

import com.careerdevs.cars.car;

import java.util.Scanner;

public class MainCarFactory {
    public static void main(String[] args) {
        createACar();
      //  createACarObject();

    }


    public static void createACar () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Who is the owner?");
        String owner = scanner.next();

        System.out.print("What make would you like?");
        String make = scanner.next();

        System.out.print("What model would you like?");
        String model = scanner.next();

        System.out.print("What mileage are you hoping for?");
        int mileage = scanner.nextInt();

        System.out.print("Did you want a new car?");
        boolean used = scanner.hasNextBoolean();



        BuildACar myNewCar = new BuildACar(owner,make,model,mileage);


    }


    @Override
    public String toString() {
        return super.toString();
    }
}


