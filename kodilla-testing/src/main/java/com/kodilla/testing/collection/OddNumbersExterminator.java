package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (int n = 0; n < numbers.size(); n++) {
            if ((numbers.get(n)) % 2 != 0) {
                numbers.remove(numbers.get(n));
            }
        }
        return numbers;
    }
}