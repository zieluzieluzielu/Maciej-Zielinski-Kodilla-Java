package com.kodilla.exception.test;

public class FlightSearchApplication {
    public static void main(String[] args) {

        FlightsStub flightsStub = new FlightsStub();
        FlightSearch flightSearch = new FlightSearch(flightsStub.getFlights());

        try {
            flightSearch.findFlight(new Flight("XXX", "BBB"));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());

        }
    }
}