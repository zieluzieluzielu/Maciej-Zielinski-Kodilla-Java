package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

        private final List<Continent> continents = new ArrayList<>();

        public void addContinent(Continent continent){
                continents.add(continent);
        }

        public BigDecimal getPeopleQuantity(){
                return continents.stream()
                        .flatMap(countries -> countries.getCountries().stream())
                        .map(country -> country.getPeopleQuantity())
                        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        }


}