package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

public class CollectionTestSuite {

    private final OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
    @Before
    public void before(){
        System.out.println("Test Case: Begin.");
    }
    @After
    public void after() {
        System.out.println("Test Case: End.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        //When
        oddNumbersExterminator.exterminate(arrayList1);
        //System.out.println("List after clearing: "+arrayList1);
        Integer result = arrayList1.size();
        //Then
        Assert.assertTrue(result == 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);
        arrayList1.add(6);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(arrayList1);
        //System.out.println("List after clearing odds: "+result);
        //Then
        Assert.assertEquals(result.size(), 3);
    }

}