/*  
    Assignment: HW5 - Hacker
    Author: [YOUR NAME]

    Note: To make this file easier to read you can turn on/off wordwrap in VSCode by pressing ALT+Z.

    Description:
        In this assigment I need you to create a fully sentient AI that can be considered more powerful than a normal human... or you can hack into my grade book and just set your own grade, but you are going to need my username and password ;) 
        
        You have found that my HW5 gradebook website for HW5 is located at http://40.112.220.134/igb/ . Go to the website and hit the F12 key (you might need to hold the fn key while you hit the f12 key) - the source code for the website should appear (You should use Microsoft Edge). Now if you right-click on the username input box, and then choose 'Inspect element', you can see that I validate the username with a javascript function called checkUsername(). You can find that function by looking for a script tag in the source code of the website or by using the find function in the source code viewer. After that you should see my username written in a String literal.

        Since you have my username now, you can try a random password to get my password hint to come up. 

        Now comes the programming part. Use the code in this file to generate and test all passwords that meet my password hint until you find my password! Once you get it all you have left to do is set your own grade! (For the student text box use the format: [First Name] [Last Name])


    Steps:
        1) Look through the source code of http://40.112.220.134/igb/ to find my username.

        2) Look at the password hints to narrow down your search space for my password.

        3) Fill in the missing sections of code indicated by comments below.

        4) Compile and run the program.

        5) Set your own grade. For student use the format: [First Name] [Last Name] (example: Ian Glow)

        6) Upload to Moodle your modified version of this file.

    Required submission:
        - HW5.java that you have edited (NOT THE HW5.class)
        - My gradebook website to have an grade entry in it with your name

    Hints:
        - to generate the password attempts you can use nested for loops (probably 3 deep) or recursion
        - use return to break out of the function searchForPassword() when you find the answer so you don't continue searching after you find the answer or you could be waiting a long time
        - it should take a couple minutes to find the password. If it takes more than 10 minutes you are not using the information from the password serch to narrow down your search properly or you are not ending your search after you find the password.
*/

////// Do ASSIGNMENT BELOW /////////

import java.util.*;
import java.net.*;
import java.io.*;

public class HW5
{
    public static String url = "http://40.112.220.134/igb/";
    public static String username = /*TODO 1) Find my username in the source code of my website*/;
    public static String password;

    public static void main(String[] args) throws Exception 
    {
        searchForPassword();
    
        System.out.println("Username: " + username);
        System.out.println("Passsword: " + password);
    }

    public static void searchForPassword() throws Exception
    {
        /*
            TODO 2) Find the password by trying all eligible permutations using
            testPassword(String username, String password).
            Store the result in the static password variable and return.
        */ 
    }

    //Use this function to test the passwords you generate. It takes  
    //a bit of time because it downloads the whole website each time
    //returns true if the username and password are correct
    private static boolean testPassword(String username, String password) throws Exception 
    {
        System.out.println("Trying password: " + password);

        URL gradeUrl = new URL(url + "?username=" + username 
                                    + "&password=" + password);

        BufferedReader in = new BufferedReader(
        new InputStreamReader(gradeUrl.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
        {
            if (inputLine.contains("Right password"))
            {
                System.out.println("***** PASSWORD FOUND *****");
                return true;
            }
        }
        in.close();

        return false;
    }
}