// Author: Eric Li
// A20419312
// HW 6 - Inheritance
// This program will demonstrate the use of classes and objects with setter and getter
// functions as well as inheritance between Parent/Child Classes.

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> Account = new ArrayList<Account>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) { // Loops the data entry process for the Services and Supplies objects for a total of 4 objects

            // Data entry for Service Object
            // String hoursWorked = JOptionPane.showInputDialog("Enter the number of hours worked: ");
            // double numberOfHours = Double.parseDouble(hoursWorked);

            System.out.print("Enter the number of hours worked: ");
            double numberOfHours = sc.nextDouble();

            // String hourlyRate = JOptionPane.showInputDialog("Enter the rate per hour: ");
            // double ratePerHour = Double.parseDouble(hourlyRate);

            System.out.print("Enter the rate per hour: ");
            double ratePerHour = sc.nextDouble();

            // String fullName = JOptionPane.showInputDialog("Enter the full name: ");

            System.out.print("Enter the full name: ");
            sc.nextLine();
            String fullName = sc.nextLine();

            // String actNum = JOptionPane.showInputDialog("Enter the account number: ");
            // int accountNum = Integer.parseInt(actNum);

            System.out.print("Enter the account number: ");
            int accountNum = sc.nextInt();

            // Creates object of Services class
            Services s1 = new Services(numberOfHours, ratePerHour, fullName, accountNum);

            // Data entry for Supplies Object

            // String numOfItems = JOptionPane.showInputDialog("Enter the number of items: ");
            // double numberOfItems = Double.parseDouble(numOfItems);

            System.out.print("Enter the number of items: ");
            double numberOfItems = sc.nextDouble();

            // String ppItem = JOptionPane.showInputDialog("Enter the price per item: ");
            // double pricePerItem = Double.parseDouble(ppItem);

            System.out.print("Enter the price per item: ");
            double pricePerItem = sc.nextDouble();

            // String fullName2 = JOptionPane.showInputDialog("Enter the full name: ");

            System.out.print("Enter the full name: ");
            sc.nextLine();
            String fullName2 = sc.nextLine();

            // String actNum2 = JOptionPane.showInputDialog("Enter the account number: ");
            // int accountNum2 = Integer.parseInt(actNum2);

            System.out.print("Enter the account number: ");
            int accountNum2 = sc.nextInt();

            // Creates object of Supplies class
            Supplies s2 = new Supplies(numberOfItems, pricePerItem, fullName2, accountNum2);

            // Appends new objects to Account arraylist
            Account.add(s1);
            Account.add(s2);
        }
        sc.close();

        for (int i = 0; i < Account.size(); i++) { // For loop to print out the object details in the Account arraylist
            // JOptionPane.showMessageDialog(null, Account.get(i).toString(), "Account",
                // JOptionPane.INFORMATION_MESSAGE);
            System.out.println(Account.get(i).toString());
        }
    }
}