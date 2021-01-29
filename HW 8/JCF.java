// Author: Eric Li
// A20419312
// HW 8 - Java Collections Framework
// This program is going to add and take the average of 50 random integers
// between 0 and 100. This program will demonstrate the use of the Java
// Collections Framework.

import java.util.Random;
import java.util.Collections;
import java.util.LinkedList;

public class JCF{

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(); // Creates linked list
        int sum = 0;

        Random rand = new Random();

        for (int i = 0; i < 50; i++){
            int num = rand.nextInt(100);
            list.add(num);
            // System.out.println(num); This is here to make sure my code was working
        }

        Collections.sort(list); // Sorts list

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i : list) { // Calculates Total
            sum += i;
        }
        float average = (float) sum / list.size();

        System.out.println("The sum of the elements in the linked list is: " + sum);
        System.out.println("The average of the elements in the linked list is: " + average);
    }
}
