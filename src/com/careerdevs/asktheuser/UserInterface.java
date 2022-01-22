package com.careerdevs.asktheuser;

import javax.sound.midi.Soundbank;
import java.net.SocketOption;
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

        System.out.print("Is he rich?, rich like me?"  + "\n" +  "true or false ");
            //boolean
        boolean userRich = scanner.nextBoolean();
        if (true == userRich) {System.out.print("THAT IS AWESOME!! GOOD FOR YOU GUYS!!");}
        else { System.out.println("Well, we cant all be as awesome as me ");
        }

        System.out.print( "Where do you work ?");
            //String
        String userWork = scanner.next();
        System.out.print("sounds like " + userWork + " is a fun place to work ");


        System.out.print("\n" + "How much do you make?");
                //double
        double userWage = scanner.nextDouble();
        System.out.print (" In time, making, " + userWage + " will seem like a good starting point to be well off");
        System.out.print(" \n ");


        System.out.print("You pay taxes?" + "\n" + " True or false");
                // boolean
        boolean userTaxesPaid = scanner.nextBoolean();
        if (userTaxesPaid == true ) System.out.print("CONGRATS for paying taxes and being a GREAT citizen");

       else System.out.print("You should be ashamed and should really start paying taxes.");



        System.out.print("\n" + "How many dependants do you have?");
                //int
        int userDependants = scanner.nextInt();
        System.out.print(userDependants + " works for you then thats perfect");


        System.out.print("Have you ever been fired?" + "\n" + " Y or N:");
            //char if include y or n
        char userFired = scanner.next().charAt(0);
        System.out.print(userFired);


//        if (userFired == "y")
//        {System.out.print("Well, thats a shame, you should to continue working on your work ethic more!!!");}
//        else{
//                System.out.print("Well CONGRATS on being a very responsible adult");
//
//            }
        }
    }

