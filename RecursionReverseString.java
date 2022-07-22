package com.java.scaler.recursion;

public class RecursionReverseString {
    int i = 0;
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        //Scanner scan = new Scanner(System.in);
        //String input = scan.nextLine();
        String input = "saurabh"; //scaleracademy
        //System.out.println(input);
        char[] inputChar = input.toCharArray();
        int length = inputChar.length;
        int endIndex = length -1;
        //System.out.println(length);
        new RecursionReverseString().swapChar(inputChar, length, endIndex);
    }

    private void swapChar(char[] ch, int length, int endIndex){
        if(i>=length/2){
            System.out.println(String.valueOf(ch));
            return;
        }
        char temp = ch[i];
        ch[i] = ch[endIndex];
        ch[endIndex] = temp;
        i++;
        endIndex--;
        swapChar(ch, length, endIndex);
    }
}
