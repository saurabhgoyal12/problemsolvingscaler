package com.java.scaler.recursion;

public class RecursionSumOfDigits {

    int i = 0;
    public static void main(String[] str){
        int result = new RecursionSumOfDigits().solve(12);
    }

    public int solve(int A) {
        String input = String.valueOf(A);
        char[] ch = input.toCharArray();
        int length = ch.length;
        int sum = 0;

        if(A==0){
            return 0;
        }
        return sumDigits(ch, length, sum);
    }

    private int sumDigits(char[] charA, int length, int sum){
        if(i>=length){
            return sum;
        }
        int s = sum + Integer.parseInt(String.valueOf(charA[i]));
        i++;
        return sumDigits(charA, length, s);
    }
}
