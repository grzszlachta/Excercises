package com.company;

import java.util.Arrays;

// Write a program, which will duplicate each String element of the given array

public class DuplicateEachString {
    public static void main(String[] args) {

        String [] input = {"a", "b","c"};
        repeater1(input);
        repeater2(input, 2);
        repeater2(input, 3);
        repeater2(input, 5);
    }

    public static String repeater1 (String [] input){
        String [] output = new String [input.length*input.length];

        int counter = 0;
        for (int i=0; i<output.length; i++){
            output [i] = input[counter];
            if ((i +1) % input.length == 0 && i != 0) {
                counter++;
            }
        }
        System.out.println("Result of repeater1: " + Arrays.toString(output));
        String result = new String (output.toString());
        return result;
    }

    public static String repeater2 (String[] input, int n){

        StringBuilder sB = new StringBuilder();

        for (String letter : input){
            for (int i=0; i<n; i++){
                sB.append(letter);
            }
        }
        String result = new String (sB.toString());
        System.out.println("Result of repeater2 (n= " + n + "): " + result );
        return result;
    }

}
