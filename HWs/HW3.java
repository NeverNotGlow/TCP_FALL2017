/*  
    Assignment: HW3 - Summation
    Author: [YOUR NAME]

    Note: to make this file easer to read you can turn on/off wordwrap in VSCode by pressing ALT+Z

    Description :
        In your third assignment you will show me that you know the basics of loops.

        In this assignment you will be creating a tool to sum up a bunch of numbers entered by a user at the command line.

    Steps:
        1) Fill in the missing sections of code indicated by comments bellow.

        2) Compile and run the program, and test it with a few different inputs.

        3) Upload to Moodle your modified version of this file.

    Example input and output classes:
        //I will use different test casses than these to grade. These test casses are so that you will know if your program is working or not.

        "Summation, enter 0 to finish
        4
        3
        1
        4
        5
        0
        Sum: 17"

        "Summation, enter 0 to finish
        100
        233
        1
        111
        0
        Sum: 445"

    Required files in your submission:
        - HW3.java that you have edited (NOT THE HW3.class)
*/

////// Do ASSIGNMENT BELLOW /////////

import java.util.Scanner;

public class HW3
{
    public static void main(String[] args)
    {
        int sum = 0;
        System.out.println("Summation, enter 0 to finish");

        /*
            Use a while loop to keep getting ints from
            a scanner and summing them up here.
        */

        System.out.println("Sum: " + sum);
    }
}