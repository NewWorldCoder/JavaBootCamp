//Task1 Deliverable Reverse Number

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        //The variable "num" is declared.
        System.out.println("Input your number and press enter: ");
        //This statement will capture my number input.
        Scanner in = new Scanner(System.in);
        //The number I input for reversal is stored in "num.
        num = in.nextInt();
        //The While Loop used to conjur the reverse number.
        System.out.print("Reverse of the input number is:");
        reverseMethod(num);
        System.out.println();
    }

    //A method for reverse
    public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            //Method is calling itself: recursion
            reverseMethod(number / 10);
        }
    }
}