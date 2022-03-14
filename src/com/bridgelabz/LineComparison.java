package com.bridgelabz;

import java.util.Scanner;


public class LineComparison {
    static Scanner sc = new Scanner(System.in);
    static double lenthLine1 = 0;
    static double lenthLine2 = 0;

    static void equals() {
        System.out.println("Enter the value of x4: ");
        double x4 = sc.nextDouble();
        System.out.println("Enter the value of x3: ");
        double x3 = sc.nextDouble();
        System.out.println("Enter the value of y4: ");
        double y4 = sc.nextDouble();
        System.out.println("Enter the value of y3: ");
        double y3 = sc.nextDouble();
        lenthLine2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of line is: " + lenthLine2);

        if (lenthLine2 == lenthLine1) {
            System.out.println("Two lines are equal");
        } else {
            System.out.println("Two lines are not equal");
        }
    }

    public static void main(String[] args) {
        // welcome to line comparison program.

        // Co-ordinates of X.
        System.out.println("Enter the value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of x2: ");
        double x2 = sc.nextDouble();

        // Co-ordinates of Y.
        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextDouble();

        // Calculating lenth between co-ordinates.
        lenthLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line is: " + lenthLine1);

        equals();

    }
}
