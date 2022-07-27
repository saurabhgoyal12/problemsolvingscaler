package com.java.scaler.recursion;

public class MagicNumberWithRecursion {

    public static void main(String[] str){
        int input = 83557;
        int result = new MagicNumberWithRecursion().isMagicNumber(input);
        System.out.print(result);
    }

    private int isMagicNumber(int A){
        int result = 0;
        String inputString = String.valueOf(A);
        char[] inputChar = inputString.toCharArray();
        if (inputChar.length==1 && A!=1){
            return 0;
        }

        for (char c : inputChar) {
            result = result + Integer.parseInt(String.valueOf(c));
        }
        if (result==1){
            return result;
        }

        return isMagicNumber(result);
    }

}
