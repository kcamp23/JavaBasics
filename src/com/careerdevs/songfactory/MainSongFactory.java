package com.careerdevs.songfactory;
//  Fields: title (String), artist (String), genre (String), seconds (int)
import java.util.Scanner;

public class MainSongFactory {

    public static void main(String[] args) {
        createSong();
    }

    public static void createSong() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the tile? \n Title: ");
        String title = scanner.next();

        System.out.print("Who is the artist? \n Artist: ");
        String artist = scanner.next();

        System.out.print(" What is the genre? \n Genre:");
        String genre = scanner.next();

        System.out.print("How many seconds is this song? \n Seconds: ");
        int seconds = scanner.nextInt();

        Song myNewSong = new Song(title, artist, genre, seconds);


        System.out.print(myNewSong);
    }
}
