package com.company;
import jdk.jshell.Snippet;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Main {

    /* Arbitrary Person Class */
    static class Person {
        /* Properties of a Class */
        String name, height, age, sex, weight;

        /* Creating an Object by passing properties */
        Person(String name, String height, String age, String sex, String weight) {
            this.age = age;
            this.name = name;
            this.height = height;
            this.sex = sex;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Tule", "183", "23", "M", "78.5");
        Person person2 = new Person("Ash", "154", "69", "F", "55");

        Person person3 = new Person("Tule", "183", "23", "M", "78.5");

        System.out.println(person1.age.equals(person3.age));

         printDate();
        Scanner scanned = new Scanner(System.in);
        int reVal = getUserInput(scanned);
        System.out.println("GoodBye" + ", RetVal:" + reVal);

    }

    /* Prints Current Date and Time */
    public static void printDate() {
        Date date = new Date();
        System.out.println(date);
    }

    /* Gets User Input and Prints the year in which they were born */
    public static int getUserInput(Scanner scanned) {

        char [] letters = {'a', 'b', 'c', 'd', 'e', 'a', 'v', 'a'};
        int count = 0;

        for (char c : letters) {
            if (c == 'a') {
                ++count;
            }
        }

        while(true)

        {
            System.out.println("Age?");
            int numA = scanned.nextInt();

            if (numA == 6969) {
                System.out.println(count);
                return 69;

            } else {
                System.out.println(LocalDate.now().minusYears(numA).getYear());
            }
        }


    }
}
