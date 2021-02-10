/*
    Author: Ken Whitener
    Date: 2/8/2021
    Assignment: Lab on Java data and math
*/
public class LabPrep{

    public static void main(String[] args) {
        
        /* 
            process command line argument and convert to int
            let's assume the arg IS a number
            don't worry about testing the arg to see if it is numeric
        */

        // Use the static parseInt method from the Integer class
        int arg = Integer.parseInt(args[0]);
        // printf requires an explicit line break: \n
        System.out.printf("\nFirst argument: %d\n", arg);

        /*
            second arg is a phone number. Let's break it down
            using String methods. Research the API
        */
        
        String  phone   = args[1];                  // create a String object from arg
        int     dash    = phone.indexOf("-");       // find the dash
        String  prefix  = phone.substring(0, dash); // slice off the prefix
        String  line    = phone.substring(dash + 1, phone.length()); // slice off line number 

        // print the results
        System.out.println("\nSecond argument: " + phone);  // use println and concatenation. line break automatic
        System.out.printf("Prefix: %s\n", prefix);          // use printf and explicit line break
        System.out.printf("Line Number: %s\n", line);       // use printf and explicit line break
    }
}