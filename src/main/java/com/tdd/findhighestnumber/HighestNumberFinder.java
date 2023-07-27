package com.tdd.findhighestnumber;

public class HighestNumberFinder {
    public int findHighestNumber(int[] array) {
        int highestSoFar = array[0];
        if(array.length > 1 && array[1] > highestSoFar)
            highestSoFar = array[1];

        return highestSoFar;
    }
}
