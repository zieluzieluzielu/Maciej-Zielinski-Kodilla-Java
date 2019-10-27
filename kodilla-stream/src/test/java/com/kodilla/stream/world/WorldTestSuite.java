package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //GIVEN
        Continent Europe = new Continent();
        Europe.addCountry(new Country("Polska", new BigDecimal("23412341234")));
        Europe.addCountry(new Country("Italy",new BigDecimal("21312321424")));
        Europe.addCountry(new Country("Germany", new BigDecimal("123241554")));

        Continent Africa = new Continent();
        Africa.addCountry(new Country("Congo", new BigDecimal("555555435")));
        Africa.addCountry(new Country("Egypt",new BigDecimal("2313213155")));
        Africa.addCountry(new Country("Nigeria", new BigDecimal("13213311")));

        //WHEN
        World world = new World();
        world.addContinent(Africa);
        world.addContinent(Europe);
        BigDecimal actual = world.getPeopleQuantity();

        //THEN
        BigDecimal expectedPeopleQuantity = new BigDecimal("47729886113");
        Assert.assertEquals(expectedPeopleQuantity, actual);

    }
}
