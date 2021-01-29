// Name: Eric Li
// A20419312
// HW 1
// The purpose of this program is to accept 4 numbers from a user that will be totaled and averaged, then outputted.

import java.util.Scanner;
import java.text.DecimalFormat; // Controls appearance of numbers that are stored as strings

    public class Average{

        public static void main(String[] args){

            // Variable declaration
            double num1, num2, num3, num4, avg, total;

            // Data Validation
            try {

                System.out.print("Enter a number: ");

                Scanner sc = new Scanner(System.in);
                num1 = sc.nextDouble();

                System.out.print("Enter your second number: ");
                num2 = sc.nextDouble();

                System.out.print("Enter your third number: ");
                num3 = sc.nextDouble();

                System.out.print("Enter your final number: ");
                num4 = sc.nextDouble();

                // Calculates sum and average of the numbers
                total = num1 + num2 + num3 + num4;
                avg = (num1 + num2 + num3 + num4) / 4;

                // Prints double to 3 decimal places
                DecimalFormat df = new DecimalFormat(".000");

                // Prints outputs
                System.out.println("The sum of the numbers entered is " + df.format(total));
                System.out.println("The average of the numbers entered is "+ df.format(avg));
                sc.close();
            }
            // Prints what error is made
            catch (Exception e) {
                System.out.println("Invalid data detected: " + e);
            }
        }
    }
