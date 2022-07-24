package com.java.scaler.hashing;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *  Return repeating element with smallest index in the array,
 */
public class RepeatingElement {
    public static void main(String[] args) {

        int[] input = {10, 5, 3, 4, 3, 5, 6}; // should return 5
        int returnedIndex = new RepeatingElement().findRepeatingElementWithLowestIndex(input);
        System.out.print(returnedIndex);
    }

    private int findRepeatingElementWithLowestIndex(int[] input){

        Set<Integer> collection = new HashSet<>();
        int lengthOfInputArray = input.length;
        int maxIndex = lengthOfInputArray - 1;
        int resultedElement = -1;
        for(int i=maxIndex; i>=0; i--){
            if(collection.contains(input[i])){
                resultedElement = input[i];
            }
            collection.add(input[i]);
        }
        return resultedElement;
    }
}
