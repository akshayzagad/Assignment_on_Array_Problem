package com.bridgelabz;

public class Smallest_Number {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
// Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
// Finding the largest element
        double min = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        System.out.println("Max is " + min);

    }
}
