// Author: Eric Li
// A20419312
// HW 6 - Inheritance
// This program will demonstrate the use of classes and objects with setter and getter
// functions as well as inheritance between Parent/Child Classes.

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> Account = new ArrayList<Account>();

        for (int i = 0; i < 2; i++) { // Loops the data entry process for the Services and Supplies objects for a total of 4 objects

            // Data entry for Service Object
            String hoursWorked = JOptionPane.showInputDialog("Enter the number of hours worked: ");
            double numberOfHours = Double.parseDouble(hoursWorked);

            String hourlyRate = JOptionPane.showInputDialog("Enter the rate per hour: ");
            double ratePerHour = Double.parseDouble(hourlyRate);

            String fullName = JOptionPane.showInputDialog("Enter the full name: ");

            String actNum = JOptionPane.showInputDialog("Enter the account number: ");
            int accountNum = Integer.parseInt(actNum);

            // Creates object of Services class
            Services s1 = new Services(numberOfHours, ratePerHour, fullName, accountNum);

            // Data entry for Supplies Object
            String numOfItems = JOptionPane.showInputDialog("Enter the number of items: ");
            double numberOfItems = Double.parseDouble(numOfItems);

            String ppItem = JOptionPane.showInputDialog("Enter the price per item: ");
            double pricePerItem = Double.parseDouble(ppItem);

            String fullName2 = JOptionPane.showInputDialog("Enter the full name: ");

            String actNum2 = JOptionPane.showInputDialog("Enter the account number: ");
            int accountNum2 = Integer.parseInt(actNum2);

            // Creates object of Supplies class
            Supplies s2 = new Supplies(numberOfItems, pricePerItem, fullName2, accountNum2);

            // Appends new objects to Account arraylist
            Account.add(s1);
            Account.add(s2);
        }

        for (int i = 0; i < Account.size(); i++) { // For loop to print out the object details in the Account arraylist
            JOptionPane.showMessageDialog(null, Account.get(i).toString(), "Account",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}