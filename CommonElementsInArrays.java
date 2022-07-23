package com.java.scaler.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonElementsInArrays {
    int commonElementsIndex = 0;
    public static void main(String[] args) {

        int[] input1 = { 2, 1, 4, 10};
        int[] input2 = {3, 6, 2, 10, 10};
        int[] result =  new CommonElementsInArrays().findCommonElements(input1, input2);
        System.out.println(Arrays.toString(result));

    }

    private int[] findCommonElements(int[]A, int[]B){
        int[] commonElements = new int[A.length];

        Map<Integer, Integer> mapOfA = new HashMap<>();
        Map<Integer, Integer> mapOfB = new HashMap<>();

        for(int i=0; i<A.length; i++){
            if(mapOfA.containsKey(A[i])){
                mapOfA.put(A[i], mapOfA.get(A[i])+1);
            }
            else{
                mapOfA.put(A[i], 1);
            }
        }

        for(int i=0; i<B.length; i++){
            if(mapOfB.containsKey(B[i])){
                mapOfB.put(B[i], mapOfB.get(B[i])+1);
            }
            else{
                mapOfB.put(B[i], 1);
            }
        }

        int compareCount  = mapOfA.size()<mapOfB.size() ? mapOfA.size() : mapOfB.size();
        char compareArray = mapOfA.size()<mapOfB.size() ? 'A' : 'B';

            if(compareArray=='A'){
                for(Integer key : mapOfA.keySet()){
                    if(mapOfB.containsKey(key)){
                        int keyCount = mapOfA.get(key) < mapOfB.get(key) ? mapOfA.get(key) : mapOfB.get(key);
                        for (int y = 0; y < keyCount; y++) {
                            commonElements[commonElementsIndex] = key;
                            commonElementsIndex++;
                        }
                    }
                }
            }
            else if(compareArray=='B'){
                for(Integer key : mapOfB.keySet()) {
                    if (mapOfA.containsKey(key)) {
                        int keyCount = mapOfA.get(key) < mapOfB.get(key) ? mapOfA.get(key) : mapOfB.get(key);
                        for (int y = 0; y < keyCount; y++) {
                            commonElements[commonElementsIndex] = key;
                            commonElementsIndex++;
                        }
                    }
                }
            }
            int[] returnArray = new int[commonElementsIndex];
            for(int q=0; q<commonElementsIndex; q++){
                returnArray[q] = commonElements[q];
            }
        return returnArray;
    }
}
