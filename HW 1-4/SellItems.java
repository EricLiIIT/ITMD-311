// Author: Eric Li
// A20419312
// HW 3
// The purpose of this program is to calculate the sales tax of the input values of items
// with the use of an array and loops.
// The price of each item, a subtotal, and total (with sales tax) will be printed.

import java.util.Scanner;
import java.text.DecimalFormat;

public class SellItems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the quantity of prices you want to input: ");

        // The size of the array is created for how many items the user wants to enter
        int quantity = sc.nextInt();
        float [] prices = new float [quantity];

        System.out.println("Please enter the price of each item: ");

        // This for loop accepts the user input prices for the given array length
        for (int i = 0; i < quantity; i++) {
            float p = sc.nextFloat();
            prices[i] = p;
        }

        sc.close();
        float total = 0;

        // This for loop calculates the elements in the array (the prices of the items entered)
        for (int i = 0; i < prices.length; i++){
            total += prices[i];
            }

        // This for loop prints each element (price) in the array
        for (int i = 0; i < prices.length; i++){
            System.out.println("The price of each item entered: " + prices[i] + " ");
        }

        DecimalFormat df = new DecimalFormat(".00"); // Decimal Format

        // These print statements output the subtotal, tax, and total with tax
        System.out.println("Your subtotal is: " + total);
        System.out.println("The tax to be applied is: " + df.format((total * 0.0725)));
        System.out.println("The total price including tax is: " + df.format((total + (total * 0.0725))));
    }
}