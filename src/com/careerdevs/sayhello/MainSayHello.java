package com.careerdevs.sayhello;


import java.util.Scanner;

public class MainSayHello {
    public static void main(String[] args) {
        UserInfo();

    }
    public static void  UserInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        String userName = scanner.next();

           System.out.print("Hello  "+userName);

        System.out.print("  how old are you?");
        int age = scanner.nextInt();

        System.out.print("What is your favorite color?");
        String favoriteColor = scanner.next();

        System.out.print(favoriteColor +" is a GREAT color!!!");
    }
}