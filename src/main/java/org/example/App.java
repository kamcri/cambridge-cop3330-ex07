/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import  java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

        Scanner lengthScan = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        int length = lengthScan.nextInt();

        Scanner widthScan = new Scanner(System.in);
        System.out.println("What is the width of the room in feet?");
        int width = widthScan.nextInt();

        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet");

        int area = length * width;
        System.out.println("The area is:\n" + area + " square feet.");

        double meters = area * 0.09290304;
        System.out.println(meters + " square meters.");

        lengthScan.close();
        widthScan.close();
    }
}
