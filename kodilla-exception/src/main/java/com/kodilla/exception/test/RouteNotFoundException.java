package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(){
        System.out.println("Route not found: Arrival airport is not available from your departure airport (exception).");
    }
}