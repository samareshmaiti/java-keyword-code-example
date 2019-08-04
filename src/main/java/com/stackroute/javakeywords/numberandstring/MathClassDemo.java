package com.stackroute.javakeywords.numberandstring;

import java.lang.*;

public class MathClassDemo {
    public static void main(String[] args) {
        // Declaring the variables 
        int number1 = -1;
        float number2 = .5f;

        // Printing the values 
        System.out.println("Initial value of int  : " + number1);
        System.out.println("Initial value of int  : " + number2);


        // Use of .abs() method to get the absoluteValue 
        int absolute1 = Math.abs(number1);
        float absolute2 = Math.abs(number2);

        System.out.println("Absolute value of int : " + absolute1);
        System.out.println("Absolute value of int : " + absolute2);
        System.out.println("");

        // Use of acos() method 
        // Value greater than 1, so passing NaN 
        double Acosi = Math.acos(60);
        System.out.println("acos value of Acosi : " + Acosi);
        double x = Math.PI;

        // Use of toRadian() method 
        x = Math.toRadians(x);
        double Acosj = Math.acos(x);
        System.out.println("acos value of Acosj : " + Acosj);

    }
} 