/*
    Author:     Ken Whitener
    Program:    Democracy Simulation
    Started on: 7/4/1776
    Ending on:  Never
    Status:     Buggy and inoperable
    ================================
    ^ THIS IS A JOKE ^

    This program demonstrates "function" like structures in Java. The "static method"
    Static methods do not require an instance of the class to be created. You can simply
    call them from main. There is a reason for this and I promise we will get to it.

    Also shown is some very basic "javadoc" style commenting. More on this later.
*/ 

import java.util.Random; // for random numbers

public class LabPrep {

    public static void main(String[] args) {
        String codes    = "*BEA@FK%RM";         // KenSpeak code table
        String toCode   = "918273645";          // number to transliterate to KenSpeak
        String coded    = encode(codes, toCode);// call the encode method, passing the code table and number
        System.out.printf("%s coded to KenSPeak is %s\n\n", toCode, coded);  
        
        String characterSet = generateCodeTableCharacterSet();      // call method to create character set
        String codeTable    = generateRandomCodeTable(characterSet);// given the character set, generate a code table
        System.out.printf("Random KenSpeak code table %s\n\n",codeTable);

        coded = encode(codeTable, toCode);
        System.out.printf("%s coded to KenSPeak is %s\n\n", toCode, coded);  
        
    }

    /**
     * @param code the transliteration code table
     * @param number the number to transliterate
     * @return the encoded number as a String
     */
    public static String encode(String code, String number){

        String encoded = "";    // local variable                                        // variable to hold encoded result

        for(int index = 0; index < number.length(); ++index){           // iterate through the data to encode
            int digit = Character.getNumericValue(number.charAt(index));// get the char and convert it to the value it represents
            char codedDigit = code.charAt(digit);                       // plug the digit into the code table and grab the associated symbol      
            encoded += codedDigit;                                      // concatenate the symbol to the result string
        }

        return encoded;                                                 // return the encoded String
    }

    /**
     * @param none 
     * @return the character set to base the KenSpeak table on
     * @see <a href="https://cdn.sparkfun.com/assets/home_page_posts/2/1/2/1/ascii_table_black.png">ASCII</a>
     */
    public static String generateCodeTableCharacterSet(){
        String characterSet = "";

        // generate ASCII characters within a range.
        // take advantage of the ASCII values of individual characters
        // inspect the ASCII table to see the ranges.

        // anybody have any thoughts on how these strings are handled behind the scenes?
        for(int ascii = (int)'!'; ascii <= (int)'/'; ++ascii)   // ASCII '!'' through '/'
            characterSet += (char)ascii;
        
        for(int ascii = (int)':'; ascii <= (int)'`'; ++ascii)   // ASCII ':' through '`'
            characterSet += (char)ascii;

        for(int ascii = (int)'{'; ascii <= (int)'~'; ++ascii)   // ASCII '{' through '~'
            characterSet += (char)ascii;
        
        return characterSet;
    } 
    
    /**
     * @param characterSet the character set to build the code table from
     * @return the code table
     */
    public static String generateRandomCodeTable(String characterSet){
        /*
            Method will generate a random 10 character code table
        */
        String codeTable = "";
        Random random = new Random();                               // use the Random class to get a random integer

        while(codeTable.length() < 10){                             // want 10 unique characters from character set
            int randomIndex = random.nextInt(characterSet.length());// get a random number based on length of character set
            char candidateChar = characterSet.charAt(randomIndex);  // grab that char
            if(!codeTable.contains(String.valueOf(candidateChar)))  // see if it is already in the codeTable
                codeTable += candidateChar;                         // if not, add it to the code table
        }

        return codeTable;                                           // return code table
    }
}