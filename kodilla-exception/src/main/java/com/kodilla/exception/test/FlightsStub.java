package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightsStub implements FlightsMap {
    @Override
    public HashMap<String, Boolean> getFlights() {
        HashMap<String, Boolean> stubResult = new HashMap<>();
        stubResult.put("XXX", true);
        stubResult.put("YYY", true);
        stubResult.put("ZZZ", true);
        stubResult.put("AAA", true);
        stubResult.put("BBB", false);
        stubResult.put("CCC", true);
        return stubResult;

    }
}
