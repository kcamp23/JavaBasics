package com.careerdevs.recursion;

import java.util.Scanner;

public class edabitchallange {
    public static void main(String[] args) {
//       countDown(3,-5);
        countDown();
    }


//edabit challange
public class Challenge {
    public static int sum(int n) {
        int s = n;
        if (n == 1)
            return 1;
        n--;
        return sum(n) + s;
    }
}
//Create a method (countDown) that takes an int as input and counts down to 0 starting with the number passed as a parameter
    static void countDown(int max, int min) {
        if (max == min)
            System.out.print(min);
        else {
            System.out.print(max + " ");
            countDown(max - 1, min);
        }
    }


static void countDown() {
    int counter = 10;
    int i;
    for (i = counter; i >= 0; i--) {
        System.out.print(i + "\n");
    }


}




    static void countDown(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to count down from?");

        int counter = scanner.nextInt();
        int i;
        for(i = counter; i >= 0; i--){
            System.out.print(i + "\n");
        }

    }


}




