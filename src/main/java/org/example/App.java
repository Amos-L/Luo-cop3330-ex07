/*
 *  UCF COP3330 Fall 2021 Assignment 1.7 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? "); //Asking for user input
        int len = x.nextInt(); //Storing user input
        System.out.print("What is the width of the room in feet? ");
        int width = x.nextInt();

        System.out.printf("You entered dimensions of %d feet by %d feet.\n",len, width );
        int squareft = len * width; //Doing math for square feet
        double sqmeter = squareft * 0.09290304; //Double used for decimal

        System.out.printf("The area is\n%d square feet\n%.3f square meters", squareft, sqmeter); //Printing
    }
}