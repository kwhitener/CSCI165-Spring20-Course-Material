import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {

    public static void main(String args[]){
        // must use try/catch when connecting to a file
        try{
            //create File instance to reference text file name/path
            File text = new File("ScannerFile.txt");
        
            //Create Scanner instance to connect to the File object
            // pass File object into Scanner constructor to associate the two
            Scanner fileScanner = new Scanner(text);
        
            int lineNumber = 1;
            //Use boolean method hasNextLine to control a while loop
            //this method will return true if there is another line to read
            while(fileScanner.hasNextLine()){
                // nextLine extracts data and advances the cursor
                String line = fileScanner.nextLine();
                System.out.println("line " + lineNumber + ": " + line);
                lineNumber++;
            } 
            // close the scanner to prevent a resource leak
            fileScanner.close();
        } //end try
        catch(FileNotFoundException fnf){
            System.out.println("ERROR: FILE NOT FOUND!");
        } // end catch  
    }  // end main
} //end class



