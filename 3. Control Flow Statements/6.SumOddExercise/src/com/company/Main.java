package com.company;

public class Main {

    public static void main(String[] args) {

        int sumOfOdds = SumOddRange.sumOdd(1, 11);

        if(sumOfOdds < 0){
            System.out.println("Invalid parameter");
        }else{
            System.out.println("sum of odds = " + sumOfOdds);
        }

    }
}
