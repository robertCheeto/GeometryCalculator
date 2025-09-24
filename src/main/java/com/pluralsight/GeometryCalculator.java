package com.pluralsight;

public class GeometryCalculator {
    public static void main(String[] args) {
        // Part 1 - Circle Area
        double circleRadius = 5.5;
        double rectangleLength = 8.2;
        double rectangleWidth = 3.7;
        double triangleBase = 6.0;
        double triangleHeight = 4.5;

        System.out.println("Calculating the are of a circle of the radius is " + circleRadius + "...");
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.printf("The area of that circle would be: %.2f\n", circleArea);

        // Part 2 - Circle Circumference
        System.out.println("Calculating the circumference of the Circle...");
        double circleCircumference = (2 * Math.PI * circleRadius);
        System.out.printf("The circumference of the circle would be: %.2f\n\n\n", circleCircumference);

        // Part 3 - Rectangle Area and Perimeter
        System.out.println("Calculating the Area of a Rectangle with a length of " + rectangleLength + " and a width of " + rectangleWidth + ".");
        double rectangleArea = rectangleWidth * rectangleLength;
        System.out.printf("The area of that rectangle is: %.2f\n", rectangleArea);
        System.out.println("Calculating the Perimeter of that same Rectangle...");
        double rectanglePerimeter = 2 * (rectangleWidth + rectangleLength);
        System.out.printf("The perimeter of that rectangle is: %.2f\n\n\n", rectanglePerimeter);


    }
}
