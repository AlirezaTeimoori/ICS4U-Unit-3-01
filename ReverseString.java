
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

    // Intro variables:
    private String userInputString;
    private String reversedString = "";
    //private String temp;
    
    public static Scanner scanner = new Scanner(System.in);

    // Constructor:
    public ReverseString(String userInpuString) { 
        
        this.userInputString = userInpuString;
    }

    // reverseString() function gets a string and returns the reverse
    public String reverseString() {
        
        String thisString = this.userInputString;
        String revString  = this.reversedString;

        if ( thisString.length() > 1) {

            revString += thisString.charAt( thisString.length() - 1 );
            setRevString(revString);
            reverseString();

        } else {

            if ( thisString.length() == 0) { setRevString("Bad!"); }
            else if ( thisString.length() == 1) { setRevString(revString);; }

        }



        return this.reversedString;
    }
    
    // setRevString() sets the reversedString field:
    public void setRevString(String revString) {
        
        this.reversedString = revString;
    }

    public static void main(String[] args) {
        
        System.out.println("Hello and welcome! Please enter your String:\n");
        String userInput = scanner.nextLine();
        ReverseString reverseString = new ReverseString(userInput);
        reverseString.reverseString();
    }
}