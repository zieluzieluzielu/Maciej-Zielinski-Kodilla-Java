package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearchApplication {
    public static void main(String[] args) {

        Flight flight1 = new Flight("WAW", "LCJ");
        Flight flight2 = new Flight("LCJ", "WAW");
        Flight flight3 = new Flight("WRO", "GDN");
        Flight flight4 = new Flight("WKR", "KTW");
        Flight flight5 = new Flight("KTW", "WKR");
        Flight flight6 = new Flight("XXX", "YYY");


        HashMap<String, Boolean> availableAirports = new HashMap<>();

        availableAirports.put(flight1.getDepartureAirport(), true);
        availableAirports.put(flight2.getDepartureAirport(), true);
        availableAirports.put(flight3.getDepartureAirport(), true);
        availableAirports.put(flight4.getDepartureAirport(), true);
        availableAirports.put(flight5.getDepartureAirport(), false);
        availableAirports.put(flight6.getDepartureAirport(), true);

        FlightSearch flightSearch = new FlightSearch(availableAirports);

        try {
            flightSearch.findFlight(flight6);
        }
        catch (RouteNotFoundException e) {
        }
    }
}