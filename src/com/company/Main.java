package com.company;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        /* Arrays */

        int [] intArr = new int[10];
        String [] strArr = new String [2];



        for (int i = 0; i < 10; ++i) {

            intArr[i] = i;

            if (i == 0) {
                strArr[i] = "Hello";
            } else if (i == 1) {
                strArr[i] = "Mellow";
            }

        }

        /* Enhanced For Loop */
        for (String count : strArr) {
            //System.out.println(count);

            if (count.equals("Hello") || count.equals("Mellow")) {
               // System.out.println("craze");
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] += 10;
        }

        System.out.println(Arrays.toString(intArr));

    }
}
