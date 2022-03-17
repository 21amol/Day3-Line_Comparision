package com.bridgelabz;

import java.util.Scanner;


public class LineComparison {
    static Scanner sc = new Scanner(System.in);
    static float lenthLine1 = 0;
    static float lenthLine2 = 0;

    void compareTo() {

        if (lenthLine2 > lenthLine1) {
            System.out.println("Line 2 is greater than Line 1");
        } else {
            System.out.println("Line 2 is smaller than Line 1");
        }
    }

    void equalsTo() {
        System.out.println("Enter the value of x4: ");
        float x4 = sc.nextFloat();
        System.out.println("Enter the value of x3: ");
        float x3 = sc.nextFloat();
        System.out.println("Enter the value of y4: ");
        float y4 = sc.nextFloat();
        System.out.println("Enter the value of y3: ");
        float y3 = sc.nextFloat();
        lenthLine2 = (float) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of line 2 is: " + lenthLine2);

        if (lenthLine2 == lenthLine1) {
            System.out.println("Two lines are equal");
        } else {
            System.out.println("Two lines are not equal");
        }
    }

    public static void main(String[] args) {
        // welcome to line comparison program.

        // Using OOPS.....
        LineComparison lc = new LineComparison();          // object creation.....

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
        lenthLine1 = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line 1 is: " + lenthLine1);

        lc.equalsTo();
        lc.compareTo();

    }
}
