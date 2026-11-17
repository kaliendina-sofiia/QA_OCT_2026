package org.prog.session4;

public class Plane {

    static int countFreeSeats(int maxPassengersSeats, int maxTakenSeats) {

        return ((maxTakenSeats * 100) / maxPassengersSeats);
    }

    public static void main(String[] args) {
        String flightId;
        System.out.println("Welcome to the Plane" + " " + "flightId");

        String maxPasengersSeats;
        System.out.println("Maximum Passenger Seats");

        String maxTakenSeats;
        System.out.println("Maximum Taken Seats");

        int result = countFreeSeats( 1000,50 );
        System.out.println( "Free Seats" + " "  + result + "%");
    }
}