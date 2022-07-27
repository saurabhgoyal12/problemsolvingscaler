package com.java.scaler.bitmanipulation;

public class SingleNumber {
    public static void main(String[] str){
        int[] input = {1, 3, 4, 5, 4, 3, 5};
        int result=0;
        //System.out.print(2^2);
        for (int i=0; i<input.length; i++){
            result = result ^ input[i];
        }
        System.out.print(result);
    }
}
