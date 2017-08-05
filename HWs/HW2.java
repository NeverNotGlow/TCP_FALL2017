/*  
    Assignment: HW2 - Pythagorean
    Author: [YOUR NAME]

    Note: to make this file easier to read you can turn on/off wordwrap in VSCode by pressing ALT+Z

    Description:
        In your second assignment you will show me that you have learned the basics of variables, 'if' statements, and getting input from the command line.

        In this assignment you will be creating a tool to apply the pythagorean theorem to values that the user enters.

    Steps:
        1) Fill in the missing sections of code indicated by comments below.

        2) Compile and run the program, and test it with a few diffrent inputs.

        3) Upload to Moodle your modified version of this file.

    Example input and output Classes:
        //I will use different test cases than these to grade. These test casses are so that you will know if your program is working or not.

        "A^2 + B^2 = C^2
        Enter 1 if you have a and b
        Enter 2 if you have a/b and c
        1
        Enter A:
        3
        Enter B:
        4
        C = 5.0"

        "A^2 + B^2 = C^2
        Enter 1 if you have a and b
        Enter 2 if you have a and c
        2
        Enter A:
        3
        Enter C:
        5
        B = 4.0"

    Required files in your submission:
        - HW2.java that you have edited (NOT THE HW2.class)
*/

////// Do ASSIGNMENT BELLOW /////////

import java.util.Scanner;

public class HW2
{
    public static void main(String[] args)
    {
        System.out.println("\nA^2 + B^2 = C^2");
        System.out.println("Enter 1 if you have a and b");
        System.out.println("Enter 2 if you have a and c");

        //1: Create a new scanner object
        Scanner scanner = /**/;

        //2: Declare and get choice here
        /**/;

        //3: Test choice number entred
        if(/**/)
        {
            System.out.println("Enter A:");
            //4: get a
            int a = /**/;

            System.out.println("Enter B:");
            //5: get b
            int b = /**/;

            //6: caculate result
            double result = Math.sqrt(/**/);
            System.out.println("C = " + result);
        }
        else if(choice == 2)
        {
            System.out.println("Enter A:");
            //7: get a
            int a = /**/;

            System.out.println("Enter C:");
            //8: get c
            int c = /**/;

            //9: get calculate result
            double result = /**/;
            System.out.println("B = " + result);
        }
    }
}