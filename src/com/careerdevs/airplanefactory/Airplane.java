package com.careerdevs.airplanefactory;

public class Airplane {
    // passangers, (int)
    //maxspeed (float)
    //idcharacyer (char)
    //airlinename (string)
    // international (boolean)


    // creating the fields
    public int passengers;
    public float maxSpeed;
    public char idCharacter;
    public String airLineName;

    //this is the constructor
    public Airplane (int passengers, float maxSpeed, char idCharacter, String airLineName){

        this.airLineName  = airLineName;
        this.idCharacter = idCharacter;
        this.maxSpeed = maxSpeed;
        this.passengers = passengers;

    }

    // getters and setters


    //any other methods (tostring)

    @Override
    public String toString() {
        return "Airplane{" +
                "passengers=" + passengers +
                ", maxSpeed=" + maxSpeed +
                ", idCharacter=" + idCharacter +
                ", airLineName='" + airLineName + '\'' +
                '}';
    }
}
