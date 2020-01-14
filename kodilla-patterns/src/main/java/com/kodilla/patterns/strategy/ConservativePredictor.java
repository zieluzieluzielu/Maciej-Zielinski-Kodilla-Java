package com.kodilla.patterns.strategy;

public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debetures of XYZ";
    }
}
