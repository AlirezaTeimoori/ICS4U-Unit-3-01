
//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Apr 09 2019       --
//-- Created for:    Unit 3-01         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program takes a string and   --
//-- gives it back the reverse         --
//---------------------------------------

import java.util.Scanner;

public class ReverseString {

    // Instantiate scanner
    public static Scanner scanner = new Scanner(System.in);

    // reverseString() function gets a string and returns the reverse
    public static String reverseString(String thisString) {
        
        // Intro variables:
        String revString = "";

        if ( thisString.length() > 1) { // If the input is more than 1 character long :


            // Adds the last character of thisString to revString and sends the rest into the function recursively:
            revString += thisString.charAt(thisString.length()-1) + reverseString(thisString.substring(0, thisString.length()-1));

        } else { // If the input is 1 or less than 1 character long

            // Add the input to the result
            revString += thisString;

        }

        return revString;
    }
    

    public static void main(String[] args) { // Main function
        
        // Ask for and store data:
        System.out.println("Hello and welcome! Please enter your String:\n");
        String userInput = scanner.nextLine();

        // Output:
        System.out.println("user input is ==> " + userInput);
        System.out.println(reverseString(userInput));
        
    }
}