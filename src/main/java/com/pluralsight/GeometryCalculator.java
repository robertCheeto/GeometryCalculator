package com.pluralsight;

public class GeometryCalculator {
    public static void main(String[] args) {
        // Part 1 - Circle Area
        double circleRadius = 5.5;
        double rectangleLength = 8.2;
        double rectangleWidth = 3.7;
        double triangleBase = 6.0;
        double triangleHeight = 4.5;

        System.out.println("Calculating the are of a circle if the radius is " + circleRadius + " units...");
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.printf("The area of that circle would be: %.2f square units.\n", circleArea);

        // Part 2 - Circle Circumference
        System.out.println("Calculating the circumference of the Circle...");
        double circleCircumference = (2 * Math.PI * circleRadius);
        System.out.printf("The circumference of the circle would be: %.2f units.\n\n\n", circleCircumference);

        // Part 3 - Rectangle Area and Perimeter
        System.out.println("Calculating the Area of a Rectangle with a length of " + rectangleLength + " units and a width of " + rectangleWidth + " units.");
        double rectangleArea = rectangleWidth * rectangleLength;
        System.out.printf("The area of that rectangle is: %.2f square units.\n", rectangleArea);
        System.out.println("Calculating the Perimeter of that same Rectangle...");
        double rectanglePerimeter = 2 * (rectangleWidth + rectangleLength);
        System.out.printf("The perimeter of that rectangle is: %.2f units.\n\n\n", rectanglePerimeter);

        // Step 4 - Calculate Triangle Area with Math.sqrt() to find the Hypotenuse
        // area = (1/2) * base * height
        System.out.println("Calculating the Area of a Triangle with a base of " + triangleBase + " units and a height of " + triangleHeight + " units.");
        double triangleArea = (triangleBase * triangleHeight * (1.0/2.0));
        System.out.printf("The area of that Triangle would be %.2f square units.\n", triangleArea);
        double triangleHypotenuse = Math.sqrt(Math.pow(triangleBase, 2) + Math.pow(triangleHeight, 2));
        System.out.printf("The hypotenuse of the Triangle would be %.2f units.\n\n", triangleHypotenuse);

        // Step 5 - calculate sum of total Area
        double totalArea = circleArea + rectangleArea + triangleArea;

        System.out.println("********************************************");
        System.out.printf("The total area calculated is: %.2f square units.", totalArea);

    }
}
