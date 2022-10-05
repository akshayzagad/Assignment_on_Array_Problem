package com.bridgelabz;

public class Even_Position {
    public static void main(String[] args) {
        int[] mylist = {10, 12, 58, 45, 32, 1, 2, 5, 7, 3};
        for (int i = 0; i < mylist.length; i++) {
            if (i % 2 == 0) {
                System.out.println("odd posion element " + mylist[i]);
            }

        }

    }
}
