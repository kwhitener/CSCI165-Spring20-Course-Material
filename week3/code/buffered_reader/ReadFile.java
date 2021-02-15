import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
 
public class ReadFile {
    public static void main(String[] args) {
        // are there any command line args? If so, process
        if(args.length > 0){                                // pass file name as command line arg
            Scanner keypress    = new Scanner(System.in);   // Scanner simply to consume keypress
            String fileName     = args[0];                  // grab command line arg
            String[] lines      = readLines(fileName);      // call static method

            for (String line : lines){                      // enhanced for loop traverses iterable collection
                System.out.println(line);
                System.out.println("\tPress enter to continue . . . ");
                keypress.nextLine();                        // consume key press
            }
            keypress.close();                               // close scanner
        }else System.out.println("No file to read");        // there were no command line args
    } // end main

    // statc method to read data from a file and return as a String array
    public static String[] readLines(String fileName) {       
        try{                                                              // readers throw exceptions
            ArrayList<String> lines     = new ArrayList<String>();        // create ArrayList to hold Strings           
            FileReader fileReader       = new FileReader(fileName);       // create character based stream
            BufferedReader buffReader   = new BufferedReader(fileReader); // read the stream
            String line = null;

            while ((line = buffReader.readLine()) != null)                // must test read input for null
                lines.add(line);                                          // add single line to ArrayList
                
            buffReader.close();                                           // close reader
            return lines.toArray(new String[lines.size()]);               // return as array
        }catch(IOException ioe){                                          // readers throw IOException
            System.out.println(ioe.getMessage());
        }
        return null;                                                      // something bad happened return null
    }// end readlines
} // end class