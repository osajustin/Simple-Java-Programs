package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

/*In this program I will be asking the user to inter in data for two coordinate points and
the program should be able to find the distance between the two given points.
 */

                int x1, x2, y1, y2;
                double distance;

                Scanner scan = new Scanner (System.in);

                System.out.println("What is the x component of the first coordiniate, the y?");
                x1 = scan.nextInt();
                y1 = scan.nextInt();

                System.out.println("What is the x component of the second coordinate point, the y?");
                x2 = scan.nextInt();
                y2 = scan.nextInt();

        distance = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));

        System.out.println("The distance between the two coordinate points are:" + distance);

        //'I pledge my Honor that I have not cheated, and will not cheat, on this assignment' Justin Osagie

    }
}
