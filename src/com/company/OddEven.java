package com.company;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner read = new Scanner (System.in);
        System.out.println("Please give the number: ");
        int length = read.nextInt();
        int [] numbers = new int [length];

        int oddCounter = 0;
        int evenCounter=0;
        for (int i=0; i<length; i++){
            System.out.println("Please provide number: " + (i+1));
            numbers [i] = read.nextInt();
            if (numbers[i]%2==0){
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        System.out.println("Number of even: " + evenCounter);
        System.out.println("Number of odd: " + oddCounter);
    }
}
