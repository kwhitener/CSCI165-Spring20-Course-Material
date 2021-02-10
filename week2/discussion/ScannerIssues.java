import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerIssues{

    public static void main(String[] args) {
        String  name    = "";   
        int     age     = 0;
        String  stonk   = "";
        double  value   = 0.0;

        try{                                        // must use exception handling when opening file
            File file = new File("data.txt");       // create a File instance
            Scanner scanner = new Scanner(file);    // Create a Scanner instance to scan the file

            while(scanner.hasNext()){               // while loop based on the presence of data in the stream
                name    = scanner.nextLine();   // nextLine reads entire line, including spaces.
                age     = scanner.nextInt();

                /*
                    you will need to add code here to manage scanning into the correct variables
                    The new line character(s) will trip you up. You will need to understand when this
                    will happen and add appropriate skip calls, or some other form of dealing with the
                    line terminators
                */

                // THIS CODE WILL ERROR UNTIL YOU FIX THIS
                System.out.printf();                // print the result here            
            } // end while

            scanner.close();                        // don't forget to close the scanner
            
        }catch(FileNotFoundException fnf){          // Exception may be thrown by file opening
            System.out.println("There was a problem opening the file");
        } // end catch
    } // end main
} // end class