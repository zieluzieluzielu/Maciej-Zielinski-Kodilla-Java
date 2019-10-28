package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //GIVEN
        Continent europe = new Continent();
        europe.addCountry(new Country("Polska", new BigDecimal("23412341234")));
        europe.addCountry(new Country("Italy",new BigDecimal("21312321424")));
        europe.addCountry(new Country("Germany", new BigDecimal("123241554")));

        Continent africa = new Continent();
        africa.addCountry(new Country("Congo", new BigDecimal("555555435")));
        africa.addCountry(new Country("Egypt",new BigDecimal("2313213155")));
        africa.addCountry(new Country("Nigeria", new BigDecimal("13213311")));

        //WHEN
        World world = new World();
        world.addContinent(africa);
        world.addContinent(europe);
        BigDecimal actual = world.getPeopleQuantity();

        //THEN
        BigDecimal expectedPeopleQuantity = new BigDecimal("47729886113");
        Assert.assertEquals(expectedPeopleQuantity, actual);

    }
}
