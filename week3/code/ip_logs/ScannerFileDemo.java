import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;

public class ScannerFileDemo{

    public static void main(String[] args){

        // are there command line args?
        if(args.length > 0) {
            String fileName     = "";
            String line         = "";
            int chinaCount      = 0;
            fileName            = args[0];                              // get the file name from command line args

            try {
                FileReader fileReader       = new FileReader(fileName); // create a file reader object
                java.util.Scanner scanner   = new Scanner(fileReader);  // Scan the file reader
                scanner.useDelimiter(",");                              // have scanner use , as a delimiter

                while (scanner.hasNext()) {                             // use boolean method hasNext to control while loop     
                    line = scanner.nextLine();                          // read a line
                    String country = line.substring(line.length() - 2); //extract the country code
                    if(country.equals("CN")){                           // China? then extract the address
                        chinaCount++;
                        // extract ip address
                        String[] tokens = line.split(",");              // split on commas
                        String ip = tokens[1];                          // ip address is 2nd element
                        System.out.println(country + " " + ip);  
                    }
                }
                System.out.println("There were " + chinaCount + " ip addresses logged from China");
                scanner.close();                                        // close the resource           
            }catch(IOException ioe){
                System.out.println("There was a problem opening the file");
            }
        }else System.out.println("No file specified . . . aborting");
    } // end main
} // end class

