package com.careerdevs.asktheuser;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
            //String
        String userName = scanner.next();
        System.out.println(" Hello " + userName );

        System.out.print("Whose your daddy?");
            //string
        String userDaddy = scanner.next();
        System.out.println("OH, " + userDaddy + " and me went to school together!!");

        System.out.print("Is he rich?, rich like me?");
            //boolean
        boolean userRich = scanner.nextBoolean();
        if (true == userRich) {
        System.out.print("THAT IS AWESOME!! GOOD FOR YOU GUYS!!");
        } else if ( userRich == false){
            System.out.println("Well, we cant all be as awesome as me ");
        }

        System.out.print("Where do you work ?");
            //long

        System.out.print("How much do you make?");
                //double

        System.out.print("Do you pay taxes?");
                // boolean

        System.out.print("How many dependants do you have?");
                //float

        System.out.print("What type of car do you have?");
                //long

        System.out.print("How old is your car?");
                //byte

        System.out.print("Have you ever been fired?");
            //char if include y or n



    }

}
