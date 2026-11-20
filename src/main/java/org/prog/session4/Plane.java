package org.prog.session4;

   public class Plane{

     Plane Plane = new Plane();
    public String maxPassengersSeats;
    public String maxTakenSeats;
    public String flightId;



    public Plane() {

    }


    public static int countFreeSeats(int maxPassengersSeats, int maxTakenSeats) {
        return ((maxTakenSeats * 100) / maxPassengersSeats);}

     public   Plane( String flightId, String maxPassengersSeats, String maxTakenSeats ) {

            System.out.println("Welcome to the Plane" + "flightId");


        System.out.println("Maximum Passenger Seats");

           System.out.println("Maximum Taken Seats");


           int result = countFreeSeats( 1000,50 );
        System.out.println( "Free Seats" + " "  + result + "%");
    }}
