/*Task2 Deliverable Calculate the Duration Between Dates   Victoria Owen
Be sure enter each input as a number.  I entered "June" instead of 6 and the program would'nt work.
Proper input ex:  7 4 2015.  This is the correct format for July, 4 2015.
 */

package com.company;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

//Intialize all variables.
        int firstYear;
        int secondYear;
        int firstMonth;
        int secondMonth;
        int firstDay;
        int secondDay;
        int firstDate;
        int secondDate;
        int calculatedDifference;

        firstYear = 0;
        secondYear = 0;
        firstMonth = 0;
        secondMonth = 0;
        firstDay = 0;
        secondDay = 0;

        //Both dates will be entered as we do in the USA; entering Month, Day, Year.
        //Prompt to enter the first month.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first month: ");
        firstMonth = scanner.nextInt();

        //Prompt to enter the first day.
        System.out.println("Enter the first day: ");
        firstDay = scanner.nextInt();

        //Prompt to enter the first year.
        System.out.println("Enter the first year: ");
        firstYear = scanner.nextInt();


        //Prompt to enter the second month.
        System.out.println("Enter the second month: ");
        secondMonth = scanner.nextInt();
        //input second date

        //Prompt to enter the second day.
        System.out.println("Enter the second day: ");
        secondDay = scanner.nextInt();

        //Prompt to enter the second year.
        System.out.println("Enter the second year: ");
        secondYear = scanner.nextInt();

        //Convert the input to days for both dates.  Not atomic clock accurate due to assorted number of days/month.
        firstDate = ((firstYear * 365) + (firstMonth * 30)) + firstDay;
        secondDate = ((secondYear * 365) + (secondMonth * 30)) + secondDay;

        /*  This calculates time span between second and first dates. If a later date is first, there may be a negative number.
            For example if 1stDate = Dec 25, 2016 and second date is Dec 23, 2016 the result will be -2.  In this case this
            is an accurate result.  */
        calculatedDifference = secondDate - firstDate;

        //Individually compute the following: months, days in between two dates.

        int years = calculatedDifference / 365;
        int months = (calculatedDifference % 365) / 30;
        int days = (calculatedDifference % 365) % 30;

        // output the difference

        System.out.println("Difference is: " + days + " days, " + months + " months and " + years + " years.");

    }
}


