// Author: Eric Li
// A20419312
// HW 5 - Classes and Objects
// This program will demonstrate the use of classes and objects with setter and getter
// functions.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of hours worked: ");
        double numberOfHours = sc.nextDouble();

        System.out.println("Enter the rate per hour: ");
        double ratePerHour = sc.nextDouble();

        // Creates object of Services class
        Services s1 = new Services(numberOfHours, ratePerHour);
        System.out.println(s1.toString());

        System.out.println("Enter the number of items: ");
        double numberOfItems = sc.nextDouble();

        System.out.println("Enter the price per item: ");
        double pricePerItem = sc.nextDouble();

        // Creates object of Supplies class
        Supplies s2 = new Supplies(numberOfItems, pricePerItem);
        System.out.println(s2.toString());

        sc.close();
    }
}