package com.kodilla.exception.test;

class Flight {
    private String departureAirport;
    private String arrivalAirport;

    Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    String getDepartureAirport() {
        return departureAirport;
    }

    String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return departureAirport +"->"+arrivalAirport;
    }
}
