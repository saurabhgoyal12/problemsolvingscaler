package com.java.scaler.modulo;

public class FindAModB {

    public static void main(String[] str){
        String inputString = "6562800446546751053033681283622332585949169375825307419010747907087102529693988502714663897293527240363734284937813181135000995192664742291904645171438423695200374401117403";
        int divisor = 36173;
        int result = new FindAModB().findMod(inputString, divisor);
        System.out.println("Result - " + result);
    }

    public int findMod(String A, int B) {
        char[] input = A.toCharArray();
        int length = input.length;
        int endIndex = length-1;
        long sumOfModulo = 0;
        for(int i=0; i<length; i++){
            //calculate input[i]*10^i % B
            sumOfModulo = sumOfModulo + ((Long.parseLong(String.valueOf(input[endIndex-i])))%B*(long)Math.pow(10,i)%B) % B;
        }
        return (int)sumOfModulo%B;
    }
}
