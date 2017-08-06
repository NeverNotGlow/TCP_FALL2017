/*  
    Assignment: HW4 - Secret Message
    Author: [YOUR NAME]

    Note: To make this file easier to read, you can turn on/off wordwrap in VSCode by pressing ALT+Z.

    Description:
        In your fourth assignment, you will show me that you know how to encode and decode characters from ascii, Strings and ints. The program will take an initial number (0 for decoding, 1 for encoding) to determine if you are encoding or decoding. If encoding, it takes a String and outputs all the ascii character codes of that String separated by spaces. If you choose to decode you input the ascii codes of each character separated by spaces, and the original String is output.

    Steps:
        1) Fill in the missing sections of code indicated by comments bellow.

        2) Compile and run the program, and test it with a few different imputs.

        3) Upload to Moodle your modified version of this file.

    Example input and output cases:
        //I will use different test cases than these to grade. These test cases are so that you will know if your program is working or not.
       
        "0 to Decode, 1 to Encode
        1
        HELLO STUDENT
        72 69 76 76 79 32 83 84 85 68 69 78 84"

        "0 to Decode, 1 to Encode
        0
        72 69 76 76 79 32 83 84 85 68 69 78 84
        HELLO STUDENT"

        "0 to Decode, 1 to Encode
        0
        72 69 68 71 69 72 79 71 83 32 65 82 69 32 76 73 70 69
        HEDGEHOGS ARE LIFE"

    Required files in your submission:
        - HW4.java that you have edited (NOT THE HW4.class)
*/

////// Do ASSIGNMENT BELOW /////////

import java.util.Scanner;

public class HW4
{
    public static void main(String[] args)
    {        
        System.out.println("0 to Decode, 1 to Encode");

        Scanner sc = new Scanner(System.in);
        int answer = Integer.parseInt(sc.nextLine());

        String inputString = sc.nextLine();

        if(answer == 0)
        {
           /*1) Call decodeString and pass it inputString as a paramater*/
        }
        else
        {
           /*2) Call encodeString and pass it inputString as a paramater*/
        }
    }

    public static void encodeString(String stringToEncode)
    {
        while(stringToEncode.length() > 0)
        {
            char first = stringToEncode.charAt(0);
            stringToEncode = stringToEncode.substring(1);
            System.out.print(encodeChar(first) + " ");
        }
    }

    public static void decodeString(String stringToDecode)
    {
        String[] asciiValues =  /* 3) Use a function that turns a string into an array of strings split by a space. Look at the java doc.*/

        for (int i = 0; i < asciiValues.length; i++)
            System.out.print(decodeChar(asciiValues[i]));
    }

    public static char decodeChar(String input)
    {
        // 4) Decode the string into a int, then into a character.
        return /**/;
    }

    public static String encodeChar(char c)
    {
        // 5) Encode the character into an ascii value, then to a string.
        return /**/;
    }
}