import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class BufferedReaderDemo{

    public static void main(String[] args){

        // are there command line args?
        if(args.length > 0) {
            String fileName     = "";
            String line         = "";
            int chinaCount      = 0;
            fileName            = args[0];

            try {
                FileReader fileReader = new FileReader(fileName);        //create a file reader object
                BufferedReader bufferedReader = new BufferedReader(fileReader);     // Buffer the file reader
                while (true) {  // BufferedReader has no boolean control methods. Must break internally
                    line = bufferedReader.readLine();                   // read a line
                    if (line == null) break;                            // if the line is null break out of loop
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
                bufferedReader.close();                                 // close the resource           
            }catch(IOException ioe){
                System.out.println("There was a problem opening the file");
            }
        }else 
            System.out.println("No file specified . . . aborting");
    } // end main
} // end class


