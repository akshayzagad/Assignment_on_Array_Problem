package com.bridgelabz;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        int[] mylist = {10, 12, 58, 45, 32, 1, 2, 5, 7, 3};
         int Second_Big_NUmber=secondBiggestNumber(mylist);
        if ( Second_Big_NUmber==0){
            System.out.println("NO second largest Number");
        }
        else {
            System.out.println("Number = "+ Second_Big_NUmber);
        }
    }

    static int secondBiggestNumber(int[] mylist) {
        int First_Number = 0;
        int Second_Number = 0;
        for (int i = 0; i < mylist.length; i++) {
            if (mylist[i] > First_Number) {
                 Second_Number =First_Number;
                First_Number = mylist[i];
            }
            else if (mylist[i]>Second_Number & mylist[i]!=First_Number){
                Second_Number=mylist[i];
            }
        }  return Second_Number;
    }
}
