// Author: Eric Li
// A20419312
// ITM 311 HW 4 - Java Methods
// The purpose of this program is to calculate and display the hours worked and money earned by an employee.
// This includes overtime hours as well. One method calculates the money earned and the other displays the
// money earned.

import java.util.Scanner;

public class payroll {

    public static void main(String[] args) {
        double payRate, hoursWorked;
        String fullName;
        int employeeCount;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees are you doing payroll for today? ");

        employeeCount = sc.nextInt();
        String[] nameList = new String [employeeCount];
        double[] hours = new double[employeeCount];

        for (int x = 0; x < employeeCount; x++){
            System.out.print("Enter the name of the employee: ");
            sc.nextLine();
            fullName = sc.nextLine();
            nameList[x] = fullName;
            System.out.print("Indicate the hours for " + fullName + ": ");
            hoursWorked = sc.nextInt();
            hours[x] = hoursWorked;
        } // Takes name input and hours input for each employee
        sc.close();

        for (int x = 0; x < employeeCount; x++){
            if (hours[x] <= 40) {
                payRate = 1.0;
            }
            else {
                payRate = 1.5;
            } // Determines pay rate

            // Calling secondary and tertiary methods
            double payment = computePay(hours[x], payRate);
            displayPay(nameList[x], hours[x], payment);
        }
    } // Main

    public static double computePay(double hoursWorked, double payRate) {
        double grossPay = hoursWorked * 32 * payRate;
        return grossPay;
    } // Calculates gross pay

    public static void displayPay(String fullName, double hoursWorked, double grossPay) {
        System.out.println(fullName);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Gross Pay: " + grossPay + " ");
    } // Returns name, gross pay, and hours worked

}