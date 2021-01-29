// Author: Eric Li
// HW 2: Control structures
// The purpose of this program is to display the activities of any user input day.

import java.util.Scanner;

public class Activities {
    public static void main(String[] args) {

            System.out.println("Enter a day of the week: ");
            Scanner sc = new Scanner(System.in);

            String day = sc.nextLine();

            if (day.equalsIgnoreCase("Monday")) {
                System.out.println("Today you have a work meet scheduled at 11:30 AM ");
            } // Monday

            else if (day.equalsIgnoreCase("Tuesday")) {
                System.out.println("You have a cello recital at 08:00 PM to attend ");
            } // Tuesday

            else if (day.equalsIgnoreCase("Wednesday")) {
                System.out.println("Today you are scheduled for a dentist appointment at 04:00 PM ");
            } // Wednesday

            else if (day.equalsIgnoreCase("Thursday")) {
                System.out.println("Today you have class at Mies Campus in Rettaliata Engineering building at 12:00 PM ");
            } // Thursday

            else if (day.equalsIgnoreCase("Friday")) {
                System.out.println("Today you need to shop for groceries ");
            } // Friday

            else if (day.equalsIgnoreCase("Saturday")) {
                System.out.println("Today you need to hit the gym ");
            } // Saturday

            if (day.equalsIgnoreCase("Sunday")) {
                System.out.println("Today you are visiting your parents in New York. Your flight leaves at 08:00 PM");
            } // Sunday

            sc.close();
    } // Main()
} // Class