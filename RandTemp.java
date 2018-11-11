package com.company;

import java.util.Random;
public class Main {

    public static void main(String[] args) {

/*
Write a program that generates a random temperature of water in degrees
Celsius and converts that value to Fahrenheit. The range of values for the
temperature should be between 0 and 100 degrees Celsius.
 */



        int max = 100;
        int min = 0;

        Random rand = new Random();

        int cel = rand.nextInt(max) + 1;


        System.out.println("A random Celcius temperature is: " + cel);

        double far= (cel * 9/5.0) +32;

        System.out.println("Converted to Farenheit the temperature is: " + far);
    }
}
