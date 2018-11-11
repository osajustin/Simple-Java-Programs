package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
// The program I am writing will ask:
// the number of shares of stock to be purchased
//the price of each share
//the percentage of commission their stock broker receives (as an integer)

        int shares;
        double  totalwoc, justc, total, price, percent;


        Scanner scan = new Scanner (System.in);

        System.out.println("This program will help you determine the cost of your stock transaction.");
        System.out.println("Please enter the number of shares of stock to be purchased: ");
        shares = scan.nextInt();

        System.out.println("Please enter the price of each share: ");
        price = scan.nextDouble();

        System.out.println("Please enter the percentage of commission their stock broker receives as a whole number: ");
        percent = scan.nextInt();

        totalwoc = shares * price;

        justc = (percent / 100) * totalwoc;

        total = justc + totalwoc;


        System.out.println("The total price spent without commision is: " + totalwoc);
        System.out.println("The total price spent on just commision is: " + justc);
        System.out.println("The total price spent is: " + total);

    }
}
