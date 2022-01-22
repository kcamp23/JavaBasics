package com.careerdevs.fruitfactory;
//Fields: name (String), color (String), hasSeeds (boolean)

import java.util.Scanner;

public class MainFruitFactory {
    public static void main(String[] args) {
        createFruit( );

    }

    public static void createFruit() {

        Scanner scanner = new Scanner (System.in);

        System.out.print("What is the fruits name? \n Name:");
        String name = scanner.next();

        System.out.print("What color is the fruit? \n Color:");
        String color = scanner.next();

        System.out.print("The fruit has seeds? \n True or false:");
        boolean hasSeeds = scanner.nextBoolean();


        Fruit myFruit = new Fruit(name,color,hasSeeds);

        System.out.print(myFruit);


    }
}
