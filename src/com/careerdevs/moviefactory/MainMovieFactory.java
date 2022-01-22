package com.careerdevs.moviefactory;
//Fields: title (String), director (String), runtimeInMin (float), hasBeenReleased
import java.util.Scanner;

public class MainMovieFactory {
    public static void main(String[] args) {
        buildAMovie ();
    }



    public static void buildAMovie() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the movie title? \n Title:");
        String title = scanner.next();


        System.out.print("Who is the director? \n Director Name: ");
        String director = scanner.next();

        System.out.print("How many minutes is the run time? \n minutes:");
        float runTimeMinutes = scanner.nextFloat();

        System.out.print("Has it been released yet? \n Released true or false:");
        boolean hasBeenReleased  = scanner.nextBoolean();

        Movie  myMovie = new Movie(title,director,runTimeMinutes,hasBeenReleased);


        System.out.print(myMovie);

    }
}