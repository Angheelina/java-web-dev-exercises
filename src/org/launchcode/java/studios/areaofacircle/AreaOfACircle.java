package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner;
        System.out.println("What is the radius of the circle?");
        scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        scanner.close();

        double area = Circle.getArea(radius);

        System.out.println("The area of a radius of " + radius + " is " + area + ".");


    }
}
