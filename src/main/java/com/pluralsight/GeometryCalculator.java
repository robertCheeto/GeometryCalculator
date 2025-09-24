package com.pluralsight;

public class GeometryCalculator {
    public static void main(String[] args) {
        double circleRadius = 5.5;
        double rectangleLength = 8.2;
        double rectangleWidth = 3.7;
        double triangleBase = 6.0;
        double triangleHeight = 4.5;

        System.out.println("Calculating the are of a circle of the radius is " + circleRadius + "...");
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.printf("The area of that circle would be: %.2f\n", circleArea);


    }
}
