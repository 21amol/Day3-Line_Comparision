package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // welcome to line comparison program.
        double lenthLine = 0;
        Scanner sc = new Scanner(System.in);
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
        lenthLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line is: " + lenthLine);

    }
}
