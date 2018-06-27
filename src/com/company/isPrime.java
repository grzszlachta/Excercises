package com.company;

public class isPrime {

    public static void main(String[] args) {
        System.out.println("7 = " + checkIsPrime(5));
        System.out.println("11 = " + checkIsPrime(11));
        System.out.println("10 = " + checkIsPrime(10));
    }

    public static boolean checkIsPrime (int input){
        for (int i=2; i<=input/2; i++){
            if (input % i == 0){
                return false;
            }
        }
        return true;
    }
}
