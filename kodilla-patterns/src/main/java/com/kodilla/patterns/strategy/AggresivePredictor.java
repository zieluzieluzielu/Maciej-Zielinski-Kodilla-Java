package com.kodilla.patterns.strategy;

public class AggresivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
