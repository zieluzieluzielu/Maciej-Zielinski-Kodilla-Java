package com.kodilla.exception.test;
import java.util.HashMap;

public class FlightSearch {
    HashMap<String, Boolean> availableAirports;

    public FlightSearch(HashMap<String, Boolean> availableAirports) {
        this.availableAirports = availableAirports;
    }

    public void findFlight (Flight flight) throws RouteNotFoundException {

        if (availableAirports.containsKey(flight.getArrivalAirport())) {

            if(availableAirports.get(flight.getArrivalAirport())) {
                System.out.println(flight.getArrivalAirport()+" Airport found: This airport is available from your departure airport.");
            }
            else {
                System.out.println("Airport not found: Arrival airport is not available from your departure airport.");
            }
        }
        else {
            throw new RouteNotFoundException();
        }
    }

}