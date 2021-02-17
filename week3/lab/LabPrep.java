import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// import java.io.*;

public class LabPrep{
    /*
        This program will combine the contents of the files

        1) ips.txt
        2) macs.txt

        into a new file whose name will be passed in as a command
        line argument
    */
    public static void main(String[] args) {
        String outputFile = args[0];
        try{
            // define File objects for each stream connection
            File ip_input  = new File("ips.txt");
            File mac_input = new File("macs.txt");
            File output    = new File(outputFile);

            // define Scanner objects for the input streams
            Scanner ip_scanner  = new Scanner(ip_input);
            Scanner mac_scanner = new Scanner(mac_input);

            // define a FileWriter object for the output stream
            FileWriter combined_output = new FileWriter(output);

            String ip_num       = "";
            String mac_address  = "";
            String combined     = "";

            // while loop based on contents of both files. Loop will exit
            // upon exhaustion of the shortest file
            while(ip_scanner.hasNext() && mac_scanner.hasNext()){
                ip_num      = ip_scanner.next(); // read single String token and advance the cursor
                mac_address = mac_scanner.next();// read single String token and advance the cursor
                combined    = ip_num + "\t => \t" + mac_address; // combine into single token
                combined_output.write(combined + "\n");      // write to output stream
            } // end while loop

            // CLOSE STREAMS
            combined_output.close();
            ip_scanner.close();
            mac_scanner.close();
        
        // Identfy if a file could not be opened
        }catch(FileNotFoundException fnfe){
            System.out.println("One of the files could not be opened");
        }
        // be careful with I/O operations
        catch (IOException ioe){
            System.out.println("There was a problem with an I/O operation");
        }
    }
}