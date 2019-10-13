package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int n = 0; n < numbers.size(); n++) {
            if ((numbers.get(n)) % 2 == 0) {
                evenNumbers.add(numbers.get(n));
            }
        }
        return evenNumbers;
    }
}