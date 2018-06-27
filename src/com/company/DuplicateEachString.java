package com.company;

import java.util.Arrays;

// Write a program, which will duplicate each String element of the given array

public class DuplicateEachString {
    public static void main(String[] args) {

        String [] input = {"a", "b","c"};

        String [] output = new String [input.length*input.length];

        int counter = 0;
        for (int i=0; i<output.length; i++){
            output [i] = input[counter];
            if ((i +1) % input.length == 0 && i != 0) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(output));
    }

}
