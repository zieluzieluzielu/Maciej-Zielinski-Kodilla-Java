package com.kodilla.exception.test;

import java.util.HashMap;

class FlightSearch {
    private HashMap<String, Boolean> availableAirports;

    FlightSearch(HashMap<String, Boolean> availableAirports) {
        this.availableAirports = availableAirports;
    }

    void findFlight(Flight flight) throws RouteNotFoundException {

        if (availableAirports.containsKey(flight.getArrivalAirport()) && availableAirports.containsKey(flight.getDepartureAirport())) {

            if (availableAirports.get(flight.getArrivalAirport()) && availableAirports.get(flight.getDepartureAirport())) {
                System.out.println(flight+ ": This air connection is available.");
            } else {
                System.out.println(flight+ ": Airport connection not found. ");
            }
        } else {
            throw new RouteNotFoundException(flight+" : Route not found, airports are not available.");
        }
    }
}