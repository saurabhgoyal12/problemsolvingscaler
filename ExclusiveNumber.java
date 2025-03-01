package com.scaler.dsa.bitmanipulations;

import java.util.function.Consumer;

public class ExclusiveNumber {

    /**
     *  Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
     */
    // XOR (^) of a number with itself returns zero. After applying ^ on each element, the exclusive number will be left alone.
    public int singleNumber(final int[] A) {
        int result=A[0];
        for(int i=1; i<A.length; i++){
            result = result^A[i];
        }
        return result;
    }

    public static void main(String [] strings) {
        int[] input = {40, 13, 10, 13, 8, 8, 56, 40, 56};
        System.out.print(new ExclusiveNumber().singleNumber(input));
    }
}
